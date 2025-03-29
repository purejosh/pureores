package net.purejosh.pureores.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.purejosh.pureores.block.ModBlocks;

// This is used to arrange items in creative tabs. These are in order of tabs and sort order in the tab.
public class ModItemGroups {
    public static void init() {
        // Building Blocks
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.SERPENTINITE);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE, ModBlocks.SERPENTINITE_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_STAIRS, ModBlocks.SERPENTINITE_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_SLAB, ModBlocks.SERPENTINITE_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_WALL, ModBlocks.POLISHED_SERPENTINITE);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_SERPENTINITE, ModBlocks.POLISHED_SERPENTINITE_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_SERPENTINITE_STAIRS, ModBlocks.POLISHED_SERPENTINITE_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_SERPENTINITE_SLAB, ModBlocks.POLISHED_SERPENTINITE_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_SERPENTINITE_WALL, ModBlocks.SERPENTINITE_BRICKS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_BRICKS, ModBlocks.SERPENTINITE_BRICK_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_BRICK_STAIRS, ModBlocks.SERPENTINITE_BRICK_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_BRICK_SLAB, ModBlocks.SERPENTINITE_BRICK_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_BRICK_WALL, ModBlocks.MICA_SCHIST);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST, ModBlocks.MICA_SCHIST_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_STAIRS, ModBlocks.MICA_SCHIST_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_SLAB, ModBlocks.MICA_SCHIST_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_WALL, ModBlocks.POLISHED_MICA_SCHIST);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_MICA_SCHIST, ModBlocks.POLISHED_MICA_SCHIST_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_MICA_SCHIST_STAIRS, ModBlocks.POLISHED_MICA_SCHIST_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_MICA_SCHIST_SLAB, ModBlocks.POLISHED_MICA_SCHIST_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_MICA_SCHIST_WALL, ModBlocks.MICA_SCHIST_BRICKS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_BRICKS, ModBlocks.MICA_SCHIST_BRICK_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_BRICK_STAIRS, ModBlocks.MICA_SCHIST_BRICK_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_BRICK_SLAB, ModBlocks.MICA_SCHIST_BRICK_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_BRICK_WALL, ModBlocks.LONSDALEITE_METEORITE);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE, ModBlocks.LONSDALEITE_METEORITE_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_STAIRS, ModBlocks.LONSDALEITE_METEORITE_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_SLAB, ModBlocks.LONSDALEITE_METEORITE_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_WALL, ModBlocks.POLISHED_LONSDALEITE_METEORITE);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_LONSDALEITE_METEORITE, ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB, ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL, ModBlocks.LONSDALEITE_METEORITE_BRICKS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_BRICKS, ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS, ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB, ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, Items.LIGHT_WEIGHTED_PRESSURE_PLATE, ModBlocks.MOONSTONE_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.MOONSTONE_BLOCK, ModBlocks.FIRE_OPAL_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.FIRE_OPAL_BLOCK, ModBlocks.JADEITE_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.JADEITE_BLOCK, ModBlocks.AMETRINE_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.AMETRINE_BLOCK, ModBlocks.CHRYSOBERYL_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.CHRYSOBERYL_BLOCK, ModBlocks.SAPPHIRE_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK, ModBlocks.BLACK_DIAMOND_BLOCK);
        registerItemOrder(ItemGroups.BUILDING_BLOCKS, ModBlocks.BLACK_DIAMOND_BLOCK, ModBlocks.LONSDALEITE_BLOCK);

        // Colored Blocks
        registerItemOrder(ItemGroups.COLORED_BLOCKS, Items.PINK_STAINED_GLASS, ModBlocks.MOONSTONE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.MOONSTONE_GLASS, ModBlocks.FIRE_OPAL_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FIRE_OPAL_GLASS, ModBlocks.JADEITE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.JADEITE_GLASS, ModBlocks.AMETRINE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.AMETRINE_GLASS, ModBlocks.CHRYSOBERYL_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.CHRYSOBERYL_GLASS, ModBlocks.SAPPHIRE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.SAPPHIRE_GLASS, ModBlocks.BLACK_DIAMOND_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.BLACK_DIAMOND_GLASS, ModBlocks.LONSDALEITE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.LONSDALEITE_GLASS, ModBlocks.FROSTED_MOONSTONE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_MOONSTONE_GLASS, ModBlocks.FROSTED_FIRE_OPAL_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_FIRE_OPAL_GLASS, ModBlocks.FROSTED_JADEITE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_JADEITE_GLASS, ModBlocks.FROSTED_AMETRINE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_AMETRINE_GLASS, ModBlocks.FROSTED_CHRYSOBERYL_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_CHRYSOBERYL_GLASS, ModBlocks.FROSTED_SAPPHIRE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_SAPPHIRE_GLASS, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS, ModBlocks.FROSTED_LONSDALEITE_GLASS);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, Items.PINK_STAINED_GLASS_PANE, ModBlocks.MOONSTONE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.MOONSTONE_GLASS_PANE, ModBlocks.FIRE_OPAL_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FIRE_OPAL_GLASS_PANE, ModBlocks.JADEITE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.JADEITE_GLASS_PANE, ModBlocks.AMETRINE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.AMETRINE_GLASS_PANE, ModBlocks.CHRYSOBERYL_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.CHRYSOBERYL_GLASS_PANE, ModBlocks.SAPPHIRE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.SAPPHIRE_GLASS_PANE, ModBlocks.BLACK_DIAMOND_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.BLACK_DIAMOND_GLASS_PANE, ModBlocks.LONSDALEITE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.LONSDALEITE_GLASS_PANE, ModBlocks.FROSTED_MOONSTONE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_MOONSTONE_GLASS_PANE, ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE, ModBlocks.FROSTED_JADEITE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_JADEITE_GLASS_PANE, ModBlocks.FROSTED_AMETRINE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_AMETRINE_GLASS_PANE, ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE, ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE);
        registerItemOrder(ItemGroups.COLORED_BLOCKS, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE, ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE);

        // Natural Blocks
        registerItemOrder(ItemGroups.NATURAL, Items.ANDESITE, ModBlocks.SERPENTINITE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.SERPENTINITE, ModBlocks.MICA_SCHIST);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.MICA_SCHIST, ModBlocks.LONSDALEITE_METEORITE);
        registerItemOrder(ItemGroups.NATURAL, Items.DEEPSLATE_GOLD_ORE, ModBlocks.MOONSTONE_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.MOONSTONE_ORE, ModBlocks.NETHER_FIRE_OPAL_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.NETHER_FIRE_OPAL_ORE, ModBlocks.JADEITE_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.JADEITE_ORE, ModBlocks.END_AMETRINE_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.END_AMETRINE_ORE, ModBlocks.CHRYSOBERYL_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.CHRYSOBERYL_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE);
        registerItemOrder(ItemGroups.NATURAL, ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE, ModBlocks.LONSDALEITE_ORE);

        // Tools & Utilities
        registerItemOrder(ItemGroups.TOOLS, Items.GOLDEN_HOE, ModItems.MOONSTONE_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.MOONSTONE_SHOVEL, ModItems.MOONSTONE_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.MOONSTONE_PICKAXE, ModItems.MOONSTONE_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.MOONSTONE_AXE, ModItems.MOONSTONE_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.MOONSTONE_HOE, ModItems.FIRE_OPAL_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.FIRE_OPAL_SHOVEL, ModItems.FIRE_OPAL_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.FIRE_OPAL_PICKAXE, ModItems.FIRE_OPAL_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.FIRE_OPAL_AXE, ModItems.FIRE_OPAL_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.FIRE_OPAL_HOE, ModItems.JADEITE_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.JADEITE_SHOVEL, ModItems.JADEITE_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.JADEITE_PICKAXE, ModItems.JADEITE_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.JADEITE_AXE, ModItems.JADEITE_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.JADEITE_HOE, ModItems.AMETRINE_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETRINE_SHOVEL, ModItems.AMETRINE_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETRINE_PICKAXE, ModItems.AMETRINE_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETRINE_AXE, ModItems.AMETRINE_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.AMETRINE_HOE, ModItems.CHRYSOBERYL_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.CHRYSOBERYL_SHOVEL, ModItems.CHRYSOBERYL_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.CHRYSOBERYL_PICKAXE, ModItems.CHRYSOBERYL_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.CHRYSOBERYL_AXE, ModItems.CHRYSOBERYL_HOE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.CHRYSOBERYL_HOE, ModItems.SAPPHIRE_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE_HOE);
        registerItemOrder(ItemGroups.TOOLS, Items.DIAMOND_HOE, ModItems.BLACK_DIAMOND_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.BLACK_DIAMOND_SHOVEL, ModItems.BLACK_DIAMOND_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.BLACK_DIAMOND_PICKAXE, ModItems.BLACK_DIAMOND_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.BLACK_DIAMOND_AXE, ModItems.BLACK_DIAMOND_HOE);
        registerItemOrder(ItemGroups.TOOLS, Items.NETHERITE_HOE, ModItems.LONSDALEITE_SHOVEL);
        registerItemOrder(ItemGroups.TOOLS, ModItems.LONSDALEITE_SHOVEL, ModItems.LONSDALEITE_PICKAXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.LONSDALEITE_PICKAXE, ModItems.LONSDALEITE_AXE);
        registerItemOrder(ItemGroups.TOOLS, ModItems.LONSDALEITE_AXE, ModItems.LONSDALEITE_HOE);

        // Combat
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_SWORD, ModItems.MOONSTONE_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_SWORD, ModItems.FIRE_OPAL_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_SWORD, ModItems.JADEITE_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_SWORD, ModItems.AMETRINE_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_SWORD, ModItems.CHRYSOBERYL_SWORD);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_SWORD, ModItems.SAPPHIRE_SWORD);
        registerItemOrder(ItemGroups.COMBAT, Items.DIAMOND_SWORD, ModItems.BLACK_DIAMOND_SWORD);
        registerItemOrder(ItemGroups.COMBAT, Items.NETHERITE_SWORD, ModItems.LONSDALEITE_SWORD);
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_AXE, ModItems.MOONSTONE_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_AXE, ModItems.FIRE_OPAL_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_AXE, ModItems.JADEITE_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_AXE, ModItems.AMETRINE_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_AXE, ModItems.CHRYSOBERYL_AXE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_AXE, ModItems.SAPPHIRE_AXE);
        registerItemOrder(ItemGroups.COMBAT, Items.DIAMOND_AXE, ModItems.BLACK_DIAMOND_AXE);
        registerItemOrder(ItemGroups.COMBAT, Items.NETHERITE_AXE, ModItems.LONSDALEITE_AXE);
        registerItemOrder(ItemGroups.COMBAT, Items.GOLDEN_BOOTS, ModItems.MOONSTONE_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_HELMET, ModItems.MOONSTONE_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_CHESTPLATE, ModItems.MOONSTONE_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_LEGGINGS, ModItems.MOONSTONE_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.MOONSTONE_BOOTS, ModItems.FIRE_OPAL_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_HELMET, ModItems.FIRE_OPAL_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_CHESTPLATE, ModItems.FIRE_OPAL_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_LEGGINGS, ModItems.FIRE_OPAL_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.FIRE_OPAL_BOOTS, ModItems.JADEITE_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_HELMET, ModItems.JADEITE_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_CHESTPLATE, ModItems.JADEITE_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_LEGGINGS, ModItems.JADEITE_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.JADEITE_BOOTS, ModItems.AMETRINE_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_HELMET, ModItems.AMETRINE_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_CHESTPLATE, ModItems.AMETRINE_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_LEGGINGS, ModItems.AMETRINE_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.AMETRINE_BOOTS, ModItems.CHRYSOBERYL_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_HELMET, ModItems.CHRYSOBERYL_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_CHESTPLATE, ModItems.CHRYSOBERYL_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_LEGGINGS, ModItems.CHRYSOBERYL_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.CHRYSOBERYL_BOOTS, ModItems.SAPPHIRE_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, Items.DIAMOND_BOOTS, ModItems.BLACK_DIAMOND_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.BLACK_DIAMOND_HELMET, ModItems.BLACK_DIAMOND_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.BLACK_DIAMOND_CHESTPLATE, ModItems.BLACK_DIAMOND_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.BLACK_DIAMOND_LEGGINGS, ModItems.BLACK_DIAMOND_BOOTS);
        registerItemOrder(ItemGroups.COMBAT, Items.NETHERITE_BOOTS, ModItems.LONSDALEITE_HELMET);
        registerItemOrder(ItemGroups.COMBAT, ModItems.LONSDALEITE_HELMET, ModItems.LONSDALEITE_CHESTPLATE);
        registerItemOrder(ItemGroups.COMBAT, ModItems.LONSDALEITE_CHESTPLATE, ModItems.LONSDALEITE_LEGGINGS);
        registerItemOrder(ItemGroups.COMBAT, ModItems.LONSDALEITE_LEGGINGS, ModItems.LONSDALEITE_BOOTS);

        // Food & Drinks
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, Items.APPLE, ModItems.MOONSTONE_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.MOONSTONE_APPLE, ModItems.FIRE_OPAL_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.FIRE_OPAL_APPLE, ModItems.JADEITE_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.JADEITE_APPLE, ModItems.AMETRINE_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.AMETRINE_APPLE, ModItems.CHRYSOBERYL_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.CHRYSOBERYL_APPLE, ModItems.SAPPHIRE_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.SAPPHIRE_APPLE, ModItems.BLACK_DIAMOND_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.BLACK_DIAMOND_APPLE, ModItems.LONSDALEITE_APPLE);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, Items.CARROT, ModItems.MOONSTONE_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.MOONSTONE_CARROT, ModItems.FIRE_OPAL_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.FIRE_OPAL_CARROT, ModItems.JADEITE_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.JADEITE_CARROT, ModItems.AMETRINE_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.AMETRINE_CARROT, ModItems.CHRYSOBERYL_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.CHRYSOBERYL_CARROT, ModItems.SAPPHIRE_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.SAPPHIRE_CARROT, ModItems.BLACK_DIAMOND_CARROT);
        registerItemOrder(ItemGroups.FOOD_AND_DRINK, ModItems.BLACK_DIAMOND_CARROT, ModItems.LONSDALEITE_CARROT);

        // Ingredients
        registerItemOrder(ItemGroups.INGREDIENTS, Items.RAW_GOLD, ModItems.MOONSTONE);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.MOONSTONE, ModItems.FIRE_OPAL);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.FIRE_OPAL, ModItems.JADEITE);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.JADEITE, ModItems.AMETRINE);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.AMETRINE, ModItems.CHRYSOBERYL);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.CHRYSOBERYL, ModItems.SAPPHIRE);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.SAPPHIRE, ModItems.BLACK_DIAMOND);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.BLACK_DIAMOND, ModItems.LONSDALEITE);
        registerItemOrder(ItemGroups.INGREDIENTS, Items.GLOWSTONE_DUST, ModItems.MOONSTONE_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.MOONSTONE_DUST, ModItems.FIRE_OPAL_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.FIRE_OPAL_DUST, ModItems.JADEITE_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.JADEITE_DUST, ModItems.AMETRINE_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.AMETRINE_DUST, ModItems.CHRYSOBERYL_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.CHRYSOBERYL_DUST, ModItems.SAPPHIRE_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.SAPPHIRE_DUST, ModItems.BLACK_DIAMOND_DUST);
        registerItemOrder(ItemGroups.INGREDIENTS, ModItems.BLACK_DIAMOND_DUST, ModItems.LONSDALEITE_DUST);
    }

    // I wanted to optimize my code, so instead of using the full syntax that kaupenjoe uses, I created this "wrapper method"
    // to handle the modifyEntriesEvent. This makes the above registration about 43% more efficient.
    private static void registerItemOrder(RegistryKey<ItemGroup> itemGroup, ItemConvertible before, ItemConvertible after) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register((entries) -> entries.addAfter(before, after));
    }
}