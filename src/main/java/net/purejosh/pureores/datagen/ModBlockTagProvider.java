package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.registry.tag.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOONSTONE_ORE)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.JADEITE_ORE)
                .add(ModBlocks.END_AMETRINE_ORE)
                .add(ModBlocks.CHRYSOBERYL_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE)
                .add(ModBlocks.LONSDALEITE_ORE)
                .add(ModBlocks.MOONSTONE_BLOCK)
                .add(ModBlocks.FIRE_OPAL_BLOCK)
                .add(ModBlocks.JADEITE_BLOCK)
                .add(ModBlocks.AMETRINE_BLOCK)
                .add(ModBlocks.CHRYSOBERYL_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.BLACK_DIAMOND_BLOCK)
                .add(ModBlocks.LONSDALEITE_BLOCK)
                .add(ModBlocks.SERPENTINITE)
                .add(ModBlocks.SERPENTINITE_STAIRS)
                .add(ModBlocks.SERPENTINITE_SLAB)
                .add(ModBlocks.SERPENTINITE_WALL)
                .add(ModBlocks.POLISHED_SERPENTINITE)
                .add(ModBlocks.POLISHED_SERPENTINITE_STAIRS)
                .add(ModBlocks.POLISHED_SERPENTINITE_SLAB)
                .add(ModBlocks.POLISHED_SERPENTINITE_WALL)
                .add(ModBlocks.SERPENTINITE_BRICKS)
                .add(ModBlocks.SERPENTINITE_BRICK_STAIRS)
                .add(ModBlocks.SERPENTINITE_BRICK_SLAB)
                .add(ModBlocks.SERPENTINITE_BRICK_WALL)
                .add(ModBlocks.MICA_SCHIST)
                .add(ModBlocks.MICA_SCHIST_STAIRS)
                .add(ModBlocks.MICA_SCHIST_SLAB)
                .add(ModBlocks.MICA_SCHIST_WALL)
                .add(ModBlocks.POLISHED_MICA_SCHIST)
                .add(ModBlocks.POLISHED_MICA_SCHIST_STAIRS)
                .add(ModBlocks.POLISHED_MICA_SCHIST_SLAB)
                .add(ModBlocks.POLISHED_MICA_SCHIST_WALL)
                .add(ModBlocks.MICA_SCHIST_BRICKS)
                .add(ModBlocks.MICA_SCHIST_BRICK_STAIRS)
                .add(ModBlocks.MICA_SCHIST_BRICK_SLAB)
                .add(ModBlocks.MICA_SCHIST_BRICK_WALL)
                .add(ModBlocks.LONSDALEITE_METEORITE)
                .add(ModBlocks.LONSDALEITE_METEORITE_STAIRS)
                .add(ModBlocks.LONSDALEITE_METEORITE_SLAB)
                .add(ModBlocks.LONSDALEITE_METEORITE_WALL)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICKS)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOONSTONE_ORE)
                .add(ModBlocks.MOONSTONE_BLOCK)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.FIRE_OPAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SERPENTINITE)
                .add(ModBlocks.SERPENTINITE_STAIRS)
                .add(ModBlocks.SERPENTINITE_SLAB)
                .add(ModBlocks.SERPENTINITE_WALL)
                .add(ModBlocks.POLISHED_SERPENTINITE)
                .add(ModBlocks.POLISHED_SERPENTINITE_STAIRS)
                .add(ModBlocks.POLISHED_SERPENTINITE_SLAB)
                .add(ModBlocks.POLISHED_SERPENTINITE_WALL)
                .add(ModBlocks.SERPENTINITE_BRICKS)
                .add(ModBlocks.SERPENTINITE_BRICK_STAIRS)
                .add(ModBlocks.SERPENTINITE_BRICK_SLAB)
                .add(ModBlocks.SERPENTINITE_BRICK_WALL)
                .add(ModBlocks.MICA_SCHIST)
                .add(ModBlocks.MICA_SCHIST_STAIRS)
                .add(ModBlocks.MICA_SCHIST_SLAB)
                .add(ModBlocks.MICA_SCHIST_WALL)
                .add(ModBlocks.POLISHED_MICA_SCHIST)
                .add(ModBlocks.POLISHED_MICA_SCHIST_STAIRS)
                .add(ModBlocks.POLISHED_MICA_SCHIST_SLAB)
                .add(ModBlocks.POLISHED_MICA_SCHIST_WALL)
                .add(ModBlocks.MICA_SCHIST_BRICKS)
                .add(ModBlocks.MICA_SCHIST_BRICK_STAIRS)
                .add(ModBlocks.MICA_SCHIST_BRICK_SLAB)
                .add(ModBlocks.MICA_SCHIST_BRICK_WALL)
                .add(ModBlocks.JADEITE_ORE)
                .add(ModBlocks.JADEITE_BLOCK)
                .add(ModBlocks.END_AMETRINE_ORE)
                .add(ModBlocks.AMETRINE_BLOCK)
                .add(ModBlocks.CHRYSOBERYL_ORE)
                .add(ModBlocks.CHRYSOBERYL_BLOCK)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE)
                .add(ModBlocks.BLACK_DIAMOND_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.MOONSTONE_BLOCK)
                .add(ModBlocks.FIRE_OPAL_BLOCK)
                .add(ModBlocks.JADEITE_BLOCK)
                .add(ModBlocks.AMETRINE_BLOCK)
                .add(ModBlocks.CHRYSOBERYL_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.BLACK_DIAMOND_BLOCK)
                .add(ModBlocks.LONSDALEITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.LONSDALEITE_ORE)
                .add(ModBlocks.LONSDALEITE_METEORITE)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICKS);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.LONSDALEITE_ORE)
                .add(ModBlocks.LONSDALEITE_METEORITE)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICKS);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_END)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.LONSDALEITE_ORE)
                .add(ModBlocks.LONSDALEITE_METEORITE)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICKS);

        getOrCreateTagBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
                .add(ModBlocks.MOONSTONE_ORE)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.JADEITE_ORE)
                .add(ModBlocks.END_AMETRINE_ORE)
                .add(ModBlocks.CHRYSOBERYL_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE)
                .add(ModBlocks.LONSDALEITE_ORE)
                .add(ModBlocks.SERPENTINITE)
                .add(ModBlocks.MICA_SCHIST)
                .add(ModBlocks.LONSDALEITE_METEORITE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SERPENTINITE_WALL)
                .add(ModBlocks.POLISHED_SERPENTINITE_WALL)
                .add(ModBlocks.SERPENTINITE_BRICK_WALL)
                .add(ModBlocks.MICA_SCHIST_WALL)
                .add(ModBlocks.POLISHED_MICA_SCHIST_WALL)
                .add(ModBlocks.MICA_SCHIST_BRICK_WALL)
                .add(ModBlocks.LONSDALEITE_METEORITE_WALL)
                .add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL)
                .add(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);

        getOrCreateTagBuilder(ModBlockTags.METEORITE_REPLACEABLE)
                .add(Blocks.ANDESITE)
                .add(Blocks.BROWN_TERRACOTTA)
                .add(Blocks.COAL_ORE)
                .add(Blocks.COARSE_DIRT)
                .add(Blocks.COPPER_ORE)
                .add(Blocks.DIORITE)
                .add(Blocks.DIRT)
                .add(Blocks.DIRT_PATH)
                .add(Blocks.GRANITE)
                .add(Blocks.GRASS_BLOCK)
                .add(Blocks.GRAVEL)
                .add(Blocks.IRON_ORE)
                .add(Blocks.MYCELIUM)
                .add(Blocks.PODZOL)
                .add(Blocks.POWDER_SNOW)
                .add(Blocks.RED_SAND)
                .add(Blocks.RED_SANDSTONE)
                .add(Blocks.ROOTED_DIRT)
                .add(Blocks.SAND)
                .add(Blocks.SANDSTONE)
                .add(Blocks.SNOW)
                .add(Blocks.SNOW_BLOCK)
                .add(Blocks.STONE)
                .add(Blocks.TERRACOTTA);

        getOrCreateTagBuilder(ConventionalBlockTags.ORES)
                .add(ModBlocks.MOONSTONE_ORE)
                .add(ModBlocks.NETHER_FIRE_OPAL_ORE)
                .add(ModBlocks.JADEITE_ORE)
                .add(ModBlocks.END_AMETRINE_ORE)
                .add(ModBlocks.CHRYSOBERYL_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE)
                .add(ModBlocks.LONSDALEITE_ORE);

        getOrCreateTagBuilder(ConventionalBlockTags.STORAGE_BLOCKS)
                .add(ModBlocks.MOONSTONE_BLOCK)
                .add(ModBlocks.FIRE_OPAL_BLOCK)
                .add(ModBlocks.JADEITE_BLOCK)
                .add(ModBlocks.AMETRINE_BLOCK)
                .add(ModBlocks.CHRYSOBERYL_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.BLACK_DIAMOND_BLOCK)
                .add(ModBlocks.LONSDALEITE_BLOCK);
    }
}
