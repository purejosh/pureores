
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.lang.reflect.Type;

public abstract class SapphireArmorItem extends ArmorItem {
	public SapphireArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 29;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{3, 6, 7, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.SAPPHIRE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "sapphire";
			}

			@Override
			public float getToughness() {
				return 1.4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends SapphireArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Chestplate extends SapphireArmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Leggings extends SapphireArmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}

	public static class Boots extends SapphireArmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}

	}
}
