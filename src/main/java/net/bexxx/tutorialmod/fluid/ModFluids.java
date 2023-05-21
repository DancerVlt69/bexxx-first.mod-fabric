package net.bexxx.tutorialmod.fluid;

import net.bexxx.tutorialmod.fluid.costum.LemonadeWaterFluid;
import net.bexxx.tutorialmod.fluid.costum.SoapWaterFluid;
import net.bexxx.tutorialmod.util.tab.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.bexxx.tutorialmod.TutorialMod.MODID;

public class ModFluids {
    public static FlowableFluid STILL_SOAP_WATER;
    public static FlowableFluid FLOWING_SOAP_WATER;
    public static Block SOAP_WATER_BLOCK;
    public static Item SOAP_WATER_BUCKET;
	public static FlowableFluid STILL_LEMONADE_WATER;
  	public static FlowableFluid FLOWING_LEMONADE_WATER;
   	public static Block LEMONADE_WATER_BLOCK;
   	public static Item LEMONADE_WATER_BUCKET;

    public static void registerModFluids() {
        STILL_SOAP_WATER = Registry.register(Registry.FLUID, new Identifier(MODID, "soap_water"),
				new SoapWaterFluid.Still());
        FLOWING_SOAP_WATER = Registry.register(Registry.FLUID, new Identifier(MODID, "flowing_soap_water"),
				new SoapWaterFluid.Flowing());

        SOAP_WATER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MODID, "soap_water_block"),
                new FluidBlock(ModFluids.STILL_SOAP_WATER, FabricBlockSettings.copyOf(Blocks.WATER)));
        SOAP_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(MODID, "soap_water_bucket"),
                new BucketItem(ModFluids.STILL_SOAP_WATER, new FabricItemSettings()
						.recipeRemainder(Items.BUCKET).maxCount(1).group(ModItemGroup.TANZANITE)));

		STILL_LEMONADE_WATER = Registry.register(Registry.FLUID,new Identifier(MODID, "lemonade_water"),
				new LemonadeWaterFluid.Still());
        FLOWING_LEMONADE_WATER = Registry.register(Registry.FLUID,new Identifier(MODID, "flowing_lemonade_water"),
				new LemonadeWaterFluid.Flowing());

        LEMONADE_WATER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MODID, "lemonade_water_block"),
                new FluidBlock(ModFluids.STILL_LEMONADE_WATER, FabricBlockSettings.copyOf(Blocks.WATER)));
        LEMONADE_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(MODID, "lemonade_water_bucket"),
                new BucketItem(ModFluids.STILL_LEMONADE_WATER, new FabricItemSettings()
						.recipeRemainder(Items.BUCKET).maxCount(1).group(ModItemGroup.TANZANITE)));
    }
}

//		  SOAP_WATER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MODID, "soap_water_block"),
//                new FluidBlock(ModFluids.STILL_SOAP_WATER, FabricBlockSettings.copyOf(Blocks.WATER)));
//        SOAP_WATER_BUCKET = Registry.register(Registry.ITEM, new Identifier(MODID, "soap_water_bucket"),
//                new BucketItem(ModFluids.STILL_SOAP_WATER, new FabricItemSettings()
//						.recipeRemainder(Items.BUCKET).maxCount(1).group(ModItemGroup.PLANTS)));
