package net.purejosh.pureores.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.registry.tag.ModBlockTags;
import net.purejosh.pureores.world.ModGameRules;

import java.util.Objects;

public class LonsdaleiteMeteoriteFeature extends Feature<DefaultFeatureConfig> {
    private static int passedAttempts = 0;
    private static int failedAttempts = 0;

    public LonsdaleiteMeteoriteFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {

        // Get the structure world access and the block position | Fun fact: BlockPos doesn't return the heightmap
        // block, it returns the block above it. This means your blockPos could be air, water, grass, any block
        // that's not solid. So when I'm checking the heightmap block, I'm actually checking blockPos.down().
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();

        // Check if the location is underwater
        if (structureWorldAccess.getBlockState(blockPos).isOf(Blocks.WATER)) {
            return false;
        }

        // Make sure the area below the proposed location is solid ground
        if (!structureWorldAccess.getBlockState(blockPos.down(11)).isIn(ModBlockTags.METEORITE_REPLACEABLE)) {
            return false;
        }

        BlockPos.Mutable mutablePos = new BlockPos.Mutable(); // Use a mutable position for efficiency

        // Iterate over a 5x2x5 area centered -2/-3 below blockPos to ensure flatness of generation area
        for (int xOffset = -2; xOffset <= 2; xOffset++) {
            for (int zOffset = -2; zOffset <= 2; zOffset++) {
                // Check the layer at -2
                mutablePos.set(blockPos.getX() + xOffset, blockPos.getY() - 2, blockPos.getZ() + zOffset);
                if (!structureWorldAccess.getBlockState(mutablePos).isIn(ModBlockTags.METEORITE_REPLACEABLE)) {
                    return false; // Exit if any block at -2 is invalid
                }

                // Check the layer at -3
                mutablePos.set(blockPos.getX() + xOffset, blockPos.getY() - 3, blockPos.getZ() + zOffset);
                if (!structureWorldAccess.getBlockState(mutablePos).isIn(ModBlockTags.METEORITE_REPLACEABLE)) {
                    return false; // Exit if any block at -3 is invalid
                }
            }
        }

        // Now that we've validated the area, check the generation chance gamerule. | Note: I'm checking some methods that
        // always return non-null or have AutoCloseable, so wrapping them in an Objects.requireNonNull() is unnecessary,
        // however IntelliJ wouldn't stop complaining that this could cause an NPE or resource leak.
        MinecraftServer server = context.getWorld().getServer();
        int oreGenerationChance = Objects.requireNonNull(server).getGameRules().getInt(ModGameRules.LONSDALEITE_METEORITE_GEN);
        Random random = context.getRandom();

        // Check the chances for meteor generation. Here is where I increment passedAttempts and failedAttempts,
        // which can be tracked using the debug commands in-game by OP players.
        if (random.nextInt(100) >= oreGenerationChance) {
            failedAttempts++;
            return false;
        } else {
            passedAttempts++;
        }

        // Safely retrieve the StructureTemplateManager from the server
        StructureTemplateManager templateManager = Objects.requireNonNull(structureWorldAccess.toServerWorld()).getServer().getStructureTemplateManager();

        // Load the meteorite structure
        StructureTemplate template = templateManager.getTemplateOrBlank(Identifier.of("pureores", "lonsdaleite_meteorite"));

        // Adjust the position to center the meteorite below the blockPos checked location
        BlockPos placementPos = blockPos.add(-11, -11, -11);

        // Create placement settings
        StructurePlacementData placementData = new StructurePlacementData();

        // Place the structure in the world
        template.place(structureWorldAccess, placementPos, placementPos, placementData, context.getRandom(), 2);

        // Simulate degradation and meteor impact effects
        Random chance = context.getRandom();
        BlockPos.Mutable scanPos = new BlockPos.Mutable();
        int radius = 10; // The radius of the X/Z "circle"

        // Scan within ±radius blocks on the X/Z axes and -8 blocks on the Y-axis
        for (int xOffset = -radius; xOffset <= radius; xOffset++) {
            for (int zOffset = -radius; zOffset <= radius; zOffset++) {
                for (int yOffset = -8; yOffset <= 0; yOffset++) {
                    // Calculate the distance from the center (blockPos)
                    double distance = Math.sqrt(xOffset * xOffset + zOffset * zOffset);

                    // Ensure the block is within the radius (technically, this is a cylinder, but...)
                    if (distance <= radius) {
                        scanPos.set(blockPos.getX() + xOffset, blockPos.getY() + yOffset, blockPos.getZ() + zOffset);

                        // Check if the block is in the METEORITE_REPLACEABLE tag and has air above it
                        if (structureWorldAccess.getBlockState(scanPos).isIn(ModBlockTags.METEORITE_REPLACEABLE) &&
                                structureWorldAccess.getBlockState(scanPos.up()).isAir()) {

                            // 30% chance to replace with air (degradation)
                            if (chance.nextFloat() < 0.3) {
                                structureWorldAccess.setBlockState(scanPos, Blocks.AIR.getDefaultState(), 2);
                            }

                            // 20% chance to replace with magma and place fire above (meteor impact)
                            if (chance.nextFloat() < 0.2) {
                                structureWorldAccess.setBlockState(scanPos, Blocks.MAGMA_BLOCK.getDefaultState(), 2);
                                structureWorldAccess.setBlockState(scanPos.up(), Blocks.FIRE.getDefaultState(), 2);
                            }
                        }

                        // Check if it's a LONSDALEITE_METEORITE block
                        if (structureWorldAccess.getBlockState(scanPos).isOf(ModBlocks.LONSDALEITE_METEORITE) &&
                                structureWorldAccess.getBlockState(scanPos.up()).isAir()) {

                            // 20% chance to place fire on top (meteor impact)
                            if (chance.nextFloat() < 0.2) {
                                structureWorldAccess.setBlockState(scanPos.up(), Blocks.FIRE.getDefaultState(), 2);
                            }
                        }
                    }
                }
            }
        }
        return true; // Indicate successful placement
    }

    // Method to get the number of passed attempts
    public static int getPassedAttempts() {
        return passedAttempts;
    }

    // Method to get the number of failed attempts
    public static int getFailedAttempts() {
        return failedAttempts;
    }

    // Method to reset the counters
    public static void resetCounters() {
        passedAttempts = 0;
        failedAttempts = 0;
    }
}