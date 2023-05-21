package net.bexxx.tutorialmod.util.screens;

import net.bexxx.tutorialmod.util.screens.handler.GemInfusingScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandler {
    public static ScreenHandlerType<GemInfusingScreenHandler> GEM_INFUSING_SCREEN_HANDLER;

    public static void registerModScreenHandler() {
        GEM_INFUSING_SCREEN_HANDLER = new ScreenHandlerType<>(GemInfusingScreenHandler::new);
    }
}
