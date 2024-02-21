
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MoonstoneSwordItem extends SwordItem {
	public MoonstoneSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 419;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2.2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.MOONSTONE));
			}
		}, 3, -2.4f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
	}
}
