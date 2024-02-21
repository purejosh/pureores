
package net.purejosh.pureores.world.features;

import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteOnStructureInstanceGeneratedProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;
import java.util.Set;
import java.util.List;

public class LonsdaleiteMeteoriteFeature extends Feature<NoneFeatureConfiguration> {
	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public LonsdaleiteMeteoriteFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(Blocks.MYCELIUM, Blocks.STONE, Blocks.ROOTED_DIRT, Blocks.RED_SAND, Blocks.GRASS_BLOCK, Blocks.POWDER_SNOW, Blocks.SANDSTONE, Blocks.TERRACOTTA, Blocks.BROWN_TERRACOTTA, Blocks.COARSE_DIRT, Blocks.SNOW,
				Blocks.SNOW_BLOCK, Blocks.GRAVEL, Blocks.DIRT, Blocks.PODZOL, Blocks.DIRT_PATH, Blocks.SAND, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.RED_SANDSTONE);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("pureores", "lonsdaleite_meteorite"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 4000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + -9, j + -8, k + -9);
				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				if (!LonsdaleiteMeteoriteAdditionalGenerationConditionProcedure.execute(world, x, y, z))
					continue;
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {

					LonsdaleiteMeteoriteOnStructureInstanceGeneratedProcedure.execute(world, x, y, z);
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
