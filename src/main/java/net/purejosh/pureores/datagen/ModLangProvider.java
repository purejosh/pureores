package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.item.ModItems;
import net.purejosh.pureores.world.ModGameRules;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    // It might be unusual, but I'm going to add these in the same order as ModBlocks
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Blocks
        // Building Blocks
        translationBuilder.add(ModBlocks.MOONSTONE_BLOCK, "Moonstone Block");
        translationBuilder.add(ModBlocks.FIRE_OPAL_BLOCK, "Fire Opal Block");
        translationBuilder.add(ModBlocks.JADEITE_BLOCK, "Jadeite Block");
        translationBuilder.add(ModBlocks.AMETRINE_BLOCK, "Ametrine Block");
        translationBuilder.add(ModBlocks.CHRYSOBERYL_BLOCK, "Chrysoberyl Block");
        translationBuilder.add(ModBlocks.SAPPHIRE_BLOCK, "Sapphire Block");
        translationBuilder.add(ModBlocks.BLACK_DIAMOND_BLOCK, "Black Diamond Block");
        translationBuilder.add(ModBlocks.LONSDALEITE_BLOCK, "Lonsdaleite Block");

        // Colored Blocks
        translationBuilder.add(ModBlocks.MOONSTONE_GLASS, "Moonstone Glass");
        translationBuilder.add(ModBlocks.FIRE_OPAL_GLASS, "Fire Opal Glass");
        translationBuilder.add(ModBlocks.JADEITE_GLASS, "Jadeite Glass");
        translationBuilder.add(ModBlocks.AMETRINE_GLASS, "Ametrine Glass");
        translationBuilder.add(ModBlocks.CHRYSOBERYL_GLASS, "Chrysoberyl Glass");
        translationBuilder.add(ModBlocks.SAPPHIRE_GLASS, "Sapphire Glass");
        translationBuilder.add(ModBlocks.BLACK_DIAMOND_GLASS, "Black Diamond Glass");
        translationBuilder.add(ModBlocks.LONSDALEITE_GLASS, "Lonsdaleite Glass");
        translationBuilder.add(ModBlocks.FROSTED_MOONSTONE_GLASS, "Frosted Moonstone Glass");
        translationBuilder.add(ModBlocks.FROSTED_FIRE_OPAL_GLASS, "Frosted Fire Opal Glass");
        translationBuilder.add(ModBlocks.FROSTED_JADEITE_GLASS, "Frosted Jadeite Glass");
        translationBuilder.add(ModBlocks.FROSTED_AMETRINE_GLASS, "Frosted Ametrine Glass");
        translationBuilder.add(ModBlocks.FROSTED_CHRYSOBERYL_GLASS, "Frosted Chrysoberyl Glass");
        translationBuilder.add(ModBlocks.FROSTED_SAPPHIRE_GLASS, "Frosted Sapphire Glass");
        translationBuilder.add(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS, "Frosted Black Diamond Glass");
        translationBuilder.add(ModBlocks.FROSTED_LONSDALEITE_GLASS, "Frosted Lonsdaleite Glass");
        translationBuilder.add(ModBlocks.MOONSTONE_GLASS_PANE, "Moonstone Glass Pane");
        translationBuilder.add(ModBlocks.FIRE_OPAL_GLASS_PANE, "Fire Opal Glass Pane");
        translationBuilder.add(ModBlocks.JADEITE_GLASS_PANE, "Jadeite Glass Pane");
        translationBuilder.add(ModBlocks.AMETRINE_GLASS_PANE, "Ametrine Glass Pane");
        translationBuilder.add(ModBlocks.CHRYSOBERYL_GLASS_PANE, "Chrysoberyl Glass Pane");
        translationBuilder.add(ModBlocks.SAPPHIRE_GLASS_PANE, "Sapphire Glass Pane");
        translationBuilder.add(ModBlocks.BLACK_DIAMOND_GLASS_PANE, "Black Diamond Glass Pane");
        translationBuilder.add(ModBlocks.LONSDALEITE_GLASS_PANE, "Lonsdaleite Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_MOONSTONE_GLASS_PANE, "Frosted Moonstone Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE, "Frosted Fire Opal Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_JADEITE_GLASS_PANE, "Frosted Jadeite Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_AMETRINE_GLASS_PANE, "Frosted Ametrine Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE, "Frosted Chrysoberyl Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE, "Frosted Sapphire Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE, "Frosted Black Diamond Glass Pane");
        translationBuilder.add(ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE, "Frosted Lonsdaleite Glass Pane");

        // Natural Blocks
        translationBuilder.add(ModBlocks.MOONSTONE_ORE, "Moonstone Ore");
        translationBuilder.add(ModBlocks.NETHER_FIRE_OPAL_ORE, "Nether Fire Opal Ore");
        translationBuilder.add(ModBlocks.JADEITE_ORE, "Jadeite Ore");
        translationBuilder.add(ModBlocks.END_AMETRINE_ORE, "End Ametrine Ore");
        translationBuilder.add(ModBlocks.CHRYSOBERYL_ORE, "Chrysoberyl Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE, "Deepslate Black Diamond Ore");
        translationBuilder.add(ModBlocks.LONSDALEITE_ORE, "Lonsdaleite Ore");
        translationBuilder.add(ModBlocks.SERPENTINITE, "Serpentinite");
        translationBuilder.add(ModBlocks.SERPENTINITE_STAIRS, "Serpentinite Stairs");
        translationBuilder.add(ModBlocks.SERPENTINITE_SLAB, "Serpentinite Slab");
        translationBuilder.add(ModBlocks.SERPENTINITE_WALL, "Serpentinite Wall");
        translationBuilder.add(ModBlocks.POLISHED_SERPENTINITE, "Polished Serpentinite");
        translationBuilder.add(ModBlocks.POLISHED_SERPENTINITE_STAIRS, "Polished Serpentinite Stairs");
        translationBuilder.add(ModBlocks.POLISHED_SERPENTINITE_SLAB, "Polished Serpentinite Slab");
        translationBuilder.add(ModBlocks.POLISHED_SERPENTINITE_WALL, "Polished Serpentinite Wall");
        translationBuilder.add(ModBlocks.SERPENTINITE_BRICKS, "Serpentinite Bricks");
        translationBuilder.add(ModBlocks.SERPENTINITE_BRICK_STAIRS, "Serpentinite Brick Stairs");
        translationBuilder.add(ModBlocks.SERPENTINITE_BRICK_SLAB, "Serpentinite Brick Slab");
        translationBuilder.add(ModBlocks.SERPENTINITE_BRICK_WALL, "Serpentinite Brick Wall");
        translationBuilder.add(ModBlocks.MICA_SCHIST, "Mica Schist");
        translationBuilder.add(ModBlocks.MICA_SCHIST_STAIRS, "Mica Schist Stairs");
        translationBuilder.add(ModBlocks.MICA_SCHIST_SLAB, "Mica Schist Slab");
        translationBuilder.add(ModBlocks.MICA_SCHIST_WALL, "Mica Schist Wall");
        translationBuilder.add(ModBlocks.POLISHED_MICA_SCHIST, "Polished Mica Schist");
        translationBuilder.add(ModBlocks.POLISHED_MICA_SCHIST_STAIRS, "Polished Mica Schist Stairs");
        translationBuilder.add(ModBlocks.POLISHED_MICA_SCHIST_SLAB, "Polished Mica Schist Slab");
        translationBuilder.add(ModBlocks.POLISHED_MICA_SCHIST_WALL, "Polished Mica Schist Wall");
        translationBuilder.add(ModBlocks.MICA_SCHIST_BRICKS, "Mica Schist Bricks");
        translationBuilder.add(ModBlocks.MICA_SCHIST_BRICK_STAIRS, "Mica Schist Brick Stairs");
        translationBuilder.add(ModBlocks.MICA_SCHIST_BRICK_SLAB, "Mica Schist Brick Slab");
        translationBuilder.add(ModBlocks.MICA_SCHIST_BRICK_WALL, "Mica Schist Brick Wall");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE, "Lonsdaleite Meteorite");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_STAIRS, "Lonsdaleite Meteorite Stairs");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_SLAB, "Lonsdaleite Meteorite Slab");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_WALL, "Lonsdaleite Meteorite Wall");
        translationBuilder.add(ModBlocks.POLISHED_LONSDALEITE_METEORITE, "Polished Lonsdaleite Meteorite");
        translationBuilder.add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS, "Polished Lonsdaleite Meteorite Stairs");
        translationBuilder.add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB, "Polished Lonsdaleite Meteorite Slab");
        translationBuilder.add(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL, "Polished Lonsdaleite Meteorite Wall");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_BRICKS, "Lonsdaleite Meteorite Bricks");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS, "Lonsdaleite Meteorite Brick Stairs");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB, "Lonsdaleite Meteorite Brick Slab");
        translationBuilder.add(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL, "Lonsdaleite Meteorite Brick Wall");

        // Items
        // Tools & Utilities
        translationBuilder.add(ModItems.MOONSTONE_SHOVEL, "Moonstone Shovel");
        translationBuilder.add(ModItems.MOONSTONE_PICKAXE, "Moonstone Pickaxe");
        translationBuilder.add(ModItems.MOONSTONE_AXE, "Moonstone Axe");
        translationBuilder.add(ModItems.MOONSTONE_HOE, "Moonstone Hoe");
        translationBuilder.add(ModItems.FIRE_OPAL_SHOVEL, "Fire Opal Shovel");
        translationBuilder.add(ModItems.FIRE_OPAL_PICKAXE, "Fire Opal Pickaxe");
        translationBuilder.add(ModItems.FIRE_OPAL_AXE, "Fire Opal Axe");
        translationBuilder.add(ModItems.FIRE_OPAL_HOE, "Fire Opal Hoe");
        translationBuilder.add(ModItems.JADEITE_SHOVEL, "Jadeite Shovel");
        translationBuilder.add(ModItems.JADEITE_PICKAXE, "Jadeite Pickaxe");
        translationBuilder.add(ModItems.JADEITE_AXE, "Jadeite Axe");
        translationBuilder.add(ModItems.JADEITE_HOE, "Jadeite Hoe");
        translationBuilder.add(ModItems.AMETRINE_SHOVEL, "Ametrine Shovel");
        translationBuilder.add(ModItems.AMETRINE_PICKAXE, "Ametrine Pickaxe");
        translationBuilder.add(ModItems.AMETRINE_AXE, "Ametrine Axe");
        translationBuilder.add(ModItems.AMETRINE_HOE, "Ametrine Hoe");
        translationBuilder.add(ModItems.CHRYSOBERYL_SHOVEL, "Chrysoberyl Shovel");
        translationBuilder.add(ModItems.CHRYSOBERYL_PICKAXE, "Chrysoberyl Pickaxe");
        translationBuilder.add(ModItems.CHRYSOBERYL_AXE, "Chrysoberyl Axe");
        translationBuilder.add(ModItems.CHRYSOBERYL_HOE, "Chrysoberyl Hoe");
        translationBuilder.add(ModItems.SAPPHIRE_SHOVEL, "Sapphire Shovel");
        translationBuilder.add(ModItems.SAPPHIRE_PICKAXE, "Sapphire Pickaxe");
        translationBuilder.add(ModItems.SAPPHIRE_AXE, "Sapphire Axe");
        translationBuilder.add(ModItems.SAPPHIRE_HOE, "Sapphire Hoe");
        translationBuilder.add(ModItems.BLACK_DIAMOND_SHOVEL, "Black Diamond Shovel");
        translationBuilder.add(ModItems.BLACK_DIAMOND_PICKAXE, "Black Diamond Pickaxe");
        translationBuilder.add(ModItems.BLACK_DIAMOND_AXE, "Black Diamond Axe");
        translationBuilder.add(ModItems.BLACK_DIAMOND_HOE, "Black Diamond Hoe");
        translationBuilder.add(ModItems.LONSDALEITE_SHOVEL, "Lonsdaleite Shovel");
        translationBuilder.add(ModItems.LONSDALEITE_PICKAXE, "Lonsdaleite Pickaxe");
        translationBuilder.add(ModItems.LONSDALEITE_AXE, "Lonsdaleite Axe");
        translationBuilder.add(ModItems.LONSDALEITE_HOE, "Lonsdaleite Hoe");

        // Combat
        translationBuilder.add(ModItems.MOONSTONE_SWORD, "Moonstone Sword");
        translationBuilder.add(ModItems.FIRE_OPAL_SWORD, "Fire Opal Sword");
        translationBuilder.add(ModItems.JADEITE_SWORD, "Jadeite Sword");
        translationBuilder.add(ModItems.AMETRINE_SWORD, "Ametrine Sword");
        translationBuilder.add(ModItems.CHRYSOBERYL_SWORD, "Chrysoberyl Sword");
        translationBuilder.add(ModItems.SAPPHIRE_SWORD, "Sapphire Sword");
        translationBuilder.add(ModItems.BLACK_DIAMOND_SWORD, "Black Diamond Sword");
        translationBuilder.add(ModItems.LONSDALEITE_SWORD, "Lonsdaleite Sword");
        translationBuilder.add(ModItems.MOONSTONE_HELMET, "Moonstone Helmet");
        translationBuilder.add(ModItems.MOONSTONE_CHESTPLATE, "Moonstone Chestplate");
        translationBuilder.add(ModItems.MOONSTONE_LEGGINGS, "Moonstone Leggings");
        translationBuilder.add(ModItems.MOONSTONE_BOOTS, "Moonstone Boots");
        translationBuilder.add(ModItems.FIRE_OPAL_HELMET, "Fire Opal Helmet");
        translationBuilder.add(ModItems.FIRE_OPAL_CHESTPLATE, "Fire Opal Chestplate");
        translationBuilder.add(ModItems.FIRE_OPAL_LEGGINGS, "Fire Opal Leggings");
        translationBuilder.add(ModItems.FIRE_OPAL_BOOTS, "Fire Opal Boots");
        translationBuilder.add(ModItems.JADEITE_HELMET, "Jadeite Helmet");
        translationBuilder.add(ModItems.JADEITE_CHESTPLATE, "Jadeite Chestplate");
        translationBuilder.add(ModItems.JADEITE_LEGGINGS, "Jadeite Leggings");
        translationBuilder.add(ModItems.JADEITE_BOOTS, "Jadeite Boots");
        translationBuilder.add(ModItems.AMETRINE_HELMET, "Ametrine Helmet");
        translationBuilder.add(ModItems.AMETRINE_CHESTPLATE, "Ametrine Chestplate");
        translationBuilder.add(ModItems.AMETRINE_LEGGINGS, "Ametrine Leggings");
        translationBuilder.add(ModItems.AMETRINE_BOOTS, "Ametrine Boots");
        translationBuilder.add(ModItems.CHRYSOBERYL_HELMET, "Chrysoberyl Helmet");
        translationBuilder.add(ModItems.CHRYSOBERYL_CHESTPLATE, "Chrysoberyl Chestplate");
        translationBuilder.add(ModItems.CHRYSOBERYL_LEGGINGS, "Chrysoberyl Leggings");
        translationBuilder.add(ModItems.CHRYSOBERYL_BOOTS, "Chrysoberyl Boots");
        translationBuilder.add(ModItems.SAPPHIRE_HELMET, "Sapphire Helmet");
        translationBuilder.add(ModItems.SAPPHIRE_CHESTPLATE, "Sapphire Chestplate");
        translationBuilder.add(ModItems.SAPPHIRE_LEGGINGS, "Sapphire Leggings");
        translationBuilder.add(ModItems.SAPPHIRE_BOOTS, "Sapphire Boots");
        translationBuilder.add(ModItems.BLACK_DIAMOND_HELMET, "Black Diamond Helmet");
        translationBuilder.add(ModItems.BLACK_DIAMOND_CHESTPLATE, "Black Diamond Chestplate");
        translationBuilder.add(ModItems.BLACK_DIAMOND_LEGGINGS, "Black Diamond Leggings");
        translationBuilder.add(ModItems.BLACK_DIAMOND_BOOTS, "Black Diamond Boots");
        translationBuilder.add(ModItems.LONSDALEITE_HELMET, "Lonsdaleite Helmet");
        translationBuilder.add(ModItems.LONSDALEITE_CHESTPLATE, "Lonsdaleite Chestplate");
        translationBuilder.add(ModItems.LONSDALEITE_LEGGINGS, "Lonsdaleite Leggings");
        translationBuilder.add(ModItems.LONSDALEITE_BOOTS, "Lonsdaleite Boots");

        // Food & Drink
        translationBuilder.add(ModItems.MOONSTONE_APPLE, "Moonstone Apple");
        translationBuilder.add(ModItems.FIRE_OPAL_APPLE, "Fire Opal Apple");
        translationBuilder.add(ModItems.JADEITE_APPLE, "Jadeite Apple");
        translationBuilder.add(ModItems.AMETRINE_APPLE, "Ametrine Apple");
        translationBuilder.add(ModItems.CHRYSOBERYL_APPLE, "Chrysoberyl Apple");
        translationBuilder.add(ModItems.SAPPHIRE_APPLE, "Sapphire Apple");
        translationBuilder.add(ModItems.BLACK_DIAMOND_APPLE, "Black Diamond Apple");
        translationBuilder.add(ModItems.LONSDALEITE_APPLE, "Lonsdaleite Apple");
        translationBuilder.add(ModItems.MOONSTONE_CARROT, "Moonstone Carrot");
        translationBuilder.add(ModItems.FIRE_OPAL_CARROT, "Fire Opal Carrot");
        translationBuilder.add(ModItems.JADEITE_CARROT, "Jadeite Carrot");
        translationBuilder.add(ModItems.AMETRINE_CARROT, "Ametrine Carrot");
        translationBuilder.add(ModItems.CHRYSOBERYL_CARROT, "Chrysoberyl Carrot");
        translationBuilder.add(ModItems.SAPPHIRE_CARROT, "Sapphire Carrot");
        translationBuilder.add(ModItems.BLACK_DIAMOND_CARROT, "Black Diamond Carrot");
        translationBuilder.add(ModItems.LONSDALEITE_CARROT, "Lonsdaleite Carrot");

        // Ingredients
        translationBuilder.add(ModItems.MOONSTONE, "Moonstone");
        translationBuilder.add(ModItems.FIRE_OPAL, "Fire Opal");
        translationBuilder.add(ModItems.JADEITE, "Jadeite");
        translationBuilder.add(ModItems.AMETRINE, "Ametrine");
        translationBuilder.add(ModItems.CHRYSOBERYL, "Chrysoberyl");
        translationBuilder.add(ModItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(ModItems.BLACK_DIAMOND, "Black Diamond");
        translationBuilder.add(ModItems.LONSDALEITE, "Lonsdaleite");
        translationBuilder.add(ModItems.MOONSTONE_DUST, "Moonstone Dust");
        translationBuilder.add(ModItems.FIRE_OPAL_DUST, "Fire Opal Dust");
        translationBuilder.add(ModItems.JADEITE_DUST, "Jadeite Dust");
        translationBuilder.add(ModItems.AMETRINE_DUST, "Ametrine Dust");
        translationBuilder.add(ModItems.CHRYSOBERYL_DUST, "Chrysoberyl Dust");
        translationBuilder.add(ModItems.SAPPHIRE_DUST, "Sapphire Dust");
        translationBuilder.add(ModItems.BLACK_DIAMOND_DUST, "Black Diamond Dust");
        translationBuilder.add(ModItems.LONSDALEITE_DUST, "Lonsdaleite Dust");

        // Gamerules
        translationBuilder.add("gamerule." + ModGameRules.MOONSTONE_ORE_GEN.getName(), "Pure Ores: Moonstone Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.MOONSTONE_ORE_GEN.getName() + ".description", "Controls the generation chance of Moonstone Ores");
        translationBuilder.add("gamerule." + ModGameRules.FIRE_OPAL_ORE_GEN.getName(), "Pure Ores: Fire Opal Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.FIRE_OPAL_ORE_GEN.getName() + ".description", "Controls the generation chance of Fire Opal Ores");
        translationBuilder.add("gamerule." + ModGameRules.JADEITE_ORE_GEN.getName(), "Pure Ores: Jadeite Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.JADEITE_ORE_GEN.getName() + ".description", "Controls the generation chance of Jadeite Ores");
        translationBuilder.add("gamerule." + ModGameRules.AMETRINE_ORE_GEN.getName(), "Pure Ores: Ametrine Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.AMETRINE_ORE_GEN.getName() + ".description", "Controls the generation chance of Ametrine Ores");
        translationBuilder.add("gamerule." + ModGameRules.CHRYSOBERYL_ORE_GEN.getName(), "Pure Ores: Chrysoberyl Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.CHRYSOBERYL_ORE_GEN.getName() + ".description", "Controls the generation chance of Chrysoberyl Ores");
        translationBuilder.add("gamerule." + ModGameRules.SAPPHIRE_ORE_GEN.getName(), "Pure Ores: Sapphire Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.SAPPHIRE_ORE_GEN.getName() + ".description", "Controls the generation chance of Sapphire Ores");
        translationBuilder.add("gamerule." + ModGameRules.BLACK_DIAMOND_ORE_GEN.getName(), "Pure Ores: Black Diamond Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.BLACK_DIAMOND_ORE_GEN.getName() + ".description", "Controls the generation chance of Black Diamond Ores");
        translationBuilder.add("gamerule." + ModGameRules.LONSDALEITE_METEORITE_GEN.getName(), "Pure Ores: Lonsdaleite Generation Chance");
        translationBuilder.add("gamerule." + ModGameRules.LONSDALEITE_METEORITE_GEN.getName() + ".description", "Controls the generation chance of Lonsdaleite Meteorites");
    }
}

