package net.bexxx.tutorialmod.util.recipe;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.util.recipe.custom.GemInfusingRecipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(TutorialMod.MODID, GemInfusingRecipe.Serializer.ID),
                GemInfusingRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(TutorialMod.MODID, GemInfusingRecipe.Type.ID),
                GemInfusingRecipe.Type.INSTANCE);
    }
}
