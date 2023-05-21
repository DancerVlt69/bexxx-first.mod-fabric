package net.bexxx.tutorialmod.block;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.util.tolltips.ShowToolTips;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.bexxx.tutorialmod.TutorialMod.MODID;

public class ModBlocksRegister {

	/** registering Blocks without Item, ItemGroup or Tooltips */
	public static Block registerBlockWithoutItem(String blockName, Block modBlock) {
		return Registry.register(Registry.BLOCK, new Identifier(MODID, blockName), modBlock); }

	/** registering Blocks with Items, but without Tooltips*/
	static Block registerBlock(String blockName, Block modBlock, ItemGroup itemGroup) {
		registerBlockItem(blockName, modBlock, itemGroup);
		return Registry.register(Registry.BLOCK, new Identifier(MODID, blockName), modBlock); }

	private static void registerBlockItem(String blockName, Block modBlock, ItemGroup itemGroup) {
		Registry.register(Registry.ITEM, new Identifier(MODID, blockName),
				new BlockItem(modBlock, new FabricItemSettings().group(itemGroup)));
	}

	/** registering Block with Item but with Tooltip Shift */
	public static Block registerBlock(String blockName, Block modBlock, ItemGroup itemGroup, String tooltipShift) {
		registerBlockItem(blockName, modBlock, itemGroup, tooltipShift);
		return Registry.register(Registry.BLOCK, new Identifier(MODID, blockName), modBlock);
	}

	private static void registerBlockItem(String blockName, Block modBlock, ItemGroup itemGroup, String tooltipShift) {
		Registry.register(Registry.ITEM, new Identifier(MODID, blockName),
				new BlockItem(modBlock, new FabricItemSettings().group(itemGroup)) {
					@Override
					public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
						ShowToolTips.showTooltips(tooltip, tooltipShift); }
				});
	}

	/** registering Block with Item but with Tooltip Shift & Ctrl */
	public static Block registerBlock(String blockName, Block modBlock, ItemGroup itemGroup, String tooltipShift, String tooltipCtrl) {
		registerBlockItem(blockName, modBlock, itemGroup, tooltipShift, tooltipCtrl);
		return Registry.register(Registry.BLOCK, new Identifier(MODID, blockName), modBlock);
	}

	private static void registerBlockItem(String blockName, Block block, ItemGroup itemGroup, String tooltipShift, String tooltipCtrl) {
		Registry.register(Registry.ITEM, new Identifier(MODID, blockName),
				new BlockItem(block, new FabricItemSettings().group(itemGroup)) {
					@Override
					public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
						ShowToolTips.showTooltips(tooltip, tooltipShift, tooltipCtrl);}
				});
	}

	/** registering Block with Item but with Tooltip Shift & Ctrl & Alt */
	public static Block registerBlock(String blockName, Block modBlock, ItemGroup itemGroup, String tooltipShift, String tooltipCtrl, String tooltipAlt) {
		registerBlockItem(blockName, modBlock, itemGroup, tooltipShift, tooltipCtrl, tooltipAlt);
		return Registry.register(Registry.BLOCK, new Identifier(MODID, blockName), modBlock);
	}

	private static void registerBlockItem(String blockName, Block modBlock, ItemGroup itemGroup, String tooltipShift, String tooltipCtrl, String tooltipAlt) {
		Registry.register(Registry.ITEM, new Identifier(MODID, blockName),
				new BlockItem(modBlock, new FabricItemSettings().group(itemGroup)) {
					@Override
					public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
						ShowToolTips.showTooltips(tooltip, tooltipShift, tooltipCtrl, tooltipAlt); }
				});
	}

	public static void registerModBlocks() { TutorialMod.LOGGER.debug("Registering ModBlocks for " + MODID);
	}

}
