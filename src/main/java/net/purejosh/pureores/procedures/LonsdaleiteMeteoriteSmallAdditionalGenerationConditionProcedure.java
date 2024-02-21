package net.purejosh.pureores.procedures;

import net.purejosh.pureores.init.PureoresModGameRules;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class LonsdaleiteMeteoriteSmallAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 0, 99) < (world.getLevelData().getGameRules().getInt(PureoresModGameRules.PURE_ORES_LONSDALEITE_SMALL_GENERATION_CHANCE))) {
			if ((world.getBlockState(BlockPos.containing(x + 7, y + 7, z + 7))).is(TagKey.create(Registries.BLOCK, new ResourceLocation("pureores:lonsdaleite_meteorite_replaceable")))) {
				return true;
			}
			return false;
		}
		return false;
	}
}
