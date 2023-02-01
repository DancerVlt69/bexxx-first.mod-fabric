package net.bexxx.tutorialmod;

import net.bexxx.tutorialmod.block.ModBlocks;

import net.bexxx.tutorialmod.fluid.ModFluids;
import net.bexxx.tutorialmod.item.ModItems;
import net.bexxx.tutorialmod.painting.ModPaintings;
import net.bexxx.tutorialmod.util.ModLootTableModifiers;
import net.bexxx.tutorialmod.villager.ModVillagers;
import net.bexxx.tutorialmod.world.feature.ModConfiguredFeatures;
import net.bexxx.tutorialmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MODID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID.getClass());

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();
		ModLootTableModifiers.modifyLootTables();
		ModFluids.register();
	}
}

// TODO ORGANIZE FOLDERS


