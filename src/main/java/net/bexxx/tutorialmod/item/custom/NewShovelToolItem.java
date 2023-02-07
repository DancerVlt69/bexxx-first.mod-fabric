package net.bexxx.tutorialmod.item.custom;

import net.bexxx.tutorialmod.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class NewShovelToolItem extends ShovelItem {
    public NewShovelToolItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(ModToolMaterials.OMEGA, 2, 3f, settings);
    }
}
