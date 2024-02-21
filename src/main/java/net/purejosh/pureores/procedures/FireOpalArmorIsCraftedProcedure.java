package net.purejosh.pureores.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class FireOpalArmorIsCraftedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.FIRE_PROTECTION, 2);
	}
}
