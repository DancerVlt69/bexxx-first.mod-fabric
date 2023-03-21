package net.bexxx.tutorialmod.block;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.block.custom.EggPlantCropBlock;
import net.bexxx.tutorialmod.block.custom.GemInfusingStationBlock;
import net.bexxx.tutorialmod.block.custom.JumpBlock;
import net.bexxx.tutorialmod.block.custom.TanzaniteLampBlock;
import net.bexxx.tutorialmod.tab.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1).luminance(7)), ModItemGroup.TANZANITE);
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
 public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
    public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
    public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
    public static final Block JUMP_BLOCK = registerBlock("jump_block",
            new JumpBlock(FabricBlockSettings.of(Material.METAL).strength(1)), ModItemGroup.TANZANITE);
    public static final Block TANZANITE_LAMP = registerBlock("tanzanite_lamp",
            new  TanzaniteLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(TanzaniteLampBlock.LIT) ? 15 : 0)), ModItemGroup.TANZANITE);
    public static final Block EGGPLANT_CROP = registerBlockwithoutitem("eggplant_crop",
            new EggPlantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block GEM_INFUSING_STATION = registerBlock("gem_infusing_station",
            new GemInfusingStationBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), ModItemGroup.TANZANITE);
    public static final Block OMEGA_BLOCK = registerBlock("omega_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2)), ModItemGroup.OMEGA);
    public static final Block DEEPSLATE_BLACK_OPAL_ORE = registerBlock("deepslate_black_opal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.OPAL);
    public static final Block BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.OPAL);
    public static final Block NETHERRACK_BLACK_OPAL_ORE = registerBlock("netherrack_black_opal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.OPAL);
    public static final Block ENDSTONE_BLACK_OPAL_ORE = registerBlock("endstone_black_opal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.OPAL);
    public static final Block BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.OPAL);
    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.CITRINE);
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.CITRINE);
    public static final Block NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.CITRINE);
    public static final Block ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.CITRINE);
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2)), ModItemGroup.CITRINE);
    




    private static Block registerBlockwithoutitem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MODID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering ModBlocks for " + TutorialMod.MODID);
    }


}
