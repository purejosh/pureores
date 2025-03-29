package net.purejosh.pureores.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MOONSTONE(BlockTags.INCORRECT_FOR_IRON_TOOL, 419, 6.0F, 2.2F, 16, () -> Ingredient.ofItems(ModItems.MOONSTONE)),
    FIRE_OPAL(BlockTags.INCORRECT_FOR_IRON_TOOL, 521, 6.0F, 2.4F, 12, () -> Ingredient.ofItems(ModItems.FIRE_OPAL)),
    JADEITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 636, 7.0F, 2.4F, 18, () -> Ingredient.ofItems(ModItems.JADEITE)),
    AMETRINE(BlockTags.INCORRECT_FOR_IRON_TOOL, 762, 8.0F, 2.6F, 22, () -> Ingredient.ofItems(ModItems.AMETRINE)),
    CHRYSOBERYL(BlockTags.INCORRECT_FOR_IRON_TOOL, 899, 7.0F, 2.6F, 22, () -> Ingredient.ofItems(ModItems.CHRYSOBERYL)),
    SAPPHIRE(BlockTags.INCORRECT_FOR_IRON_TOOL, 1204, 8.0F, 2.8F, 14, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    BLACK_DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1786, 10.0F, 3.6F, 12, () -> Ingredient.ofItems(ModItems.BLACK_DIAMOND)),
    LONSDALEITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2467, 14.0F, 4.4F, 25, () -> Ingredient.ofItems(ModItems.LONSDALEITE));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}