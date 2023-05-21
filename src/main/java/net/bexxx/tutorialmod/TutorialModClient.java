package net.bexxx.tutorialmod;

import net.bexxx.tutorialmod.entity.ModLivingEntityTypes;
import net.bexxx.tutorialmod.entity.utils.renderer.ModIsopodRenderer;
import net.bexxx.tutorialmod.fluid.ModFluids;
import net.bexxx.tutorialmod.util.screens.custom.GemInfusingScreen;
import net.bexxx.tutorialmod.util.screens.ModScreenHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.bexxx.tutorialmod.block.ModBlocks;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOAP_WATER, ModFluids.FLOWING_SOAP_WATER,
                new SimpleFluidRenderHandler(new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),0xA1E038D0));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SOAP_WATER, ModFluids.FLOWING_SOAP_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LEMONADE_WATER, ModFluids.FLOWING_LEMONADE_WATER,
                new SimpleFluidRenderHandler(new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"), 0xA1FCFFB4));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LEMONADE_WATER, ModFluids.FLOWING_LEMONADE_WATER);

        HandledScreens.register(ModScreenHandler.GEM_INFUSING_SCREEN_HANDLER, GemInfusingScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());

		EntityRendererRegistry.register(ModLivingEntityTypes.ISOPOD_YELLOW_BLACK,
				ModIsopodRenderer.ModIsopodYellowBlackRenderer::new);
    }
}
