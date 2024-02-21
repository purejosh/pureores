
package net.purejosh.pureores.world.features.ores;

import net.purejosh.pureores.procedures.NetherFireOpalOreAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;
import java.util.Set;

public class NetherFireOpalOreFeature extends OreFeature {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER);
	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	public NetherFireOpalOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!NetherFireOpalOreAdditionalGenerationConditionProcedure.execute(world))
			return false;
		return super.place(context);
	}
}