package net.bexxx.tutorialmod.init.util.tags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.bexxx.tutorialmod.TutorialMod.MODID;

public class ModTags {

	public static class ModBlockTag {

		public static final TagKey<Block> NEEDS_NETHERITE_TOOL = ModBlockTag.of("needs_netherite_tool");


		private static TagKey<Block> of(String modBlockTagName) {

			return TagKey.of(Registry.BLOCK_KEY, new Identifier(MODID, modBlockTagName));
		}

		private static TagKey<Block> ofCommon(String modBlockTagName) {

			return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", modBlockTagName));
		}
	}

	public static class ModItemTag {

		public static final TagKey<Item> BREEDING_SEEDS = ModItemTag.of("breeding_seeds");
		public static final TagKey<Item> BREEDING_FOOD = ModItemTag.of("breeding_food");

		private static TagKey<Item> of(String modItemTagName) {

			return TagKey.of(Registry.ITEM_KEY, new Identifier(MODID, modItemTagName));
		}

		private static TagKey<Item> ofCommon(String modItemTagName) {

			return TagKey.of(Registry.ITEM_KEY, new Identifier("c", modItemTagName));
		}
	}

}
