package net.purejosh.pureores.world.gen.feature;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.purejosh.pureores.PureOres;
import net.purejosh.pureores.block.ModBlocks;

import java.util.List;

public class ModOreConfiguredFeatures {

    // RegistryKey for the configured feature.  This is how the game identifies and references this feature.
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MOONSTONE = registerKey("ore_moonstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_FIRE_OPAL = registerKey("ore_fire_opal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_JADEITE = registerKey("ore_jadeite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_AMETRINE = registerKey("ore_ametrine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_CHRYSOBERYL = registerKey("ore_chrysoberyl");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_SAPPHIRE = registerKey("ore_sapphire");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_BLACK_DIAMOND = registerKey("ore_black_diamond");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_SERPENTINITE = registerKey("ore_serpentinite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MICA_SCHIST = registerKey("ore_mica_schist");
    public static final RegistryKey<ConfiguredFeature<?, ?>> METEORITE_LONSDALEITE = registerKey("meteorite_lonsdaleite");

    // This method is called to register the configured features.
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {

        // RuleTests define where the ore can generate. These are recalled in the OreFeatureConfig list.
        RuleTest overworldReplaceable = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);
        //RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        //RuleTest deepslateReplaceable = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceable = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest endReplaceable = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest dioriteReplaceable = new BlockMatchRuleTest(Blocks.DIORITE);
        RuleTest serpentiniteReplaceable = new BlockMatchRuleTest(ModBlocks.SERPENTINITE);
        RuleTest micaSchistReplaceable = new BlockMatchRuleTest(ModBlocks.MICA_SCHIST);
        RuleTest deepslateOnlyReplaceable = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest gravelReplaceable = new BlockMatchRuleTest(Blocks.GRAVEL);


        // Creates a list containing the target replaceable block and what type of ore to generate
        List<OreFeatureConfig.Target> moonstoneOre = List.of(OreFeatureConfig.createTarget(dioriteReplaceable, ModBlocks.MOONSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> fireOpalOre = List.of(OreFeatureConfig.createTarget(netherReplaceable, ModBlocks.NETHER_FIRE_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> jadeiteOres = List.of(OreFeatureConfig.createTarget(serpentiniteReplaceable, ModBlocks.JADEITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> ametrineOre = List.of(OreFeatureConfig.createTarget(endReplaceable, ModBlocks.END_AMETRINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> chrysoberylOre = List.of(OreFeatureConfig.createTarget(micaSchistReplaceable, ModBlocks.CHRYSOBERYL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> sapphireOre = List.of(OreFeatureConfig.createTarget(deepslateOnlyReplaceable, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> blackDiamondOre = List.of(OreFeatureConfig.createTarget(gravelReplaceable, ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> serpentiniteBlob = List.of(OreFeatureConfig.createTarget(overworldReplaceable, ModBlocks.SERPENTINITE.getDefaultState()));
        List<OreFeatureConfig.Target> micaSchistBlob = List.of(OreFeatureConfig.createTarget(overworldReplaceable, ModBlocks.MICA_SCHIST.getDefaultState()));

        // This registers the configured feature, associates it with the OreFeatureConfig list, and determines the generation size and air discard chance.
        register(featureRegisterable, ORE_MOONSTONE, ModFeature.MOONSTONE_ORE, new OreFeatureConfig(moonstoneOre, 14));
        register(featureRegisterable, ORE_FIRE_OPAL, ModFeature.FIRE_OPAL_ORE, new OreFeatureConfig(fireOpalOre, 10));
        register(featureRegisterable, ORE_JADEITE, ModFeature.JADEITE_ORE, new OreFeatureConfig(jadeiteOres, 14));
        register(featureRegisterable, ORE_AMETRINE, ModFeature.AMETRINE_ORE, new OreFeatureConfig(ametrineOre, 10));
        register(featureRegisterable, ORE_CHRYSOBERYL, ModFeature.CHRYSOBERYL_ORE, new OreFeatureConfig(chrysoberylOre, 14));
        register(featureRegisterable, ORE_SAPPHIRE, ModFeature.SAPPHIRE_ORE, new OreFeatureConfig(sapphireOre, 10));
        register(featureRegisterable, ORE_BLACK_DIAMOND, ModFeature.BLACK_DIAMOND_ORE, new OreFeatureConfig(blackDiamondOre, 10));
        register(featureRegisterable, ORE_SERPENTINITE, Feature.ORE, new OreFeatureConfig(serpentiniteBlob, 61));
        register(featureRegisterable, ORE_MICA_SCHIST, Feature.ORE, new OreFeatureConfig(micaSchistBlob, 61));
        register(featureRegisterable, METEORITE_LONSDALEITE, ModFeature.METEORITE_LONSDALEITE, new DefaultFeatureConfig());
    }

    // Helper method to register the key. Code deduplication for the RegistryKey registration.
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(PureOres.MOD_ID, name));
    }

    // Placeholder for the actual register method.
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                      RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}