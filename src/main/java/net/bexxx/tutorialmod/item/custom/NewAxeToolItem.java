package net.bexxx.tutorialmod.item.custom;

import net.bexxx.tutorialmod.toolmaterial.custom.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class NewAxeToolItem extends AxeItem {
    public NewAxeToolItem(ModToolMaterials material, float attackDamage, float attackSpeed, Settings settings) {
        super(ModToolMaterials.OMEGA, 2, 3f, settings);
    }
}
