package net.purejosh.pureores.block;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.purejosh.pureores.PureOres;

public class ModBlocks {
    // Register new blocks, and set their properties all in one. This helps me reduce the amount of files in my code.
    // Building Blocks
    public static final Block MOONSTONE_BLOCK = register("moonstone_block", new Block(Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.LAPIS_BLUE )), true);
    public static final Block FIRE_OPAL_BLOCK = register("fire_opal_block", new Block(Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.BRIGHT_RED)), true);
    public static final Block JADEITE_BLOCK = register("jadeite_block", new Block(Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.EMERALD_GREEN)), true);
    public static final Block AMETRINE_BLOCK = register("ametrine_block", new Block(Settings.copy(Blocks.IRON_BLOCK).mapColor(MapColor.MAGENTA)), true);
    public static final Block CHRYSOBERYL_BLOCK = register("chrysoberyl_block", new Block(Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.GOLD)), true);
    public static final Block SAPPHIRE_BLOCK = register("sapphire_block", new Block(Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.BLUE)), true);
    public static final Block BLACK_DIAMOND_BLOCK = register("black_diamond_block", new Block(Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.BLACK)), true);
    public static final Block LONSDALEITE_BLOCK = register("lonsdaleite_block", new Block(Settings.copy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY)), true);

    // Colored Blocks
    public static final Block MOONSTONE_GLASS = register("moonstone_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.LIGHT_BLUE)), true);
    public static final Block FIRE_OPAL_GLASS = register("fire_opal_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.ORANGE)), true);
    public static final Block JADEITE_GLASS = register("jadeite_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.BRIGHT_TEAL)), true);
    public static final Block AMETRINE_GLASS = register("ametrine_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.PINK)), true);
    public static final Block CHRYSOBERYL_GLASS = register("chrysoberyl_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.YELLOW)), true);
    public static final Block SAPPHIRE_GLASS = register("sapphire_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.LIGHT_BLUE)), true);
    public static final Block BLACK_DIAMOND_GLASS = register("black_diamond_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.IRON_GRAY)), true);
    public static final Block LONSDALEITE_GLASS = register("lonsdaleite_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), true);
    public static final Block FROSTED_MOONSTONE_GLASS = register("frosted_moonstone_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.LIGHT_BLUE)), true);
    public static final Block FROSTED_FIRE_OPAL_GLASS = register("frosted_fire_opal_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.ORANGE)), true);
    public static final Block FROSTED_JADEITE_GLASS = register("frosted_jadeite_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.BRIGHT_TEAL)), true);
    public static final Block FROSTED_AMETRINE_GLASS = register("frosted_ametrine_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.PINK)), true);
    public static final Block FROSTED_CHRYSOBERYL_GLASS = register("frosted_chrysoberyl_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.YELLOW)), true);
    public static final Block FROSTED_SAPPHIRE_GLASS = register("frosted_sapphire_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.LIGHT_BLUE)), true);
    public static final Block FROSTED_BLACK_DIAMOND_GLASS = register("frosted_black_diamond_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.IRON_GRAY)), true);
    public static final Block FROSTED_LONSDALEITE_GLASS = register("frosted_lonsdaleite_glass", new TransparentBlock(Settings.copy(Blocks.GLASS).mapColor(MapColor.WHITE_GRAY)), true);
    public static final Block MOONSTONE_GLASS_PANE = register("moonstone_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FIRE_OPAL_GLASS_PANE = register("fire_opal_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block JADEITE_GLASS_PANE = register("jadeite_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block AMETRINE_GLASS_PANE = register("ametrine_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block CHRYSOBERYL_GLASS_PANE = register("chrysoberyl_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block SAPPHIRE_GLASS_PANE = register("sapphire_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block BLACK_DIAMOND_GLASS_PANE = register("black_diamond_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block LONSDALEITE_GLASS_PANE = register("lonsdaleite_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_MOONSTONE_GLASS_PANE = register("frosted_moonstone_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_FIRE_OPAL_GLASS_PANE = register("frosted_fire_opal_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_JADEITE_GLASS_PANE = register("frosted_jadeite_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_AMETRINE_GLASS_PANE = register("frosted_ametrine_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_CHRYSOBERYL_GLASS_PANE = register("frosted_chrysoberyl_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_SAPPHIRE_GLASS_PANE = register("frosted_sapphire_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_BLACK_DIAMOND_GLASS_PANE = register("frosted_black_diamond_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);
    public static final Block FROSTED_LONSDALEITE_GLASS_PANE = register("frosted_lonsdaleite_glass_pane", new PaneBlock(Settings.copy(Blocks.GLASS_PANE)), true);

    // Natural Blocks
    public static final Block MOONSTONE_ORE = register("moonstone_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), Settings.copy(Blocks.IRON_ORE).mapColor(MapColor.OFF_WHITE)), true);
    public static final Block NETHER_FIRE_OPAL_ORE = register("nether_fire_opal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), Settings.copy(Blocks.NETHER_QUARTZ_ORE)), true);
    public static final Block JADEITE_ORE = register("jadeite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), Settings.copy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_GREEN)), true);
    public static final Block END_AMETRINE_ORE = register("end_ametrine_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), Settings.copy(Blocks.END_STONE)), true);
    public static final Block CHRYSOBERYL_ORE = register("chrysoberyl_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), Settings.copy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_GRAY)), true);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = register("deepslate_sapphire_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), Settings.copy(Blocks.IRON_ORE).mapColor(MapColor.DIRT_BROWN)), true);
    public static final Block DEEPSLATE_BLACK_DIAMOND_ORE = register("deepslate_black_diamond_ore", new ExperienceDroppingBlock(UniformIntProvider.create(6, 12), Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(9.0f,12.0f)), true);
    public static final Block LONSDALEITE_ORE = register("lonsdaleite_ore", new ExperienceDroppingBlock(UniformIntProvider.create(8, 16), Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).mapColor(MapColor.BLACK).strength(90.0f,1200.0f)), true);
    public static final Block SERPENTINITE = register("serpentinite", new Block(Settings.copy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN)), true);
    public static final Block SERPENTINITE_STAIRS = register("serpentinite_stairs", new StairsBlock(ModBlocks.SERPENTINITE.getDefaultState(), Settings.copy(ModBlocks.SERPENTINITE)), true);
    public static final Block SERPENTINITE_SLAB = register("serpentinite_slab", new SlabBlock(Settings.copy(ModBlocks.SERPENTINITE)), true);
    public static final Block SERPENTINITE_WALL = register("serpentinite_wall", new WallBlock(Settings.copy(ModBlocks.SERPENTINITE)), true);
    public static final Block POLISHED_SERPENTINITE = register("polished_serpentinite", new Block(Settings.copy(ModBlocks.SERPENTINITE).mapColor(MapColor.TERRACOTTA_GRAY)), true);
    public static final Block POLISHED_SERPENTINITE_STAIRS = register("polished_serpentinite_stairs", new StairsBlock(ModBlocks.POLISHED_SERPENTINITE.getDefaultState(), Settings.copy(ModBlocks.POLISHED_SERPENTINITE)), true);
    public static final Block POLISHED_SERPENTINITE_SLAB = register("polished_serpentinite_slab", new SlabBlock(Settings.copy(ModBlocks.POLISHED_SERPENTINITE)), true);
    public static final Block POLISHED_SERPENTINITE_WALL = register("polished_serpentinite_wall", new WallBlock(Settings.copy(ModBlocks.POLISHED_SERPENTINITE)), true);
    public static final Block SERPENTINITE_BRICKS = register("serpentinite_bricks", new Block(Settings.copy(ModBlocks.SERPENTINITE)), true);
    public static final Block SERPENTINITE_BRICK_STAIRS = register("serpentinite_brick_stairs", new StairsBlock(ModBlocks.SERPENTINITE_BRICKS.getDefaultState(), Settings.copy(ModBlocks.SERPENTINITE_BRICKS)), true);
    public static final Block SERPENTINITE_BRICK_SLAB = register("serpentinite_brick_slab", new SlabBlock(Settings.copy(ModBlocks.SERPENTINITE_BRICKS)), true);
    public static final Block SERPENTINITE_BRICK_WALL = register("serpentinite_brick_wall", new WallBlock(Settings.copy(ModBlocks.SERPENTINITE_BRICKS)), true);
    public static final Block MICA_SCHIST = register("mica_schist", new Block(Settings.copy(Blocks.TUFF).mapColor(MapColor.TERRACOTTA_GRAY)), true);
    public static final Block MICA_SCHIST_STAIRS = register("mica_schist_stairs", new StairsBlock(ModBlocks.MICA_SCHIST.getDefaultState(), Settings.copy(ModBlocks.MICA_SCHIST)), true);
    public static final Block MICA_SCHIST_SLAB = register("mica_schist_slab", new SlabBlock(Settings.copy(ModBlocks.MICA_SCHIST)), true);
    public static final Block MICA_SCHIST_WALL = register("mica_schist_wall", new WallBlock(Settings.copy(ModBlocks.MICA_SCHIST)), true);
    public static final Block POLISHED_MICA_SCHIST = register("polished_mica_schist", new Block(Settings.copy(ModBlocks.MICA_SCHIST)), true);
    public static final Block POLISHED_MICA_SCHIST_STAIRS = register("polished_mica_schist_stairs", new StairsBlock(ModBlocks.POLISHED_MICA_SCHIST.getDefaultState(), Settings.copy(ModBlocks.POLISHED_MICA_SCHIST)), true);
    public static final Block POLISHED_MICA_SCHIST_SLAB = register("polished_mica_schist_slab", new SlabBlock(Settings.copy(ModBlocks.POLISHED_MICA_SCHIST)), true);
    public static final Block POLISHED_MICA_SCHIST_WALL = register("polished_mica_schist_wall", new WallBlock(Settings.copy(ModBlocks.POLISHED_MICA_SCHIST)), true);
    public static final Block MICA_SCHIST_BRICKS = register("mica_schist_bricks", new Block(Settings.copy(ModBlocks.MICA_SCHIST)), true);
    public static final Block MICA_SCHIST_BRICK_STAIRS = register("mica_schist_brick_stairs", new StairsBlock(ModBlocks.MICA_SCHIST_BRICKS.getDefaultState(), Settings.copy(ModBlocks.MICA_SCHIST_BRICKS)), true);
    public static final Block MICA_SCHIST_BRICK_SLAB = register("mica_schist_brick_slab", new SlabBlock(Settings.copy(ModBlocks.MICA_SCHIST_BRICKS)), true);
    public static final Block MICA_SCHIST_BRICK_WALL = register("mica_schist_brick_wall", new WallBlock(Settings.copy(ModBlocks.MICA_SCHIST_BRICKS)), true);
    public static final Block LONSDALEITE_METEORITE = register("lonsdaleite_meteorite", new Block(Settings.copy(Blocks.DEEPSLATE).mapColor(MapColor.BLACK).strength(90.0f,1200.0f)), true);
    public static final Block LONSDALEITE_METEORITE_STAIRS = register("lonsdaleite_meteorite_stairs", new StairsBlock(ModBlocks.LONSDALEITE_METEORITE.getDefaultState(), Settings.copy(ModBlocks.LONSDALEITE_METEORITE)), true);
    public static final Block LONSDALEITE_METEORITE_SLAB = register("lonsdaleite_meteorite_slab", new SlabBlock(Settings.copy(ModBlocks.LONSDALEITE_METEORITE)), true);
    public static final Block LONSDALEITE_METEORITE_WALL = register("lonsdaleite_meteorite_wall", new WallBlock(Settings.copy(ModBlocks.LONSDALEITE_METEORITE)), true);
    public static final Block POLISHED_LONSDALEITE_METEORITE = register("polished_lonsdaleite_meteorite", new Block(Settings.copy(ModBlocks.LONSDALEITE_METEORITE)), true);
    public static final Block POLISHED_LONSDALEITE_METEORITE_STAIRS = register("polished_lonsdaleite_meteorite_stairs", new StairsBlock(ModBlocks.POLISHED_LONSDALEITE_METEORITE.getDefaultState(), Settings.copy(ModBlocks.POLISHED_LONSDALEITE_METEORITE)), true);
    public static final Block POLISHED_LONSDALEITE_METEORITE_SLAB = register("polished_lonsdaleite_meteorite_slab", new SlabBlock(Settings.copy(ModBlocks.POLISHED_LONSDALEITE_METEORITE)), true);
    public static final Block POLISHED_LONSDALEITE_METEORITE_WALL = register("polished_lonsdaleite_meteorite_wall", new WallBlock(Settings.copy(ModBlocks.POLISHED_LONSDALEITE_METEORITE)), true);
    public static final Block LONSDALEITE_METEORITE_BRICKS = register("lonsdaleite_meteorite_bricks", new Block(Settings.copy(ModBlocks.LONSDALEITE_METEORITE)), true);
    public static final Block LONSDALEITE_METEORITE_BRICK_STAIRS = register("lonsdaleite_meteorite_brick_stairs", new StairsBlock(ModBlocks.LONSDALEITE_METEORITE_BRICKS.getDefaultState(), Settings.copy(ModBlocks.LONSDALEITE_METEORITE_BRICKS)), true);
    public static final Block LONSDALEITE_METEORITE_BRICK_SLAB = register("lonsdaleite_meteorite_brick_slab", new SlabBlock(Settings.copy(ModBlocks.LONSDALEITE_METEORITE_BRICKS)), true);
    public static final Block LONSDALEITE_METEORITE_BRICK_WALL = register("lonsdaleite_meteorite_brick_wall", new WallBlock(Settings.copy(ModBlocks.LONSDALEITE_METEORITE_BRICKS)), true);

    // Helper methods
    // This is used to create an item version of a block. An item of a block is what you see in your inventory.
    public static Block register(String name, Block block, boolean shouldRegisterItem) {
        // This creates an id consisting of the mod id and the name of the block.
        Identifier id = Identifier.of(PureOres.MOD_ID, name);
        // Some blocks may not have an item version of them, such as air. Use this boolean to control that.
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    // Class initializer.
    public static void init() {
    }
}