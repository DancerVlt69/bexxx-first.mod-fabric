package net.bexxx.tutorialmod.init.items.custom;


import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class OmegaPickaxeItem extends PickaxeItem {
	private final int enchantability;
	public OmegaPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, int enchantability, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);

		this.enchantability = enchantability;
	}

	@Override
	public int getEnchantability() {
		return enchantability; // return 50;
	}


}
