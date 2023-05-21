package net.bexxx.tutorialmod.item;

import net.bexxx.tutorialmod.block.ModBlocks;
import net.bexxx.tutorialmod.entity.ModLivingEntityTypes;
import net.bexxx.tutorialmod.item.custom.*;
import net.bexxx.tutorialmod.item.util.tiers.ModToolMaterials;
import net.bexxx.tutorialmod.util.tab.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.bexxx.tutorialmod.TutorialMod.LOGGER;
import static net.bexxx.tutorialmod.TutorialMod.MODID;

public class ModItems {

    /** Stones, Minerals & Gems */
	public static final Item CITRINE = registerItem("citrine",
			new Item(new FabricItemSettings().group(ModItemGroup.CITRINE)));
	public static final Item RAW_CITRINE = registerItem("raw_citrine",
			new Item(new FabricItemSettings().group(ModItemGroup.CITRINE)));

    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

	public static final Item BLACK_OPAL = registerItem("black_opal",
			new Item(new FabricItemSettings().group(ModItemGroup.OPAL)));
	public static final Item RAW_BLACK_OPAL = registerItem("raw_black_opal",
			new Item(new FabricItemSettings().group(ModItemGroup.OPAL)));

	public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
			new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));
	public static final Item TANZANITE = registerItem("tanzanite",
			new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    /**Tools, Weapons & Armors */
    public static final Item TANZANITE_SHARD = registerItem("tanzanite_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

    public static final Item TANZANITE_SHARD_PIECE = registerItem("tanzanite_shard_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

    public static final Item TANZANITE_PICKAXE = registerItem("tanzanite_pickaxe",
        new PickaxeItem(ModToolMaterials.TANZANITE, 1, 3f,
                new FabricItemSettings().group(ModItemGroup.TANZANITE_TOOLS)));

	public static final Item OMEGA_AXE = registerItem("omega_axe",
			new OmegaAxeItem(ModToolMaterials.OMEGA, 2, 10.0F, new Item.Settings()
					.group(ModItemGroup.OMEGA).fireproof()));
	public static final Item OMEGA_HOE = registerItem("omega_hoe",
			new OmegaHoeItem(ModToolMaterials.OMEGA, 2, 3f, new Item.Settings()
					.group(ModItemGroup.OMEGA).fireproof()));
	public static final Item OMEGA_PICKAXE = registerItem("omega_pickaxe",
			new OmegaPickaxeItem(ModToolMaterials.OMEGA, 2, 2.0F, 50,
					new FabricItemSettings().group(ModItemGroup.OMEGA), "tooltip.omega_pickaxe.shift"));
	public static final Item OMEGA_SHOVEL = registerItem("omega_shovel",
			new OmegaShovelItem(ModToolMaterials.OMEGA, 2, 3f, new Item.Settings()
					.group(ModItemGroup.OMEGA).fireproof()));
	public static final Item OMEGA_SWORD = registerItem("omega_sword",
			new OmegaSwordItem(ModToolMaterials.OMEGA, 20, 10f, new Item.Settings()
					.group(ModItemGroup.OMEGA).fireproof()));

    /** Crops, Seeds, Food & Drinks */
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.PLANTS)
                    .food(new FoodComponent.Builder().hunger(4)
                            .saturationModifier(4f).alwaysEdible().build())));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP,
					new FabricItemSettings().group(ModItemGroup.PLANTS)));

	/** Entity-Spawn-Eggs */
	public static final Item ISOPOD_01_SPAWN_EGG = registerItem("isopod_01_spawn_egg",
			new SpawnEggItem(ModLivingEntityTypes.ISOPOD_YELLOW_BLACK,0xFF9D2C, 0x523C4E,
					new FabricItemSettings().group(ItemGroup.MISC)));

	/** Misc */
	public static final Item EIGHT_BALL = registerItem("eight_ball",
			new EightBallItem(new FabricItemSettings().group(ModItemGroup.EIGHTBALL),
					"tooltip.tutorialmod.eight_ball.shift"));
	public static final Item EIGHT_BALL_SHARD = registerItem("eight_ball_shard",
			new Item(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));

	public static final Item SEVEN_BALL = registerItem("seven_ball",
			new SevenBallItem(new FabricItemSettings().group(ModItemGroup.EIGHTBALL),
					"tooltip.tutorialmod.seven_ball.alt"));
	public static final Item SEVEN_BALL_SHARD = registerItem("seven_ball_shard",
			new Item(new FabricItemSettings().group(ModItemGroup.EIGHTBALL)));

	/** registering the Items */
	public static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MODID, name), item); }

	public static void registerModItems() { LOGGER.debug("Registering Mod Items for " + MODID); }

}
