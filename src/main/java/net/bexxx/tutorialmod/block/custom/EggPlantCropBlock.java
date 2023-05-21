package net.bexxx.tutorialmod.block.custom;

import net.bexxx.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class EggPlantCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public EggPlantCropBlock(Settings settings) {
        super(settings);
    }

	@Override
	public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
		return new ItemStack(ModItems.EGGPLANT_SEEDS);
	}

	@Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.EGGPLANT_SEEDS;
    }

	@Override
	public boolean hasRandomTicks(BlockState state) {
		return state.get(AGE) < getMaxAge();
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		boolean bl;
		int i = state.get(AGE);
		boolean bl2 = bl = i == getMaxAge();
		if (!bl && player.getStackInHand(hand).isOf(Items.BONE)) {
			return ActionResult.PASS;
		}
		if (i > 1) {
			int j = 1 + world.random.nextInt(2);
			EggPlantCropBlock.dropStack(world, pos, new ItemStack(ModItems.EGGPLANT, j + (bl ? 1 : 0)));
			world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES,
					SoundCategory.BLOCKS, 0.8f, 0.6f);
			BlockState blockState = state.with(AGE, 1);
			world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
			world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
			return ActionResult.success(world.isClient);
		}
		return super.onUse(state, world, pos, player, hand, hit);
	}

	@Override
	public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
		return state.get(AGE) < getMaxAge() - 1;
	}

	@Override
    public int getMaxAge() {
        return 6;
    }

	@Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

	@Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

}

// TODO check using deprecated methods
