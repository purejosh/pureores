package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.data.family.ModBlockFamilies;
import net.purejosh.pureores.item.ModItems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Blocks
        // Building Blocks
        offerGemBlockRecipes(exporter, ModItems.FIRE_OPAL, ModBlocks.FIRE_OPAL_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.JADEITE, ModBlocks.JADEITE_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.AMETRINE, ModBlocks.AMETRINE_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.CHRYSOBERYL, ModBlocks.CHRYSOBERYL_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.SAPPHIRE, ModBlocks.SAPPHIRE_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.BLACK_DIAMOND, ModBlocks.BLACK_DIAMOND_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.LONSDALEITE, ModBlocks.LONSDALEITE_BLOCK);
        offerGemBlockRecipes(exporter, ModItems.MOONSTONE, ModBlocks.MOONSTONE_BLOCK);

        // Colored Blocks
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.MOONSTONE_GLASS, ModItems.MOONSTONE_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.FIRE_OPAL_GLASS, ModItems.FIRE_OPAL_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.JADEITE_GLASS, ModItems.JADEITE_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.AMETRINE_GLASS, ModItems.AMETRINE_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.CHRYSOBERYL_GLASS, ModItems.CHRYSOBERYL_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.SAPPHIRE_GLASS, ModItems.SAPPHIRE_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.BLACK_DIAMOND_GLASS, ModItems.BLACK_DIAMOND_DUST);
        offerStainedGlassDyeingRecipe(exporter, ModBlocks.LONSDALEITE_GLASS, ModItems.LONSDALEITE_DUST);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.MOONSTONE_GLASS_PANE, ModBlocks.MOONSTONE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FIRE_OPAL_GLASS_PANE, ModBlocks.FIRE_OPAL_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.JADEITE_GLASS_PANE, ModBlocks.JADEITE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.AMETRINE_GLASS_PANE, ModBlocks.AMETRINE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.CHRYSOBERYL_GLASS_PANE, ModBlocks.CHRYSOBERYL_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.SAPPHIRE_GLASS_PANE, ModBlocks.SAPPHIRE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.BLACK_DIAMOND_GLASS_PANE, ModBlocks.BLACK_DIAMOND_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.LONSDALEITE_GLASS_PANE, ModBlocks.LONSDALEITE_GLASS);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.MOONSTONE_GLASS_PANE, ModItems.MOONSTONE_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.FIRE_OPAL_GLASS_PANE, ModItems.FIRE_OPAL_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.JADEITE_GLASS_PANE, ModItems.JADEITE_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.AMETRINE_GLASS_PANE, ModItems.AMETRINE_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.CHRYSOBERYL_GLASS_PANE, ModItems.CHRYSOBERYL_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.SAPPHIRE_GLASS_PANE, ModItems.SAPPHIRE_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.BLACK_DIAMOND_GLASS_PANE, ModItems.BLACK_DIAMOND_DUST);
        offerStainedGlassPaneDyeingRecipe(exporter, ModBlocks.LONSDALEITE_GLASS_PANE, ModItems.LONSDALEITE_DUST);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_MOONSTONE_GLASS, ModItems.MOONSTONE_DUST, ModBlocks.MOONSTONE_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_FIRE_OPAL_GLASS, ModItems.FIRE_OPAL_DUST, ModBlocks.FIRE_OPAL_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_JADEITE_GLASS, ModItems.JADEITE_DUST, ModBlocks.JADEITE_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_AMETRINE_GLASS, ModItems.AMETRINE_DUST, ModBlocks.AMETRINE_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_CHRYSOBERYL_GLASS, ModItems.CHRYSOBERYL_DUST, ModBlocks.CHRYSOBERYL_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_SAPPHIRE_GLASS, ModItems.SAPPHIRE_DUST, ModBlocks.SAPPHIRE_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS, ModItems.BLACK_DIAMOND_DUST, ModBlocks.BLACK_DIAMOND_GLASS);
        offerFrostedGlassRecipe(exporter, ModBlocks.FROSTED_LONSDALEITE_GLASS, ModItems.LONSDALEITE_DUST, ModBlocks.LONSDALEITE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_MOONSTONE_GLASS_PANE, ModBlocks.FROSTED_MOONSTONE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE, ModBlocks.FROSTED_FIRE_OPAL_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_JADEITE_GLASS_PANE, ModBlocks.FROSTED_JADEITE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_AMETRINE_GLASS_PANE, ModBlocks.FROSTED_AMETRINE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE, ModBlocks.FROSTED_CHRYSOBERYL_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE, ModBlocks.FROSTED_SAPPHIRE_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS);
        offerStainedGlassPaneRecipe(exporter, ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE, ModBlocks.FROSTED_LONSDALEITE_GLASS);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_MOONSTONE_GLASS_PANE, ModItems.MOONSTONE_DUST, ModBlocks.MOONSTONE_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE, ModItems.FIRE_OPAL_DUST, ModBlocks.FIRE_OPAL_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_JADEITE_GLASS_PANE, ModItems.JADEITE_DUST, ModBlocks.JADEITE_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_AMETRINE_GLASS_PANE, ModItems.AMETRINE_DUST, ModBlocks.AMETRINE_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE, ModItems.CHRYSOBERYL_DUST, ModBlocks.CHRYSOBERYL_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE, ModItems.SAPPHIRE_DUST, ModBlocks.SAPPHIRE_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE, ModItems.BLACK_DIAMOND_DUST, ModBlocks.BLACK_DIAMOND_GLASS_PANE);
        offerFrostedGlassPaneRecipe(exporter, ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE, ModItems.LONSDALEITE_DUST, ModBlocks.LONSDALEITE_GLASS_PANE);

        // Natural Blocks
        offerSmelting(exporter, Collections.singletonList(ModBlocks.MOONSTONE_ORE), RecipeCategory.MISC, ModItems.MOONSTONE, 0.25f, 200, "moonstone_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.NETHER_FIRE_OPAL_ORE), RecipeCategory.MISC, ModItems.FIRE_OPAL, 0.25f, 200, "nether_fire_opal_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.JADEITE_ORE), RecipeCategory.MISC, ModItems.JADEITE, 0.25f, 200, "jadeite_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.END_AMETRINE_ORE), RecipeCategory.MISC, ModItems.AMETRINE, 0.25f, 200, "end_ametrine_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.CHRYSOBERYL_ORE), RecipeCategory.MISC, ModItems.CHRYSOBERYL, 0.25f, 200, "chrysoberyl_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.DEEPSLATE_SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 0.25f, 200, "sapphire_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE), RecipeCategory.MISC, ModItems.BLACK_DIAMOND, 0.25f, 200, "deepslate_black_diamond_ore_smelt");
        offerSmelting(exporter, Collections.singletonList(ModBlocks.LONSDALEITE_ORE), RecipeCategory.MISC, ModItems.LONSDALEITE, 0.25f, 200, "lonsdaleite_ore_smelt");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.MOONSTONE_ORE), RecipeCategory.MISC, ModItems.MOONSTONE, 0.25f, 100, "moonstone_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.NETHER_FIRE_OPAL_ORE), RecipeCategory.MISC, ModItems.FIRE_OPAL, 0.25f, 100, "nether_fire_opal_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.JADEITE_ORE), RecipeCategory.MISC, ModItems.JADEITE, 0.25f, 100, "jadeite_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.END_AMETRINE_ORE), RecipeCategory.MISC, ModItems.AMETRINE, 0.25f, 100, "end_ametrine_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.CHRYSOBERYL_ORE), RecipeCategory.MISC, ModItems.CHRYSOBERYL, 0.25f, 100, "chrysoberyl_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.DEEPSLATE_SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 0.25f, 100, "sapphire_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE), RecipeCategory.MISC, ModItems.BLACK_DIAMOND, 0.25f, 100, "deepslate_black_diamond_ore_blast");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.LONSDALEITE_ORE), RecipeCategory.MISC, ModItems.LONSDALEITE, 0.25f, 100, "lonsdaleite_ore_blast");

        // Items
        // Tools & Utilities
        offerShovelRecipe(exporter, ModItems.MOONSTONE_SHOVEL, ModItems.MOONSTONE);
        offerPickaxeRecipe(exporter, ModItems.MOONSTONE_PICKAXE, ModItems.MOONSTONE);
        offerAxeRecipe(exporter, ModItems.MOONSTONE_AXE, ModItems.MOONSTONE);
        offerHoeRecipe(exporter, ModItems.MOONSTONE_HOE, ModItems.MOONSTONE);
        offerSwordRecipe(exporter, ModItems.MOONSTONE_SWORD, ModItems.MOONSTONE);
        offerHelmetRecipe(exporter, ModItems.MOONSTONE_HELMET, ModItems.MOONSTONE);
        offerChestplateRecipe(exporter, ModItems.MOONSTONE_CHESTPLATE, ModItems.MOONSTONE);
        offerLeggingsRecipe(exporter, ModItems.MOONSTONE_LEGGINGS, ModItems.MOONSTONE);
        offerBootsRecipe(exporter, ModItems.MOONSTONE_BOOTS, ModItems.MOONSTONE);

        offerShovelRecipe(exporter, ModItems.FIRE_OPAL_SHOVEL, ModItems.FIRE_OPAL);
        offerPickaxeRecipe(exporter, ModItems.FIRE_OPAL_PICKAXE, ModItems.FIRE_OPAL);
        offerAxeRecipe(exporter, ModItems.FIRE_OPAL_AXE, ModItems.FIRE_OPAL);
        offerHoeRecipe(exporter, ModItems.FIRE_OPAL_HOE, ModItems.FIRE_OPAL);
        offerSwordRecipe(exporter, ModItems.FIRE_OPAL_SWORD, ModItems.FIRE_OPAL);
        offerHelmetRecipe(exporter, ModItems.FIRE_OPAL_HELMET, ModItems.FIRE_OPAL);
        offerChestplateRecipe(exporter, ModItems.FIRE_OPAL_CHESTPLATE, ModItems.FIRE_OPAL);
        offerLeggingsRecipe(exporter, ModItems.FIRE_OPAL_LEGGINGS, ModItems.FIRE_OPAL);
        offerBootsRecipe(exporter, ModItems.FIRE_OPAL_BOOTS, ModItems.FIRE_OPAL);

        offerShovelRecipe(exporter, ModItems.JADEITE_SHOVEL, ModItems.JADEITE);
        offerPickaxeRecipe(exporter, ModItems.JADEITE_PICKAXE, ModItems.JADEITE);
        offerAxeRecipe(exporter, ModItems.JADEITE_AXE, ModItems.JADEITE);
        offerHoeRecipe(exporter, ModItems.JADEITE_HOE, ModItems.JADEITE);
        offerSwordRecipe(exporter, ModItems.JADEITE_SWORD, ModItems.JADEITE);
        offerHelmetRecipe(exporter, ModItems.JADEITE_HELMET, ModItems.JADEITE);
        offerChestplateRecipe(exporter, ModItems.JADEITE_CHESTPLATE, ModItems.JADEITE);
        offerLeggingsRecipe(exporter, ModItems.JADEITE_LEGGINGS, ModItems.JADEITE);
        offerBootsRecipe(exporter, ModItems.JADEITE_BOOTS, ModItems.JADEITE);

        offerShovelRecipe(exporter, ModItems.AMETRINE_SHOVEL, ModItems.AMETRINE);
        offerPickaxeRecipe(exporter, ModItems.AMETRINE_PICKAXE, ModItems.AMETRINE);
        offerAxeRecipe(exporter, ModItems.AMETRINE_AXE, ModItems.AMETRINE);
        offerHoeRecipe(exporter, ModItems.AMETRINE_HOE, ModItems.AMETRINE);
        offerSwordRecipe(exporter, ModItems.AMETRINE_SWORD, ModItems.AMETRINE);
        offerHelmetRecipe(exporter, ModItems.AMETRINE_HELMET, ModItems.AMETRINE);
        offerChestplateRecipe(exporter, ModItems.AMETRINE_CHESTPLATE, ModItems.AMETRINE);
        offerLeggingsRecipe(exporter, ModItems.AMETRINE_LEGGINGS, ModItems.AMETRINE);
        offerBootsRecipe(exporter, ModItems.AMETRINE_BOOTS, ModItems.AMETRINE);

        offerShovelRecipe(exporter, ModItems.CHRYSOBERYL_SHOVEL, ModItems.CHRYSOBERYL);
        offerPickaxeRecipe(exporter, ModItems.CHRYSOBERYL_PICKAXE, ModItems.CHRYSOBERYL);
        offerAxeRecipe(exporter, ModItems.CHRYSOBERYL_AXE, ModItems.CHRYSOBERYL);
        offerHoeRecipe(exporter, ModItems.CHRYSOBERYL_HOE, ModItems.CHRYSOBERYL);
        offerSwordRecipe(exporter, ModItems.CHRYSOBERYL_SWORD, ModItems.CHRYSOBERYL);
        offerHelmetRecipe(exporter, ModItems.CHRYSOBERYL_HELMET, ModItems.CHRYSOBERYL);
        offerChestplateRecipe(exporter, ModItems.CHRYSOBERYL_CHESTPLATE, ModItems.CHRYSOBERYL);
        offerLeggingsRecipe(exporter, ModItems.CHRYSOBERYL_LEGGINGS, ModItems.CHRYSOBERYL);
        offerBootsRecipe(exporter, ModItems.CHRYSOBERYL_BOOTS, ModItems.CHRYSOBERYL);

        offerShovelRecipe(exporter, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE);
        offerPickaxeRecipe(exporter, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE);
        offerAxeRecipe(exporter, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE);
        offerHoeRecipe(exporter, ModItems.SAPPHIRE_HOE, ModItems.SAPPHIRE);
        offerSwordRecipe(exporter, ModItems.SAPPHIRE_SWORD, ModItems.SAPPHIRE);
        offerHelmetRecipe(exporter, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE);
        offerChestplateRecipe(exporter, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE);
        offerLeggingsRecipe(exporter, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE);
        offerBootsRecipe(exporter, ModItems.SAPPHIRE_BOOTS, ModItems.SAPPHIRE);

        offerShovelRecipe(exporter, ModItems.BLACK_DIAMOND_SHOVEL, ModItems.BLACK_DIAMOND);
        offerPickaxeRecipe(exporter, ModItems.BLACK_DIAMOND_PICKAXE, ModItems.BLACK_DIAMOND);
        offerAxeRecipe(exporter, ModItems.BLACK_DIAMOND_AXE, ModItems.BLACK_DIAMOND);
        offerHoeRecipe(exporter, ModItems.BLACK_DIAMOND_HOE, ModItems.BLACK_DIAMOND);
        offerSwordRecipe(exporter, ModItems.BLACK_DIAMOND_SWORD, ModItems.BLACK_DIAMOND);
        offerHelmetRecipe(exporter, ModItems.BLACK_DIAMOND_HELMET, ModItems.BLACK_DIAMOND);
        offerChestplateRecipe(exporter, ModItems.BLACK_DIAMOND_CHESTPLATE, ModItems.BLACK_DIAMOND);
        offerLeggingsRecipe(exporter, ModItems.BLACK_DIAMOND_LEGGINGS, ModItems.BLACK_DIAMOND);
        offerBootsRecipe(exporter, ModItems.BLACK_DIAMOND_BOOTS, ModItems.BLACK_DIAMOND);

        offerShovelRecipe(exporter, ModItems.LONSDALEITE_SHOVEL, ModItems.LONSDALEITE);
        offerPickaxeRecipe(exporter, ModItems.LONSDALEITE_PICKAXE, ModItems.LONSDALEITE);
        offerAxeRecipe(exporter, ModItems.LONSDALEITE_AXE, ModItems.LONSDALEITE);
        offerHoeRecipe(exporter, ModItems.LONSDALEITE_HOE, ModItems.LONSDALEITE);
        offerSwordRecipe(exporter, ModItems.LONSDALEITE_SWORD, ModItems.LONSDALEITE);
        offerHelmetRecipe(exporter, ModItems.LONSDALEITE_HELMET, ModItems.LONSDALEITE);
        offerChestplateRecipe(exporter, ModItems.LONSDALEITE_CHESTPLATE, ModItems.LONSDALEITE);
        offerLeggingsRecipe(exporter, ModItems.LONSDALEITE_LEGGINGS, ModItems.LONSDALEITE);
        offerBootsRecipe(exporter, ModItems.LONSDALEITE_BOOTS, ModItems.LONSDALEITE);

        offerAppleRecipe(exporter, ModItems.MOONSTONE_APPLE, ModItems.MOONSTONE);
        offerAppleRecipe(exporter, ModItems.FIRE_OPAL_APPLE, ModItems.FIRE_OPAL);
        offerAppleRecipe(exporter, ModItems.JADEITE_APPLE, ModItems.JADEITE);
        offerAppleRecipe(exporter, ModItems.AMETRINE_APPLE, ModItems.AMETRINE);
        offerAppleRecipe(exporter, ModItems.CHRYSOBERYL_APPLE, ModItems.CHRYSOBERYL);
        offerAppleRecipe(exporter, ModItems.SAPPHIRE_APPLE, ModItems.SAPPHIRE);
        offerAppleRecipe(exporter, ModItems.BLACK_DIAMOND_APPLE, ModItems.BLACK_DIAMOND);
        offerAppleRecipe(exporter, ModItems.LONSDALEITE_APPLE, ModItems.LONSDALEITE);

        offerCarrotRecipe(exporter, ModItems.MOONSTONE_CARROT, ModItems.MOONSTONE_DUST);
        offerCarrotRecipe(exporter, ModItems.FIRE_OPAL_CARROT, ModItems.FIRE_OPAL_DUST);
        offerCarrotRecipe(exporter, ModItems.JADEITE_CARROT, ModItems.JADEITE_DUST);
        offerCarrotRecipe(exporter, ModItems.AMETRINE_CARROT, ModItems.AMETRINE_DUST);
        offerCarrotRecipe(exporter, ModItems.CHRYSOBERYL_CARROT, ModItems.CHRYSOBERYL_DUST);
        offerCarrotRecipe(exporter, ModItems.SAPPHIRE_CARROT, ModItems.SAPPHIRE_DUST);
        offerCarrotRecipe(exporter, ModItems.BLACK_DIAMOND_CARROT, ModItems.BLACK_DIAMOND_DUST);
        offerCarrotRecipe(exporter, ModItems.LONSDALEITE_CARROT, ModItems.LONSDALEITE_DUST);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.MOONSTONE_DUST, ModItems.MOONSTONE, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FIRE_OPAL_DUST, ModItems.FIRE_OPAL, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.JADEITE_DUST, ModItems.JADEITE, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.AMETRINE_DUST, ModItems.AMETRINE, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.CHRYSOBERYL_DUST, ModItems.CHRYSOBERYL, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE_DUST, ModItems.SAPPHIRE, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.BLACK_DIAMOND_DUST, ModItems.BLACK_DIAMOND, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.LONSDALEITE_DUST, ModItems.LONSDALEITE, 4);

        RecipeProvider.generateFamily(exporter, ModBlockFamilies.SERPENTINITE, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.POLISHED_SERPENTINITE, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.SERPENTINITE_BRICKS, FeatureSet.of(FeatureFlags.VANILLA));

        RecipeProvider.generateFamily(exporter, ModBlockFamilies.MICA_SCHIST, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.POLISHED_MICA_SCHIST, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.MICA_SCHIST_BRICKS, FeatureSet.of(FeatureFlags.VANILLA));

        RecipeProvider.generateFamily(exporter, ModBlockFamilies.LONSDALEITE_METEORITE, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.POLISHED_LONSDALEITE_METEORITE, FeatureSet.of(FeatureFlags.VANILLA));
        RecipeProvider.generateFamily(exporter, ModBlockFamilies.LONSDALEITE_METEORITE_BRICKS, FeatureSet.of(FeatureFlags.VANILLA));

        List<ItemConvertible> serpentiniteStonecutBuilding = Arrays.asList(ModBlocks.SERPENTINITE_STAIRS, ModBlocks.SERPENTINITE_SLAB, ModBlocks.POLISHED_SERPENTINITE, ModBlocks.POLISHED_SERPENTINITE_STAIRS, ModBlocks.POLISHED_SERPENTINITE_SLAB, ModBlocks.SERPENTINITE_BRICKS, ModBlocks.SERPENTINITE_BRICK_STAIRS, ModBlocks.SERPENTINITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SERPENTINITE, serpentiniteStonecutBuilding);
        List<ItemConvertible> serpentiniteStonecutDecoration = Arrays.asList(ModBlocks.SERPENTINITE_WALL, ModBlocks.POLISHED_SERPENTINITE_WALL, ModBlocks.SERPENTINITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.SERPENTINITE, serpentiniteStonecutDecoration);
        List<ItemConvertible> polishedSerpentiniteStonecutBuilding = Arrays.asList(ModBlocks.POLISHED_SERPENTINITE_STAIRS, ModBlocks.POLISHED_SERPENTINITE_SLAB, ModBlocks.SERPENTINITE_BRICKS, ModBlocks.SERPENTINITE_BRICK_STAIRS, ModBlocks.SERPENTINITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SERPENTINITE, polishedSerpentiniteStonecutBuilding);
        List<ItemConvertible> polishedSerpentiniteStonecutDecoration = Arrays.asList(ModBlocks.POLISHED_SERPENTINITE_WALL, ModBlocks.SERPENTINITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_SERPENTINITE, polishedSerpentiniteStonecutDecoration);
        List<ItemConvertible> serpentiniteBricksStonecutBuilding = Arrays.asList(ModBlocks.SERPENTINITE_BRICK_STAIRS, ModBlocks.SERPENTINITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SERPENTINITE_BRICKS, serpentiniteBricksStonecutBuilding);
        List<ItemConvertible> serpentiniteBricksStonecutDecoration = Arrays.asList(ModBlocks.SERPENTINITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.SERPENTINITE_BRICKS, serpentiniteBricksStonecutDecoration);

        List<ItemConvertible> micaSchistStonecutBuilding = Arrays.asList(ModBlocks.MICA_SCHIST_STAIRS, ModBlocks.MICA_SCHIST_SLAB, ModBlocks.POLISHED_MICA_SCHIST, ModBlocks.POLISHED_MICA_SCHIST_STAIRS, ModBlocks.POLISHED_MICA_SCHIST_SLAB, ModBlocks.MICA_SCHIST_BRICKS, ModBlocks.MICA_SCHIST_BRICK_STAIRS, ModBlocks.MICA_SCHIST_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST, micaSchistStonecutBuilding);
        List<ItemConvertible> micaSchistStonecutDecoration = Arrays.asList(ModBlocks.MICA_SCHIST_WALL, ModBlocks.POLISHED_MICA_SCHIST_WALL, ModBlocks.MICA_SCHIST_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.MICA_SCHIST, micaSchistStonecutDecoration);
        List<ItemConvertible> polishedMicaSchistStonecutBuilding = Arrays.asList(ModBlocks.POLISHED_MICA_SCHIST_STAIRS, ModBlocks.POLISHED_MICA_SCHIST_SLAB, ModBlocks.MICA_SCHIST_BRICKS, ModBlocks.MICA_SCHIST_BRICK_STAIRS, ModBlocks.MICA_SCHIST_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MICA_SCHIST, polishedMicaSchistStonecutBuilding);
        List<ItemConvertible> polishedMicaSchistStonecutDecoration = Arrays.asList(ModBlocks.POLISHED_MICA_SCHIST_WALL, ModBlocks.MICA_SCHIST_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_MICA_SCHIST, polishedMicaSchistStonecutDecoration);
        List<ItemConvertible> micaSchistBricksStonecutBuilding = Arrays.asList(ModBlocks.MICA_SCHIST_BRICK_STAIRS, ModBlocks.MICA_SCHIST_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MICA_SCHIST_BRICKS, micaSchistBricksStonecutBuilding);
        List<ItemConvertible> micaSchistBricksStonecutDecoration = Arrays.asList(ModBlocks.MICA_SCHIST_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.MICA_SCHIST_BRICKS, micaSchistBricksStonecutDecoration);

        List<ItemConvertible> lonsdaleiteMeteoriteStonecutBuilding = Arrays.asList(ModBlocks.LONSDALEITE_METEORITE_STAIRS, ModBlocks.LONSDALEITE_METEORITE_SLAB, ModBlocks.POLISHED_LONSDALEITE_METEORITE, ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB, ModBlocks.LONSDALEITE_METEORITE_BRICKS, ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS, ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE, lonsdaleiteMeteoriteStonecutBuilding);
        List<ItemConvertible> lonsdaleiteMeteoriteStonecutDecoration = Arrays.asList(ModBlocks.LONSDALEITE_METEORITE_WALL, ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL, ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.LONSDALEITE_METEORITE, lonsdaleiteMeteoriteStonecutDecoration);
        List<ItemConvertible> polishedLonsdaleiteMeteoriteStonecutBuilding = Arrays.asList(ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS, ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB, ModBlocks.LONSDALEITE_METEORITE_BRICKS, ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS, ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LONSDALEITE_METEORITE, polishedLonsdaleiteMeteoriteStonecutBuilding);
        List<ItemConvertible> polishedLonsdaleiteMeteoriteStonecutDecoration = Arrays.asList(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL, ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.POLISHED_LONSDALEITE_METEORITE, polishedLonsdaleiteMeteoriteStonecutDecoration);
        List<ItemConvertible> lonsdaleiteMeteoriteBricksStonecutBuilding = Arrays.asList(ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS, ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_METEORITE_BRICKS, lonsdaleiteMeteoriteBricksStonecutBuilding);
        List<ItemConvertible> lonsdaleiteMeteoriteBricksStonecutDecoration = Arrays.asList(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);
        offerMultipleStonecuttingRecipes(exporter, RecipeCategory.DECORATIONS, ModBlocks.LONSDALEITE_METEORITE_BRICKS, lonsdaleiteMeteoriteBricksStonecutDecoration);
    }

    // Methods
    public static void offerFrostedGlassRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible base) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8).input('#', base).input('X', input).pattern("###").pattern("#X#").pattern("###").group("stained_glass").criterion("has_glass", conditionsFromItem(base)).offerTo(exporter);
    }

    public static void offerFrostedGlassPaneRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible base) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 8).input('#', base).input('$', input).pattern("###").pattern("#$#").pattern("###").group("stained_glass_pane").criterion("has_glass_pane", conditionsFromItem(base)).offerTo(exporter, convertBetween(output, base));
    }

    public static void offerGemBlockRecipes(RecipeExporter exporter, ItemConvertible gemItem, ItemConvertible gemBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, gemItem, 9).input(gemBlock).criterion(hasItem(gemBlock), conditionsFromItem(gemBlock)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, gemBlock).input('#', gemItem).pattern("###").pattern("###").pattern("###").criterion(hasItem(gemItem), conditionsFromItem(gemItem)).offerTo(exporter);
    }

    public static void offerShovelRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern(" # ").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerPickaxeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("###").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerAxeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("## ").pattern("#S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerHoeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("## ").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerSwordRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).input('S', Items.STICK).pattern(" # ").pattern(" # ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerHelmetRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("###").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerChestplateRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("# #").pattern("###").pattern("###").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerLeggingsRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("###").pattern("# #").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerBootsRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("# #").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerAppleRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, result).input('#', gem).input('A', Items.APPLE).pattern("###").pattern("#A#").pattern("###").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerCarrotRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible dust) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, result).input('#', dust).input('C', Items.CARROT).pattern("###").pattern("#C#").pattern("###").criterion(hasItem(dust), conditionsFromItem(dust)).offerTo(exporter);
    }

    public static void offerMultipleStonecuttingRecipes(RecipeExporter exporter, RecipeCategory category, ItemConvertible input, List<ItemConvertible> outputs) {
        outputs.forEach(output -> offerStonecuttingRecipe(exporter, category, output, input, 1));
    }
}