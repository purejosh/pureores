package net.purejosh.pureores.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.purejosh.pureores.world.gen.feature.ModOrePlacedFeatures;

public class ModBiomeModification {
    public static void generateOres() {
        // I'm generating the overworld ores in the UNDERGROUND_DECORATION step because that one step after UNDERGROUND_ORES, which is when
        // diorite and granite is generated. This is important, so I can actually target those blocks for replacement.
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModOrePlacedFeatures.ORE_MOONSTONE);
        // Nether and End ores are generated in the UNDERGROUND_ORES step, because the base blocks are present in a much earlier step.
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_FIRE_OPAL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModOrePlacedFeatures.ORE_JADEITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_AMETRINE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModOrePlacedFeatures.ORE_CHRYSOBERYL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModOrePlacedFeatures.ORE_SAPPHIRE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModOrePlacedFeatures.ORE_BLACK_DIAMOND);
        // Serpentinite is generated in the same step as diorite and granite. This is so it can be generated before Jadeite comes in.
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_SERPENTINITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_MICA_SCHIST);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModOrePlacedFeatures.METEORITE_LONSDALEITE);
    }
}
