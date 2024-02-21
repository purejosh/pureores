
package net.purejosh.pureores.item;

import net.purejosh.pureores.procedures.FireOpalItemIsCraftedProcedure;
import net.purejosh.pureores.init.PureoresModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.entity.player.Player;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class FireOpalSwordItem extends SwordItem {
	public FireOpalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 521;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2.4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureoresModItems.FIRE_OPAL));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(this));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		FireOpalItemIsCraftedProcedure.execute(itemstack);
	}
}
