package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.purejosh.pureores.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.MOONSTONE)
                .add(ModItems.FIRE_OPAL)
                .add(ModItems.JADEITE)
                .add(ModItems.AMETRINE)
                .add(ModItems.CHRYSOBERYL)
                .add(ModItems.SAPPHIRE)
                .add(ModItems.BLACK_DIAMOND)
                .add(ModItems.LONSDALEITE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.MOONSTONE_SHOVEL)
                .add(ModItems.FIRE_OPAL_SHOVEL)
                .add(ModItems.JADEITE_SHOVEL)
                .add(ModItems.AMETRINE_SHOVEL)
                .add(ModItems.CHRYSOBERYL_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL)
                .add(ModItems.BLACK_DIAMOND_SHOVEL)
                .add(ModItems.LONSDALEITE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.MOONSTONE_PICKAXE)
                .add(ModItems.FIRE_OPAL_PICKAXE)
                .add(ModItems.JADEITE_PICKAXE)
                .add(ModItems.AMETRINE_PICKAXE)
                .add(ModItems.CHRYSOBERYL_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.BLACK_DIAMOND_PICKAXE)
                .add(ModItems.LONSDALEITE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.MOONSTONE_AXE)
                .add(ModItems.FIRE_OPAL_AXE)
                .add(ModItems.JADEITE_AXE)
                .add(ModItems.AMETRINE_AXE)
                .add(ModItems.CHRYSOBERYL_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.BLACK_DIAMOND_AXE)
                .add(ModItems.LONSDALEITE_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MOONSTONE_HOE)
                .add(ModItems.FIRE_OPAL_HOE)
                .add(ModItems.JADEITE_HOE)
                .add(ModItems.AMETRINE_HOE)
                .add(ModItems.CHRYSOBERYL_HOE)
                .add(ModItems.SAPPHIRE_HOE)
                .add(ModItems.BLACK_DIAMOND_HOE)
                .add(ModItems.LONSDALEITE_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.MOONSTONE_SWORD)
                .add(ModItems.FIRE_OPAL_SWORD)
                .add(ModItems.JADEITE_SWORD)
                .add(ModItems.AMETRINE_SWORD)
                .add(ModItems.CHRYSOBERYL_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.BLACK_DIAMOND_SWORD)
                .add(ModItems.LONSDALEITE_SWORD);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.MOONSTONE_HELMET)
                .add(ModItems.FIRE_OPAL_HELMET)
                .add(ModItems.JADEITE_HELMET)
                .add(ModItems.AMETRINE_HELMET)
                .add(ModItems.CHRYSOBERYL_HELMET)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.BLACK_DIAMOND_HELMET)
                .add(ModItems.LONSDALEITE_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.MOONSTONE_CHESTPLATE)
                .add(ModItems.FIRE_OPAL_CHESTPLATE)
                .add(ModItems.JADEITE_CHESTPLATE)
                .add(ModItems.AMETRINE_CHESTPLATE)
                .add(ModItems.CHRYSOBERYL_CHESTPLATE)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.BLACK_DIAMOND_CHESTPLATE)
                .add(ModItems.LONSDALEITE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.MOONSTONE_LEGGINGS)
                .add(ModItems.FIRE_OPAL_LEGGINGS)
                .add(ModItems.JADEITE_LEGGINGS)
                .add(ModItems.AMETRINE_LEGGINGS)
                .add(ModItems.CHRYSOBERYL_LEGGINGS)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.BLACK_DIAMOND_LEGGINGS)
                .add(ModItems.LONSDALEITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.MOONSTONE_BOOTS)
                .add(ModItems.FIRE_OPAL_BOOTS)
                .add(ModItems.JADEITE_BOOTS)
                .add(ModItems.AMETRINE_BOOTS)
                .add(ModItems.CHRYSOBERYL_BOOTS)
                .add(ModItems.SAPPHIRE_BOOTS)
                .add(ModItems.BLACK_DIAMOND_BOOTS)
                .add(ModItems.LONSDALEITE_BOOTS);

        getOrCreateTagBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
                .add(ModItems.MOONSTONE_SWORD)
                .add(ModItems.FIRE_OPAL_SWORD)
                .add(ModItems.JADEITE_SWORD)
                .add(ModItems.AMETRINE_SWORD)
                .add(ModItems.CHRYSOBERYL_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.BLACK_DIAMOND_SWORD)
                .add(ModItems.LONSDALEITE_SWORD)
                .add(ModItems.MOONSTONE_AXE)
                .add(ModItems.FIRE_OPAL_AXE)
                .add(ModItems.JADEITE_AXE)
                .add(ModItems.AMETRINE_AXE)
                .add(ModItems.CHRYSOBERYL_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.BLACK_DIAMOND_AXE)
                .add(ModItems.LONSDALEITE_AXE);

        getOrCreateTagBuilder(ConventionalItemTags.MINING_TOOL_TOOLS)
                .add(ModItems.MOONSTONE_PICKAXE)
                .add(ModItems.FIRE_OPAL_PICKAXE)
                .add(ModItems.JADEITE_PICKAXE)
                .add(ModItems.AMETRINE_PICKAXE)
                .add(ModItems.CHRYSOBERYL_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.BLACK_DIAMOND_PICKAXE)
                .add(ModItems.LONSDALEITE_PICKAXE);
    }
}
