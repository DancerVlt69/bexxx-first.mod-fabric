package net.bexxx.tutorialmod.block;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.block.custom.JumpBlock;
import net.bexxx.tutorialmod.tab.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
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
    public static final Block RUNY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1).requiresTool(),
                    UniformIntProvider.create(7, 10)), ModItemGroup.TANZANITE);
    public static final Block JUMP_BLOCK = registerBlock("jump_block",
            new JumpBlock(FabricBlockSettings.of(Material.METAL).strength(1)), ModItemGroup.TANZANITE);





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
