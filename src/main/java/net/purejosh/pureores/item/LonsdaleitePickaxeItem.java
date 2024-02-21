
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class LonsdaleitePickaxeItem extends PickaxeItem {
	public LonsdaleitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2467;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 4.4f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.LONSDALEITE));
			}
		}, 1, -2.8f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
