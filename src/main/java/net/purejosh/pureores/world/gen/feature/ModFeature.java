package net.purejosh.pureores.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.purejosh.pureores.PureOres;

public abstract class ModFeature<T extends FeatureConfig> extends Feature<T> {

    // Registers the feature type to the registry.
    public static final Feature<OreFeatureConfig> MOONSTONE_ORE = register("moonstone_ore", new MoonstoneOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> FIRE_OPAL_ORE = register("fire_opal_ore", new FireOpalOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> JADEITE_ORE = register("jadeite_ore", new JadeiteOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> AMETRINE_ORE = register("ametrine_ore", new AmetrineOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> CHRYSOBERYL_ORE = register("chrysoberyl_ore", new ChrysoberylOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> SAPPHIRE_ORE = register("sapphire_ore", new SapphireOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<OreFeatureConfig> BLACK_DIAMOND_ORE = register("black_diamond_ore", new BlackDiamondOreFeature(OreFeatureConfig.CODEC));
    public static final Feature<DefaultFeatureConfig> METEORITE_LONSDALEITE = register("meteorite_lonsdaleite", new LonsdaleiteMeteoriteFeature(DefaultFeatureConfig.CODEC));

    // Helper method to parse the register statement above.
    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        Identifier id = Identifier.of(PureOres.MOD_ID, name);
        return Registry.register(Registries.FEATURE, id, feature);
    }

    public ModFeature(Codec<T> configCodec) {
        super(configCodec);
    }

    // Class initializer called from the entrypoint.
    public static void init() {

    }
}
