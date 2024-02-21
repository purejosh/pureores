package net.purejosh.pureores.procedures;

import net.purejosh.pureores.init.PureoresModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class LonsdaleiteMeteoriteSmallOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sequence_y = 0;
		double random_x = 0;
		double random_z = 0;
		boolean trying_y = false;
		for (int index0 = 0; index0 < 20; index0++) {
			sequence_y = 4;
			random_x = Mth.nextInt(RandomSource.create(), 2, 12);
			random_z = Mth.nextInt(RandomSource.create(), 2, 12);
			trying_y = true;
			while (trying_y == true) {
				if ((world.getBlockState(BlockPos.containing(x + random_x, y + sequence_y, z + random_z))).is(TagKey.create(Registries.BLOCK, new ResourceLocation("pureores:lonsdaleite_meteorite_replaceable")))) {
					world.setBlock(BlockPos.containing(x + random_x, y + sequence_y, z + random_z), Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + random_x, y + sequence_y + 1, z + random_z), Blocks.FIRE.defaultBlockState(), 3);
					trying_y = false;
				}
				if ((world.getBlockState(BlockPos.containing(x + random_x, y + sequence_y, z + random_z))).getBlock() == PureoresModBlocks.LONSDALEITE_METEORITE_STONE) {
					world.setBlock(BlockPos.containing(x + random_x, y + sequence_y + 1, z + random_z), Blocks.FIRE.defaultBlockState(), 3);
					trying_y = false;
				}
				if (sequence_y == 1) {
					trying_y = false;
				}
				sequence_y = sequence_y - 1;
			}
		}
	}
}
