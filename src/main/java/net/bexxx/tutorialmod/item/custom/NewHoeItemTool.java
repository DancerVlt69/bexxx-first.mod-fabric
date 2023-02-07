package net.bexxx.tutorialmod.item.custom;

import net.bexxx.tutorialmod.toolmaterial.custom.ModToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class NewHoeItemTool extends HoeItem {
    public NewHoeItemTool(ModToolMaterials material, float attackDamage, float attackSpeed, Settings settings) {
        super(ModToolMaterials.OMEGA, 5, 2f, settings);
    }
}
