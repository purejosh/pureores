
package net.purejosh.pureores.block;

import net.purejosh.pureores.procedures.OreBlockDestroyedByPlayerProcedure;
import net.purejosh.pureores.init.PureoresModBlocks;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class EndAmetrineOreBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(3f).requiresCorrectToolForDrops();

	public EndAmetrineOreBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void playerDestroy(Level world, Player entity, BlockPos pos, BlockState blockstate, BlockEntity blockEntity, ItemStack itemStack) {
		super.playerDestroy(world, entity, pos, blockstate, blockEntity, itemStack);
		OreBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(PureoresModBlocks.END_AMETRINE_ORE, RenderType.solid());
	}
}
