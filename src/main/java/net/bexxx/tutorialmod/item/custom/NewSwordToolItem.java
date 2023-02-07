package net.bexxx.tutorialmod.item.custom;

import net.bexxx.tutorialmod.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class NewSwordToolItem extends SwordItem {
    public NewSwordToolItem(ModToolMaterials material, float attackDamage, float attackSpeed, Settings settings) {
        super(ModToolMaterials.OMEGA, 20, 10f, settings);
    }
}
