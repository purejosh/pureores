package net.purejosh.pureores.procedures;

import net.purejosh.pureores.init.PureoresModGameRules;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class NetherFireOpalOreAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (Mth.nextInt(RandomSource.create(), 0, 99) < (world.getLevelData().getGameRules().getInt(PureoresModGameRules.PURE_ORES_FIRE_OPAL_GENERATION_CHANCE))) {
			return true;
		}
		return false;
	}
}
