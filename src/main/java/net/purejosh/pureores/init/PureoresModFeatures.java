
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureores.init;

import net.purejosh.pureores.world.features.ores.SapphireOreFeature;
import net.purejosh.pureores.world.features.ores.NetherFireOpalOreFeature;
import net.purejosh.pureores.world.features.ores.MoonstoneOreFeature;
import net.purejosh.pureores.world.features.ores.JadeiteOreFeature;
import net.purejosh.pureores.world.features.ores.EndAmetrineOreFeature;
import net.purejosh.pureores.world.features.ores.DeepslateBlackDiamondOreFeature;
import net.purejosh.pureores.world.features.ores.ChrysoberylOreFeature;
import net.purejosh.pureores.world.features.SerpentiniteFeatureFeature;
import net.purejosh.pureores.world.features.MicaSchistFeatureFeature;
import net.purejosh.pureores.world.features.MicaSchistCalciteAddFeatureFeature;
import net.purejosh.pureores.world.features.LonsdaleiteMeteoriteSmallFeature;
import net.purejosh.pureores.world.features.LonsdaleiteMeteoriteFeature;
import net.purejosh.pureores.PureoresMod;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class PureoresModFeatures {
	public static void load() {
		register("moonstone_ore", new MoonstoneOreFeature(), MoonstoneOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("nether_fire_opal_ore", new NetherFireOpalOreFeature(), NetherFireOpalOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("jadeite_ore", new JadeiteOreFeature(), JadeiteOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("end_ametrine_ore", new EndAmetrineOreFeature(), EndAmetrineOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("chrysoberyl_ore", new ChrysoberylOreFeature(), ChrysoberylOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("sapphire_ore", new SapphireOreFeature(), SapphireOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("deepslate_black_diamond_ore", new DeepslateBlackDiamondOreFeature(), DeepslateBlackDiamondOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lonsdaleite_meteorite", new LonsdaleiteMeteoriteFeature(), LonsdaleiteMeteoriteFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("lonsdaleite_meteorite_small", new LonsdaleiteMeteoriteSmallFeature(), LonsdaleiteMeteoriteSmallFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("mica_schist_feature", new MicaSchistFeatureFeature(), MicaSchistFeatureFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("mica_schist_calcite_add_feature", new MicaSchistCalciteAddFeatureFeature(), MicaSchistCalciteAddFeatureFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("serpentinite_feature", new SerpentiniteFeatureFeature(), SerpentiniteFeatureFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(PureoresMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(PureoresMod.MODID, registryName)));
	}
}
