package net.purejosh.pureores.world;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRules {

    public static final GameRules.Key<GameRules.IntRule> MOONSTONE_ORE_GEN = GameRuleRegistry.register("pureOresMoonstoneOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> FIRE_OPAL_ORE_GEN = GameRuleRegistry.register("pureOresFireOpalOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> JADEITE_ORE_GEN = GameRuleRegistry.register("pureOresJadeiteOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> AMETRINE_ORE_GEN = GameRuleRegistry.register("pureOresAmetrineOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> CHRYSOBERYL_ORE_GEN = GameRuleRegistry.register("pureOresChrysoberylOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> SAPPHIRE_ORE_GEN = GameRuleRegistry.register("pureOresSapphireOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> BLACK_DIAMOND_ORE_GEN = GameRuleRegistry.register("pureOresBlackDiamondOreGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
    public static final GameRules.Key<GameRules.IntRule> LONSDALEITE_METEORITE_GEN = GameRuleRegistry.register("pureOresLonsdaleiteMeteoriteGen", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));

    public static void init() {
    }
}
