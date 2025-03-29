package net.purejosh.pureores.world.gen.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.purejosh.pureores.PureOres;

import java.util.List;

public class ModOrePlacedFeatures {

    // Register keys for different ore features
    public static final RegistryKey<PlacedFeature> ORE_MOONSTONE = registerKey("ore_moonstone");
    public static final RegistryKey<PlacedFeature> ORE_FIRE_OPAL = registerKey("ore_fire_opal");
    public static final RegistryKey<PlacedFeature> ORE_JADEITE = registerKey("ore_jadeite");
    public static final RegistryKey<PlacedFeature> ORE_AMETRINE = registerKey("ore_ametrine");
    public static final RegistryKey<PlacedFeature> ORE_CHRYSOBERYL = registerKey("ore_chrysoberyl");
    public static final RegistryKey<PlacedFeature> ORE_SAPPHIRE = registerKey("ore_sapphire");
    public static final RegistryKey<PlacedFeature> ORE_BLACK_DIAMOND = registerKey("ore_black_diamond");
    public static final RegistryKey<PlacedFeature> ORE_SERPENTINITE = registerKey("ore_serpentinite");
    public static final RegistryKey<PlacedFeature> ORE_MICA_SCHIST = registerKey("ore_mica_schist");
    public static final RegistryKey<PlacedFeature> METEORITE_LONSDALEITE = registerKey("meteorite_lonsdaleite");


    // Helper method to create a List of PlacementModifiers.
    // The vanilla methods are private. Used to be in its own class, but should be fine here.
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    // Method to register ore placement features
    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {

        // Lookup registry entries for configured features
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry01 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_MOONSTONE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry02 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_FIRE_OPAL);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry03 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_JADEITE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry04 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_AMETRINE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry05 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_CHRYSOBERYL);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry06 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_SAPPHIRE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry07 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_BLACK_DIAMOND);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry08 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_SERPENTINITE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry09 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_MICA_SCHIST);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry10 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.METEORITE_LONSDALEITE);

        // Register placed features with specific placement modifiers
        PlacedFeatures.register(featureRegisterable, ORE_MOONSTONE, registryEntry01, modifiersWithCount(48, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(60))));
        PlacedFeatures.register(featureRegisterable, ORE_FIRE_OPAL, registryEntry02, modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(80))));
        PlacedFeatures.register(featureRegisterable, ORE_JADEITE, registryEntry03, modifiersWithCount(41, HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(40))));
        PlacedFeatures.register(featureRegisterable, ORE_AMETRINE, registryEntry04, modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(48), YOffset.fixed(72))));
        PlacedFeatures.register(featureRegisterable, ORE_CHRYSOBERYL, registryEntry05, modifiersWithCount(37, HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(20))));
        PlacedFeatures.register(featureRegisterable, ORE_SAPPHIRE, registryEntry06, modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(0))));
        PlacedFeatures.register(featureRegisterable, ORE_BLACK_DIAMOND, registryEntry07, modifiersWithCount(50, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-40))));
        PlacedFeatures.register(featureRegisterable, ORE_SERPENTINITE, registryEntry08, modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(40))));
        PlacedFeatures.register(featureRegisterable, ORE_MICA_SCHIST, registryEntry09, modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(20))));
        PlacedFeatures.register(featureRegisterable, METEORITE_LONSDALEITE, registryEntry10, modifiersWithRarity(280, HeightmapPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG)));
    }

    // Helper method to create a RegistryKey for the placed feature, using registerKey at the top. Needed to assign the mod's ID.
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(PureOres.MOD_ID, name));
    }
}
