    package net.purejosh.pureores.item;

    import net.minecraft.item.ArmorItem;
    import net.minecraft.item.ArmorMaterial;
    import net.minecraft.recipe.Ingredient;
    import net.minecraft.registry.Registries;
    import net.minecraft.registry.Registry;
    import net.minecraft.registry.entry.RegistryEntry;
    import net.minecraft.sound.SoundEvent;
    import net.minecraft.sound.SoundEvents;
    import net.minecraft.util.Identifier;
    import net.minecraft.util.Util;
    import net.purejosh.pureores.PureOres;

    import java.util.EnumMap;
    import java.util.List;
    import java.util.function.Supplier;

    public class ModArmorMaterials {

        // Armor materials and their properties
        public static final RegistryEntry<ArmorMaterial> MOONSTONE = register("moonstone",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 2);
                    map.put(ArmorItem.Type.CHESTPLATE, 6);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 8);
                }), 22, 0.4F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.MOONSTONE));
        public static final int MOONSTONE_DURABILITY = 18;

        public static final RegistryEntry<ArmorMaterial> FIRE_OPAL = register("fire_opal",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 6);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 9);
                }), 10, 0.6F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.FIRE_OPAL));
        public static final int FIRE_OPAL_DURABILITY = 20;

        public static final RegistryEntry<ArmorMaterial> JADEITE = register("jadeite",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 6);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 9);
                }), 20, 0.8F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.JADEITE));
        public static final int JADEITE_DURABILITY = 22;

        public static final RegistryEntry<ArmorMaterial> AMETRINE = register("ametrine",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 7);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 10);
                }), 20, 1.0F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.AMETRINE));
        public static final int AMETRINE_DURABILITY = 24;

        public static final RegistryEntry<ArmorMaterial> CHRYSOBERYL = register("chrysoberyl",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 7);
                    map.put(ArmorItem.Type.LEGGINGS, 5);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 10);
                }), 18, 1.2F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.CHRYSOBERYL));
        public static final int CHRYSOBERYL_DURABILITY = 25;

        public static final RegistryEntry<ArmorMaterial> SAPPHIRE = register("sapphire",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 7);
                    map.put(ArmorItem.Type.LEGGINGS, 6);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 10);
                }), 22, 1.6F, 0.0F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.SAPPHIRE));
        public static final int SAPPHIRE_DURABILITY = 29;

        public static final RegistryEntry<ArmorMaterial> BLACK_DIAMOND = register("black_diamond",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 3);
                    map.put(ArmorItem.Type.CHESTPLATE, 8);
                    map.put(ArmorItem.Type.LEGGINGS, 6);
                    map.put(ArmorItem.Type.BOOTS, 3);
                    map.put(ArmorItem.Type.BODY, 11);
                }), 12, 2.4F, 0.1F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.BLACK_DIAMOND));
        public static final int BLACK_DIAMOND_DURABILITY = 35;

        public static final RegistryEntry<ArmorMaterial> LONSDALEITE = register("lonsdaleite",
                Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                    map.put(ArmorItem.Type.HELMET, 4);
                    map.put(ArmorItem.Type.CHESTPLATE, 8);
                    map.put(ArmorItem.Type.LEGGINGS, 6);
                    map.put(ArmorItem.Type.BOOTS, 4);
                    map.put(ArmorItem.Type.BODY, 12);
                }), 25, 3.4F, 0.2F,
                SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.LONSDALEITE));
        public static final int LONSDALEITE_DURABILITY = 41;

        // Helper methods
        private static RegistryEntry<ArmorMaterial> register(
                String id,
                EnumMap<ArmorItem.Type, Integer> defense,
                int enchant,
                float tough,
                float knockback,
                RegistryEntry<SoundEvent> equipSound,
                Supplier<Ingredient> repairItem
        ) {
            List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(PureOres.MOD_ID, id)));
            return register(id, defense, enchant, tough, knockback, equipSound, repairItem, list);
        }

        private static RegistryEntry<ArmorMaterial> register(
                String id,
                EnumMap<ArmorItem.Type, Integer> defense,
                int enchant,
                float tough,
                float knockback,
                RegistryEntry<SoundEvent> equipSound,
                Supplier<Ingredient> repairItem,
                List<ArmorMaterial.Layer> layers
        ) {
            EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);

            for (ArmorItem.Type type : ArmorItem.Type.values()) {
                enumMap.put(type, defense.get(type));
            }

            return Registry.registerReference(
                    Registries.ARMOR_MATERIAL, Identifier.of(PureOres.MOD_ID, id),
                    new ArmorMaterial(enumMap, enchant, equipSound, repairItem, layers, tough, knockback)
            );
        }

        // Initialization called from the entrypoint, as this armor material needs to be added to the registry.
        public static void init() {
        }
    }
