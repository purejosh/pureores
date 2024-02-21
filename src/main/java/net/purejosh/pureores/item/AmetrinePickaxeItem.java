
package net.purejosh.pureores.item;

import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class AmetrinePickaxeItem extends PickaxeItem {
	public AmetrinePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 762;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2.6f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.AMETRINE));
			}
		}, 1, -2.8f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
