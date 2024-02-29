
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureores.init;

import net.minecraft.world.level.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class PureoresModGameRules {
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_LONSDALEITE_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_MOONSTONE_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_AMETRINE_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_BLACK_DIAMOND_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_FIRE_OPAL_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_SAPPHIRE_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_JADEITITE_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_LONSDALEITE_SMALL_GENERATION_CHANCE;
	public static GameRules.Key<GameRules.IntegerValue> PURE_ORES_CHRYSOBERYL_GENERATION_CHANCE;

	public static void load() {
		PURE_ORES_LONSDALEITE_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_lonsdaleite_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(50));
		PURE_ORES_MOONSTONE_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_moonstone_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
		PURE_ORES_AMETRINE_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_ametrine_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
		PURE_ORES_BLACK_DIAMOND_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_black_diamond_generation_chance", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(100));
		PURE_ORES_FIRE_OPAL_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_fire_opal_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
		PURE_ORES_SAPPHIRE_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_sapphire_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
		PURE_ORES_JADEITITE_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_jadeitite_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
		PURE_ORES_LONSDALEITE_SMALL_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_lonsdaleite_small_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(0));
		PURE_ORES_CHRYSOBERYL_GENERATION_CHANCE = GameRuleRegistry.register("pure_ores_chrysoberyl_generation_chance", GameRules.Category.MISC, GameRuleFactory.createIntRule(100));
	}
}
