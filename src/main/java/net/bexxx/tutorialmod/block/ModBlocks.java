package net.bexxx.tutorialmod.block;

import net.bexxx.tutorialmod.block.custom.EggPlantCropBlock;
import net.bexxx.tutorialmod.block.custom.GemInfusingStationBlock;
import net.bexxx.tutorialmod.block.custom.JumpBlock;
import net.bexxx.tutorialmod.block.custom.TanzaniteLampBlock;
import net.bexxx.tutorialmod.util.tab.ModItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.bexxx.tutorialmod.block.ModBlocksRegister.*;

public class ModBlocks {

	/** Gem & Stone <p>
	 * 	* Tanzanite */
	public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
			new Block(FabricBlockSettings.of(Material.METAL).strength(2).requiresTool()
					.luminance(7)),ModItemGroup.TANZANITE);
	public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
	public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
	public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
	public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);

		/** * Black Opal */
	public static final Block BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
			new Block(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool()), ModItemGroup.OPAL);
	public static final Block BLACK_OPAL_ORE = registerBlock("black_opal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.OPAL);
	public static final Block DEEPSLATE_BLACK_OPAL_ORE = registerBlock("deepslate_black_opal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7,10)), ModItemGroup.OPAL);
	public static final Block NETHERRACK_BLACK_OPAL_ORE = registerBlock("netherrack_black_opal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
			UniformIntProvider.create(7, 10)),ModItemGroup.OPAL);
	public static final Block ENDSTONE_BLACK_OPAL_ORE = registerBlock("endstone_black_opal_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.OPAL);

		/** * Citrine */
	public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
			new Block(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool()), ModItemGroup.CITRINE);
	public static final Block CITRINE_ORE = registerBlock("citrine_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.CITRINE);
	public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.CITRINE);
	public static final Block NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.CITRINE);
	public static final Block ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.CITRINE);

		/** * Ruby */
	public static final Block RUBY_BLOCK = registerBlock("ruby_block",
			new Block(FabricBlockSettings.of(Material.METAL).strength(1).requiresTool()
						.luminance(7)),ModItemGroup.TANZANITE);
	public static final Block RUBY_ORE = registerBlock("ruby_ore",
			new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
					UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);

    /** Plants, Seed, Food, Drinks */
    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
            new EggPlantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    /** Misc Stuff */
	public static final Block TANZANITE_LAMP = registerBlock("tanzanite_lamp",
			new  TanzaniteLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
					.luminance(state -> state.get(TanzaniteLampBlock.LIT) ? 15 : 0)), ModItemGroup.TANZANITE);

	public static final Block OMEGA_BLOCK = registerBlock("omega_block",
			new Block(FabricBlockSettings.of(Material.METAL).strength(2).requiresTool()), ModItemGroup.OMEGA);

	public static final Block JUMP_BLOCK = registerBlock("jump_block",
            new JumpBlock(FabricBlockSettings.of(Material.METAL).strength(1).requiresTool()), ModItemGroup.TANZANITE);

	public static final Block GEM_INFUSING_STATION = registerBlock("gem_infusing_station",
			new GemInfusingStationBlock(FabricBlockSettings.of(Material.METAL)
					.strength(4f).requiresTool().nonOpaque()), ModItemGroup.TANZANITE);
}
