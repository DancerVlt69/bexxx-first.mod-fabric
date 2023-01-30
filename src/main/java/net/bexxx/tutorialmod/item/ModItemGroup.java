package net.bexxx.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;

import static net.bexxx.tutorialmod.TutorialMod.MODID;

public class ModItemGroup {

	public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab1"), () -> new ItemStack(ModItems.TANZANITE));
	public static final ItemGroup EIGHTBALL = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab2"), () -> new ItemStack(ModItems.EIGHT_BALL));
	public static final ItemGroup TANZANITE_TOOLS = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab3"), () -> new ItemStack(ModItems.TANZANITE_SHARD));
	public static final ItemGroup OMEGA = FabricItemGroupBuilder.build(
			new Identifier(MODID, "tab4"), () -> new ItemStack(ModItems.TANZANITE_SHARD));
}
