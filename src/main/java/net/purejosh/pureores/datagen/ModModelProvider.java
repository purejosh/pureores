package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.data.family.ModBlockFamilies;
import net.purejosh.pureores.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Building Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOONSTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADEITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETRINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHRYSOBERYL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LONSDALEITE_BLOCK);

        // Colored Blocks
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOONSTONE_GLASS, ModBlocks.MOONSTONE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FIRE_OPAL_GLASS, ModBlocks.FIRE_OPAL_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.JADEITE_GLASS, ModBlocks.JADEITE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.AMETRINE_GLASS, ModBlocks.AMETRINE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.CHRYSOBERYL_GLASS, ModBlocks.CHRYSOBERYL_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.SAPPHIRE_GLASS, ModBlocks.SAPPHIRE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.BLACK_DIAMOND_GLASS, ModBlocks.BLACK_DIAMOND_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LONSDALEITE_GLASS, ModBlocks.LONSDALEITE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_MOONSTONE_GLASS, ModBlocks.FROSTED_MOONSTONE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_FIRE_OPAL_GLASS, ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_JADEITE_GLASS, ModBlocks.FROSTED_JADEITE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_AMETRINE_GLASS, ModBlocks.FROSTED_AMETRINE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_CHRYSOBERYL_GLASS, ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_SAPPHIRE_GLASS, ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS, ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.FROSTED_LONSDALEITE_GLASS, ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE);

        // Natural Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOONSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_FIRE_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADEITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_AMETRINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHRYSOBERYL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LONSDALEITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.SERPENTINITE.getBaseBlock()).family(ModBlockFamilies.SERPENTINITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.POLISHED_SERPENTINITE.getBaseBlock()).family(ModBlockFamilies.POLISHED_SERPENTINITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.SERPENTINITE_BRICKS.getBaseBlock()).family(ModBlockFamilies.SERPENTINITE_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.MICA_SCHIST.getBaseBlock()).family(ModBlockFamilies.MICA_SCHIST);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.POLISHED_MICA_SCHIST.getBaseBlock()).family(ModBlockFamilies.POLISHED_MICA_SCHIST);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.MICA_SCHIST_BRICKS.getBaseBlock()).family(ModBlockFamilies.MICA_SCHIST_BRICKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.LONSDALEITE_METEORITE.getBaseBlock()).family(ModBlockFamilies.LONSDALEITE_METEORITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.POLISHED_LONSDALEITE_METEORITE.getBaseBlock()).family(ModBlockFamilies.POLISHED_LONSDALEITE_METEORITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlockFamilies.LONSDALEITE_METEORITE_BRICKS.getBaseBlock()).family(ModBlockFamilies.LONSDALEITE_METEORITE_BRICKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Tools & Utilities
        itemModelGenerator.register(ModItems.MOONSTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOONSTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOONSTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MOONSTONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADEITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADEITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADEITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADEITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETRINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETRINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETRINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETRINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LONSDALEITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LONSDALEITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LONSDALEITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LONSDALEITE_HOE, Models.HANDHELD);

        // Combat
        itemModelGenerator.register(ModItems.MOONSTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_OPAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADEITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETRINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LONSDALEITE_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MOONSTONE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MOONSTONE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MOONSTONE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MOONSTONE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FIRE_OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FIRE_OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FIRE_OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FIRE_OPAL_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADEITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADEITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADEITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADEITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETRINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETRINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETRINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETRINE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHRYSOBERYL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHRYSOBERYL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHRYSOBERYL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHRYSOBERYL_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_DIAMOND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_DIAMOND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_DIAMOND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_DIAMOND_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LONSDALEITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LONSDALEITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LONSDALEITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LONSDALEITE_BOOTS));

        // Food & Drinks
        itemModelGenerator.register(ModItems.MOONSTONE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_OPAL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADEITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETRINE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONSDALEITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOONSTONE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_OPAL_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADEITE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETRINE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONSDALEITE_CARROT, Models.GENERATED);

        // Ingredients
        itemModelGenerator.register(ModItems.MOONSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADEITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETRINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHRYSOBERYL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONSDALEITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOONSTONE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_OPAL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADEITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETRINE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHRYSOBERYL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONSDALEITE_DUST, Models.GENERATED);
    }
}
