
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class BlackDiamondSwordItem extends SwordItem {
	public BlackDiamondSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1786;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3.6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.BLACK_DIAMOND));
			}
		}, 3, -2.4f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
	}
}
