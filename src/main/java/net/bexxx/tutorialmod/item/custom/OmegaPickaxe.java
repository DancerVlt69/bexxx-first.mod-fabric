package net.bexxx.tutorialmod.item.custom;

import net.bexxx.tutorialmod.toolmaterial.custom.OmegaPickaxeMaterial;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OmegaPickaxe extends PickaxeItem {

    public OmegaPickaxe(String material) {
        super(ToolMaterial(material), 5, -2.8f, new Settings().group(null).maxCount(1));
    }

    @Override
    public int getEnchantability() {
        return 50;
    }




    public boolean canMine(BlockState block, World world, BlockPos pos, PlayerEntity miner) {
        ItemStack stack = miner.getStackInHand(Hand.MAIN_HAND);
        boolean canMine;
        canMine = super.canMine(block, world, pos,miner);
        return canMine;
    }
}

