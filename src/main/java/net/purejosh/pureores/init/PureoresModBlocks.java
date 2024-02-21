
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureores.init;

import net.purejosh.pureores.block.SerpentiniteStoneBlock;
import net.purejosh.pureores.block.SapphireOreBlock;
import net.purejosh.pureores.block.SapphireBlockBlock;
import net.purejosh.pureores.block.NetherFireOpalOreBlock;
import net.purejosh.pureores.block.MoonstoneOreBlock;
import net.purejosh.pureores.block.MoonstoneBlockBlock;
import net.purejosh.pureores.block.MicaSchistBlock;
import net.purejosh.pureores.block.LonsdaleiteOreBlock;
import net.purejosh.pureores.block.LonsdaleiteMeteoriteStoneBlock;
import net.purejosh.pureores.block.LonsdaleiteBlockBlock;
import net.purejosh.pureores.block.JadeiteOreBlock;
import net.purejosh.pureores.block.JadeiteBlockBlock;
import net.purejosh.pureores.block.FireOpalBlockBlock;
import net.purejosh.pureores.block.EndAmetrineOreBlock;
import net.purejosh.pureores.block.DeepslateBlackDiamondOreBlock;
import net.purejosh.pureores.block.ChrysoberylOreBlock;
import net.purejosh.pureores.block.ChrysoberylBlockBlock;
import net.purejosh.pureores.block.BlackDiamondBlockBlock;
import net.purejosh.pureores.block.AmetrineBlockBlock;
import net.purejosh.pureores.PureoresMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PureoresModBlocks {
	public static Block MOONSTONE_BLOCK;
	public static Block FIRE_OPAL_BLOCK;
	public static Block JADEITE_BLOCK;
	public static Block AMETRINE_BLOCK;
	public static Block CHRYSOBERYL_BLOCK;
	public static Block SAPPHIRE_BLOCK;
	public static Block BLACK_DIAMOND_BLOCK;
	public static Block LONSDALEITE_BLOCK;
	public static Block MOONSTONE_ORE;
	public static Block NETHER_FIRE_OPAL_ORE;
	public static Block SERPENTINITE_STONE;
	public static Block JADEITE_ORE;
	public static Block END_AMETRINE_ORE;
	public static Block MICA_SCHIST;
	public static Block CHRYSOBERYL_ORE;
	public static Block SAPPHIRE_ORE;
	public static Block DEEPSLATE_BLACK_DIAMOND_ORE;
	public static Block LONSDALEITE_METEORITE_STONE;
	public static Block LONSDALEITE_ORE;

	public static void load() {
		MOONSTONE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "moonstone_block"), new MoonstoneBlockBlock());
		FIRE_OPAL_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "fire_opal_block"), new FireOpalBlockBlock());
		JADEITE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "jadeite_block"), new JadeiteBlockBlock());
		AMETRINE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "ametrine_block"), new AmetrineBlockBlock());
		CHRYSOBERYL_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "chrysoberyl_block"), new ChrysoberylBlockBlock());
		SAPPHIRE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "sapphire_block"), new SapphireBlockBlock());
		BLACK_DIAMOND_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "black_diamond_block"), new BlackDiamondBlockBlock());
		LONSDALEITE_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "lonsdaleite_block"), new LonsdaleiteBlockBlock());
		MOONSTONE_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "moonstone_ore"), new MoonstoneOreBlock());
		NETHER_FIRE_OPAL_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "nether_fire_opal_ore"), new NetherFireOpalOreBlock());
		SERPENTINITE_STONE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "serpentinite_stone"), new SerpentiniteStoneBlock());
		JADEITE_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "jadeite_ore"), new JadeiteOreBlock());
		END_AMETRINE_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "end_ametrine_ore"), new EndAmetrineOreBlock());
		MICA_SCHIST = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "mica_schist"), new MicaSchistBlock());
		CHRYSOBERYL_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "chrysoberyl_ore"), new ChrysoberylOreBlock());
		SAPPHIRE_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "sapphire_ore"), new SapphireOreBlock());
		DEEPSLATE_BLACK_DIAMOND_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "deepslate_black_diamond_ore"), new DeepslateBlackDiamondOreBlock());
		LONSDALEITE_METEORITE_STONE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "lonsdaleite_meteorite_stone"), new LonsdaleiteMeteoriteStoneBlock());
		LONSDALEITE_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureoresMod.MODID, "lonsdaleite_ore"), new LonsdaleiteOreBlock());
	}

	public static void clientLoad() {
		MoonstoneBlockBlock.clientInit();
		FireOpalBlockBlock.clientInit();
		JadeiteBlockBlock.clientInit();
		AmetrineBlockBlock.clientInit();
		ChrysoberylBlockBlock.clientInit();
		SapphireBlockBlock.clientInit();
		BlackDiamondBlockBlock.clientInit();
		LonsdaleiteBlockBlock.clientInit();
		MoonstoneOreBlock.clientInit();
		NetherFireOpalOreBlock.clientInit();
		SerpentiniteStoneBlock.clientInit();
		JadeiteOreBlock.clientInit();
		EndAmetrineOreBlock.clientInit();
		MicaSchistBlock.clientInit();
		ChrysoberylOreBlock.clientInit();
		SapphireOreBlock.clientInit();
		DeepslateBlackDiamondOreBlock.clientInit();
		LonsdaleiteMeteoriteStoneBlock.clientInit();
		LonsdaleiteOreBlock.clientInit();
	}
}
