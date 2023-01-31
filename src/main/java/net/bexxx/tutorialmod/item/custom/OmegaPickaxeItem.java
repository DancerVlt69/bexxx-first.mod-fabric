package net.bexxx.tutorialmod.item.custom;


import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
