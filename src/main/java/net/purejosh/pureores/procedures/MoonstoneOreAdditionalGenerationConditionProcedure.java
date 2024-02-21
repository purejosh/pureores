package net.purejosh.pureores.procedures;

import net.purejosh.pureores.init.PureoresModGameRules;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class MoonstoneOreAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		BlockState neighborBlock = Blocks.AIR.defaultBlockState();
		if (Mth.nextInt(RandomSource.create(), 0, 99) < (world.getLevelData().getGameRules().getInt(PureoresModGameRules.PURE_ORES_MOONSTONE_GENERATION_CHANCE))) {
			return true;
		}
		return false;
	}
}
