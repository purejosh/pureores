
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class SapphireHoeItem extends HoeItem {
	public SapphireHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1204;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.SAPPHIRE));
			}
		}, 0, -1f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
