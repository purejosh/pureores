package net.purejosh.pureores.item;

import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.pureores.PureOres;

public class ModItems {
    // Changed my code formatting a bit here, due to the sheer amount of items being registered. I didn't want to add too many helper methods, either, since that would make the code less readable.
    // Tools & Utilities
    public static final Item MOONSTONE_SHOVEL = register("moonstone_shovel", new ShovelItem(ModToolMaterials.MOONSTONE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MOONSTONE,1.5f, -3.0f))));
    public static final Item MOONSTONE_PICKAXE = register("moonstone_pickaxe", new PickaxeItem(ModToolMaterials.MOONSTONE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MOONSTONE,1.0f, -2.8f))));
    public static final Item MOONSTONE_AXE = register("moonstone_axe", new AxeItem(ModToolMaterials.MOONSTONE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MOONSTONE,5.8f, -3.1f))));
    public static final Item MOONSTONE_HOE = register("moonstone_hoe", new HoeItem(ModToolMaterials.MOONSTONE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MOONSTONE,-2.2f, -1.0f))));
    public static final Item FIRE_OPAL_SHOVEL = register("fire_opal_shovel", new ShovelItem(ModToolMaterials.FIRE_OPAL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.FIRE_OPAL,1.5f, -3.0f))));
    public static final Item FIRE_OPAL_PICKAXE = register("fire_opal_pickaxe", new PickaxeItem(ModToolMaterials.FIRE_OPAL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FIRE_OPAL,1.0f, -2.8f))));
    public static final Item FIRE_OPAL_AXE = register("fire_opal_axe", new AxeItem(ModToolMaterials.FIRE_OPAL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.FIRE_OPAL,5.6f, -3.1f))));
    public static final Item FIRE_OPAL_HOE = register("fire_opal_hoe", new HoeItem(ModToolMaterials.FIRE_OPAL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.FIRE_OPAL,-2.4f, -1.0f))));
    public static final Item JADEITE_SHOVEL = register("jadeite_shovel", new ShovelItem(ModToolMaterials.JADEITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.JADEITE,1.5f, -3.0f))));
    public static final Item JADEITE_PICKAXE = register("jadeite_pickaxe", new PickaxeItem(ModToolMaterials.JADEITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.JADEITE,1.0f, -2.8f))));
    public static final Item JADEITE_AXE = register("jadeite_axe", new AxeItem(ModToolMaterials.JADEITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.JADEITE,5.6f, -3.1f))));
    public static final Item JADEITE_HOE = register("jadeite_hoe", new HoeItem(ModToolMaterials.JADEITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.JADEITE,-2.4f, -1.0f))));
    public static final Item AMETRINE_SHOVEL = register("ametrine_shovel", new ShovelItem(ModToolMaterials.AMETRINE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AMETRINE,1.5f, -3.0f))));
    public static final Item AMETRINE_PICKAXE = register("ametrine_pickaxe", new PickaxeItem(ModToolMaterials.AMETRINE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AMETRINE,1.0f, -2.8f))));
    public static final Item AMETRINE_AXE = register("ametrine_axe", new AxeItem(ModToolMaterials.AMETRINE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AMETRINE,5.4f, -3.1f))));
    public static final Item AMETRINE_HOE = register("ametrine_hoe", new HoeItem(ModToolMaterials.AMETRINE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AMETRINE,-2.6f, -1.0f))));
    public static final Item CHRYSOBERYL_SHOVEL = register("chrysoberyl_shovel", new ShovelItem(ModToolMaterials.CHRYSOBERYL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CHRYSOBERYL,1.5f, -3.0f))));
    public static final Item CHRYSOBERYL_PICKAXE = register("chrysoberyl_pickaxe", new PickaxeItem(ModToolMaterials.CHRYSOBERYL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CHRYSOBERYL,1.0f, -2.8f))));
    public static final Item CHRYSOBERYL_AXE = register("chrysoberyl_axe", new AxeItem(ModToolMaterials.CHRYSOBERYL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CHRYSOBERYL,5.4f, -3.1f))));
    public static final Item CHRYSOBERYL_HOE = register("chrysoberyl_hoe", new HoeItem(ModToolMaterials.CHRYSOBERYL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CHRYSOBERYL,-2.6f, -1.0f))));
    public static final Item SAPPHIRE_SHOVEL = register("sapphire_shovel", new ShovelItem(ModToolMaterials.SAPPHIRE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE,1.5f, -3.0f))));
    public static final Item SAPPHIRE_PICKAXE = register("sapphire_pickaxe", new PickaxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE,1.0f, -2.8f))));
    public static final Item SAPPHIRE_AXE = register("sapphire_axe", new AxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE,5.2f, -3.1f))));
    public static final Item SAPPHIRE_HOE = register("sapphire_hoe", new HoeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE,-2.8f, -1.0f))));
    public static final Item BLACK_DIAMOND_SHOVEL = register("black_diamond_shovel", new ShovelItem(ModToolMaterials.BLACK_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLACK_DIAMOND,1.5f, -3.0f))));
    public static final Item BLACK_DIAMOND_PICKAXE = register("black_diamond_pickaxe", new PickaxeItem(ModToolMaterials.BLACK_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLACK_DIAMOND,1.0f, -2.8f))));
    public static final Item BLACK_DIAMOND_AXE = register("black_diamond_axe", new AxeItem(ModToolMaterials.BLACK_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLACK_DIAMOND,4.4f, -3.0f))));
    public static final Item BLACK_DIAMOND_HOE = register("black_diamond_hoe", new HoeItem(ModToolMaterials.BLACK_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLACK_DIAMOND,-3.6f, 0.0f))));
    public static final Item LONSDALEITE_SHOVEL = register("lonsdaleite_shovel", new ShovelItem(ModToolMaterials.LONSDALEITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LONSDALEITE,1.5f, -3.0f))));
    public static final Item LONSDALEITE_PICKAXE = register("lonsdaleite_pickaxe", new PickaxeItem(ModToolMaterials.LONSDALEITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LONSDALEITE,1.0f, -2.8f))));
    public static final Item LONSDALEITE_AXE = register("lonsdaleite_axe", new AxeItem(ModToolMaterials.LONSDALEITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LONSDALEITE,4.6f, -3.0f))));
    public static final Item LONSDALEITE_HOE = register("lonsdaleite_hoe", new HoeItem(ModToolMaterials.LONSDALEITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LONSDALEITE,-4.4f, 0.0f))));

    // Combat
    public static final Item MOONSTONE_SWORD = register("moonstone_sword", new SwordItem(ModToolMaterials.MOONSTONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MOONSTONE,3, -2.4f))));
    public static final Item FIRE_OPAL_SWORD = register("fire_opal_sword", new SwordItem(ModToolMaterials.FIRE_OPAL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FIRE_OPAL,3, -2.4f))));
    public static final Item JADEITE_SWORD = register("jadeite_sword", new SwordItem(ModToolMaterials.JADEITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADEITE,3, -2.4f))));
    public static final Item AMETRINE_SWORD = register("ametrine_sword", new SwordItem(ModToolMaterials.AMETRINE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETRINE,3, -2.4f))));
    public static final Item CHRYSOBERYL_SWORD = register("chrysoberyl_sword", new SwordItem(ModToolMaterials.CHRYSOBERYL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRYSOBERYL,3, -2.4f))));
    public static final Item SAPPHIRE_SWORD = register("sapphire_sword", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE,3, -2.4f))));
    public static final Item BLACK_DIAMOND_SWORD = register("black_diamond_sword", new SwordItem(ModToolMaterials.BLACK_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLACK_DIAMOND,3, -2.4f))));
    public static final Item LONSDALEITE_SWORD = register("lonsdaleite_sword", new SwordItem(ModToolMaterials.LONSDALEITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LONSDALEITE,3, -2.4f))));
    public static final Item MOONSTONE_HELMET = register("moonstone_helmet", new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.MOONSTONE_DURABILITY))));
    public static final Item MOONSTONE_CHESTPLATE = register("moonstone_chestplate", new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.MOONSTONE_DURABILITY))));
    public static final Item MOONSTONE_LEGGINGS = register("moonstone_leggings", new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.MOONSTONE_DURABILITY))));
    public static final Item MOONSTONE_BOOTS = register("moonstone_boots", new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.MOONSTONE_DURABILITY))));
    public static final Item FIRE_OPAL_HELMET = register("fire_opal_helmet", new ArmorItem(ModArmorMaterials.FIRE_OPAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.FIRE_OPAL_DURABILITY))));
    public static final Item FIRE_OPAL_CHESTPLATE = register("fire_opal_chestplate", new ArmorItem(ModArmorMaterials.FIRE_OPAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.FIRE_OPAL_DURABILITY))));
    public static final Item FIRE_OPAL_LEGGINGS = register("fire_opal_leggings", new ArmorItem(ModArmorMaterials.FIRE_OPAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.FIRE_OPAL_DURABILITY))));
    public static final Item FIRE_OPAL_BOOTS = register("fire_opal_boots", new ArmorItem(ModArmorMaterials.FIRE_OPAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.FIRE_OPAL_DURABILITY))));
    public static final Item JADEITE_HELMET = register("jadeite_helmet", new ArmorItem(ModArmorMaterials.JADEITE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.JADEITE_DURABILITY))));
    public static final Item JADEITE_CHESTPLATE = register("jadeite_chestplate", new ArmorItem(ModArmorMaterials.JADEITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.JADEITE_DURABILITY))));
    public static final Item JADEITE_LEGGINGS = register("jadeite_leggings", new ArmorItem(ModArmorMaterials.JADEITE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.JADEITE_DURABILITY))));
    public static final Item JADEITE_BOOTS = register("jadeite_boots", new ArmorItem(ModArmorMaterials.JADEITE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.JADEITE_DURABILITY))));
    public static final Item AMETRINE_HELMET = register("ametrine_helmet", new ArmorItem(ModArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.AMETRINE_DURABILITY))));
    public static final Item AMETRINE_CHESTPLATE = register("ametrine_chestplate", new ArmorItem(ModArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.AMETRINE_DURABILITY))));
    public static final Item AMETRINE_LEGGINGS = register("ametrine_leggings", new ArmorItem(ModArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.AMETRINE_DURABILITY))));
    public static final Item AMETRINE_BOOTS = register("ametrine_boots", new ArmorItem(ModArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.AMETRINE_DURABILITY))));
    public static final Item CHRYSOBERYL_HELMET = register("chrysoberyl_helmet", new ArmorItem(ModArmorMaterials.CHRYSOBERYL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.CHRYSOBERYL_DURABILITY))));
    public static final Item CHRYSOBERYL_CHESTPLATE = register("chrysoberyl_chestplate", new ArmorItem(ModArmorMaterials.CHRYSOBERYL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.CHRYSOBERYL_DURABILITY))));
    public static final Item CHRYSOBERYL_LEGGINGS = register("chrysoberyl_leggings", new ArmorItem(ModArmorMaterials.CHRYSOBERYL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.CHRYSOBERYL_DURABILITY))));
    public static final Item CHRYSOBERYL_BOOTS = register("chrysoberyl_boots", new ArmorItem(ModArmorMaterials.CHRYSOBERYL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.CHRYSOBERYL_DURABILITY))));
    public static final Item SAPPHIRE_HELMET = register("sapphire_helmet", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.SAPPHIRE_DURABILITY))));
    public static final Item SAPPHIRE_CHESTPLATE = register("sapphire_chestplate", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.SAPPHIRE_DURABILITY))));
    public static final Item SAPPHIRE_LEGGINGS = register("sapphire_leggings", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.SAPPHIRE_DURABILITY))));
    public static final Item SAPPHIRE_BOOTS = register("sapphire_boots", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.SAPPHIRE_DURABILITY))));
    public static final Item BLACK_DIAMOND_HELMET = register("black_diamond_helmet", new ArmorItem(ModArmorMaterials.BLACK_DIAMOND, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.BLACK_DIAMOND_DURABILITY))));
    public static final Item BLACK_DIAMOND_CHESTPLATE = register("black_diamond_chestplate", new ArmorItem(ModArmorMaterials.BLACK_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.BLACK_DIAMOND_DURABILITY))));
    public static final Item BLACK_DIAMOND_LEGGINGS = register("black_diamond_leggings", new ArmorItem(ModArmorMaterials.BLACK_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.BLACK_DIAMOND_DURABILITY))));
    public static final Item BLACK_DIAMOND_BOOTS = register("black_diamond_boots", new ArmorItem(ModArmorMaterials.BLACK_DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.BLACK_DIAMOND_DURABILITY))));
    public static final Item LONSDALEITE_HELMET = register("lonsdaleite_helmet", new ArmorItem(ModArmorMaterials.LONSDALEITE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.LONSDALEITE_DURABILITY))));
    public static final Item LONSDALEITE_CHESTPLATE = register("lonsdaleite_chestplate", new ArmorItem(ModArmorMaterials.LONSDALEITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.LONSDALEITE_DURABILITY))));
    public static final Item LONSDALEITE_LEGGINGS = register("lonsdaleite_leggings", new ArmorItem(ModArmorMaterials.LONSDALEITE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.LONSDALEITE_DURABILITY))));
    public static final Item LONSDALEITE_BOOTS = register("lonsdaleite_boots", new ArmorItem(ModArmorMaterials.LONSDALEITE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.LONSDALEITE_DURABILITY))));

    // Food & Drinks
    public static final Item MOONSTONE_APPLE = register("moonstone_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item FIRE_OPAL_APPLE = register("fire_opal_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item JADEITE_APPLE = register("jadeite_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item AMETRINE_APPLE = register("ametrine_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item CHRYSOBERYL_APPLE = register("chrysoberyl_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item SAPPHIRE_APPLE = register("sapphire_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item BLACK_DIAMOND_APPLE = register("black_diamond_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item LONSDALEITE_APPLE = register("lonsdaleite_apple", new Item(new Item.Settings().rarity(Rarity.RARE).food(FoodComponents.GOLDEN_APPLE)));
    public static final Item MOONSTONE_CARROT = register("moonstone_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item FIRE_OPAL_CARROT = register("fire_opal_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item JADEITE_CARROT = register("jadeite_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item AMETRINE_CARROT = register("ametrine_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item CHRYSOBERYL_CARROT = register("chrysoberyl_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item SAPPHIRE_CARROT = register("sapphire_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item BLACK_DIAMOND_CARROT = register("black_diamond_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item LONSDALEITE_CARROT = register("lonsdaleite_carrot", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));

    // Ingredients
    public static final Item MOONSTONE = register("moonstone", new Item(new Item.Settings()));
    public static final Item FIRE_OPAL = register("fire_opal", new Item(new Item.Settings()));
    public static final Item JADEITE = register("jadeite", new Item(new Item.Settings()));
    public static final Item AMETRINE = register("ametrine", new Item(new Item.Settings()));
    public static final Item CHRYSOBERYL = register("chrysoberyl", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = register("sapphire", new Item(new Item.Settings()));
    public static final Item BLACK_DIAMOND = register("black_diamond", new Item(new Item.Settings()));
    public static final Item LONSDALEITE = register("lonsdaleite", new Item(new Item.Settings()));
    public static final Item MOONSTONE_DUST = register("moonstone_dust", new Item(new Item.Settings()));
    public static final Item FIRE_OPAL_DUST = register("fire_opal_dust", new Item(new Item.Settings()));
    public static final Item JADEITE_DUST = register("jadeite_dust", new Item(new Item.Settings()));
    public static final Item AMETRINE_DUST = register("ametrine_dust", new Item(new Item.Settings()));
    public static final Item CHRYSOBERYL_DUST = register("chrysoberyl_dust", new Item(new Item.Settings()));
    public static final Item SAPPHIRE_DUST = register("sapphire_dust", new Item(new Item.Settings()));
    public static final Item BLACK_DIAMOND_DUST = register("black_diamond_dust", new Item(new Item.Settings()));
    public static final Item LONSDALEITE_DUST = register("lonsdaleite_dust", new Item(new Item.Settings()));

    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PureOres.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
