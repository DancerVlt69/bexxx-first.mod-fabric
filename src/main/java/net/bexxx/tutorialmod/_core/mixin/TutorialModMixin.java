package net.bexxx.tutorialmod._core.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.bexxx.tutorialmod.TutorialMod.LOGGER;

@Mixin(TitleScreen.class)

public class TutorialModMixin {

	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) { LOGGER.info("This line is printed by an example mod mixin!"); }
}
