package net.bexxx.tutorialmod.item.util.tiers;

import net.bexxx.tutorialmod.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum ModToolMaterials implements ToolMaterial {

	CITRINE(5, 2200, 12.0F, 4.0F, 30,
			Ingredient.ofItems(ModItems.CITRINE, ModItems.RAW_CITRINE)),

    TANZANITE(5, 2200, 12.0F, 4.0F, 30,
			Ingredient.ofItems(ModItems.TANZANITE, ModItems.RAW_TANZANITE)),

    OMEGA(7, 6100, 23.0F, 4.0F, 30,
			Ingredient.ofItems(ModItems.TANZANITE_SHARD_PIECE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }
    @Override
    public int getDurability() { return itemDurability; }

    @Override
    public float getMiningSpeedMultiplier() { return miningSpeed; }

    @Override
    public float getAttackDamage() { return attackDamage; }

    @Override
    public int getMiningLevel() { return miningLevel; }

    @Override
    public int getEnchantability() { return enchantability; }

    @Override
    public Ingredient getRepairIngredient() { return repairIngredient; }
}
