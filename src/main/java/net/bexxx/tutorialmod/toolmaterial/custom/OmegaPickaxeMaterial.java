package net.bexxx.tutorialmod.toolmaterial.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Material;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OmegaPickaxeMaterial implements ToolMaterial {

    public OmegaPickaxeMaterial(FabricItemSettings group) {

    }

    @Override
    public int getDurability() {
        return 6132;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 30;
    }
    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }

}
