
package net.purejosh.pureores.item;

import net.purejosh.pureores.procedures.FireOpalArmorIsCraftedProcedure;
import net.purejosh.pureores.init.PureoresModSounds;
import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.lang.reflect.Type;

public abstract class FireOpalArmorItem extends ArmorItem {
	public FireOpalArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 20;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{3, 5, 6, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return PureoresModSounds.EQUIP_FIRE_OPAL;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.FIRE_OPAL));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "fire_opal";
			}

			@Override
			public float getToughness() {
				return 0.6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		FireOpalArmorIsCraftedProcedure.execute(itemstack);
	}

	public static class Helmet extends FireOpalArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}
	}

	public static class Chestplate extends FireOpalArmorItem {
		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}
	}

	public static class Leggings extends FireOpalArmorItem {
		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}
	}

	public static class Boots extends FireOpalArmorItem {
		public Boots() {
			super(Type.BOOTS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
		}
	}
}
