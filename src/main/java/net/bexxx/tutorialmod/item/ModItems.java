package net.bexxx.tutorialmod.item;

import net.bexxx.tutorialmod.item.custom.EightBallItem;
import net.bexxx.tutorialmod.item.custom.OmegaPickaxe;
import net.bexxx.tutorialmod.item.custom.SevenBallItem;
import net.bexxx.tutorialmod.item.custom.TanzanitePickaxe;
import net.bexxx.tutorialmod.toolmaterial.custom.OmegaPickaxeMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
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
    public static final Item TANZANITE_SHARD_ITEM = registerItem("tanzanite_shard_item",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

    public static final Item TANZANITE_PICKAXE = registerItem("tanzenite_pickaxe",
        new TanzanitePickaxe(ToolMaterials.DIAMOND, 1, 3f,
                new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));
   public static final Item OMEGA_PICKAXE =registerItem("omega_pickaxe",
          new OmegaPickaxe("OmegaPickaxeMaterial"))
    ;public static final Item OMEGA_PICKAXE_MATERIAL = registerItem("omega_pickaxe_material",
            new OmegaPickaxeMaterial(new FabricItemSettings().group(ModItemGroup.OMEGA)));

    private static Item registerItem(String name, OmegaPickaxeMaterial omega_pickaxe_material) {
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
