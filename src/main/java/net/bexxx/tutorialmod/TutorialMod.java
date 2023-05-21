package net.bexxx.tutorialmod;

import net.bexxx.tutorialmod.block.ModBlocksRegister;
import net.bexxx.tutorialmod.block.entities.ModBlockEntities;
import net.bexxx.tutorialmod.entity.ModLivingEntityTypes;
import net.bexxx.tutorialmod.entity.mobs.monster.ModIsopodYellowBlackEntity;
import net.bexxx.tutorialmod.fluid.ModFluids;
import net.bexxx.tutorialmod.item.ModItems;
import net.bexxx.tutorialmod.painting.ModPaintings;
import net.bexxx.tutorialmod.util.loot.ModLootTableModifiers;
import net.bexxx.tutorialmod.util.professions.ModVillagerProfessions;
import net.bexxx.tutorialmod.util.recipe.ModRecipes;
import net.bexxx.tutorialmod.util.screens.ModScreenHandler;
import net.bexxx.tutorialmod.world.feature.ModConfiguredFeatures;
import net.bexxx.tutorialmod.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class TutorialMod implements ModInitializer {
	public static final String MODID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID.getClass());

	@Override
	public void onInitialize() {

		ModBlocksRegister.registerModBlocks();
		ModItems.registerModItems();

		ModPaintings.registerPaintings();

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModOreGeneration.generateOres();
		ModFluids.registerModFluids();
		ModLootTableModifiers.modifyLootTables();

		ModVillagerProfessions.registerVillagerProfessions();
		ModVillagerProfessions.registerTrades();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandler.registerModScreenHandler();
		ModRecipes.registerRecipes();

		FabricDefaultAttributeRegistry.register(ModLivingEntityTypes.ISOPOD_YELLOW_BLACK,
				ModIsopodYellowBlackEntity.setAttributes());

		GeckoLib.initialize();
	}
}
