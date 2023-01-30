package net.bexxx.tutorialmod.item;

import net.bexxx.tutorialmod.item.custom.EightBallItem;
import net.bexxx.tutorialmod.item.custom.OmegaPickaxeItem;
import net.bexxx.tutorialmod.item.custom.SevenBallItem;
import net.bexxx.tutorialmod.tab.ModItemGroup;
import net.bexxx.tutorialmod.toolmaterial.custom.ModToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.bexxx.tutorialmod.TutorialMod.LOGGER;
import static net.bexxx.tutorialmod.TutorialMod.MODID;
public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));

    public static final Item EIGHT_BALL_SHARD = registerItem("eight_ball_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));
    public static final Item SEVEN_BALL = registerItem("seven_ball",
            new SevenBallItem(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));

    public static final Item SEVEN_BALL_SHARD = registerItem("seven_ball_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));

    public static final Item TANZANITE_SHARD = registerItem("tanzanite_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));
    public static final Item TANZANITE_SHARD_PIECE = registerItem("tanzanite_shard_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

    public static final Item TANZANITE_PICKAXE = registerItem("tanzanite_pickaxe",
        new PickaxeItem(ToolMaterials.DIAMOND, 1, 3f,
                new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

    public static final Item OMEGA_PICKAXE = registerItem("omega_pickaxe",
          new OmegaPickaxeItem(ModToolMaterials.OMEGA, 1, 1.0F, 50, new Item.Settings()
                  .group(ModItemGroup.OMEGA)));

    private static Item registerItem(String name, ModToolMaterials omega_pickaxe_material) {
        return null;
    }
    public static final Item RAW_RUBY = registerItem("raw_ruby",
        new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));










    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MODID, name), item);

    }

    public static void registerModItems() { LOGGER.debug("Registering Mod Items for " + MODID);
    }
}
