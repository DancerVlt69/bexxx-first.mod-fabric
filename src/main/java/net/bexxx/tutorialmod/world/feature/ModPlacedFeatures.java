package net.bexxx.tutorialmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> TANZANITE_ORE_PLACED = PlacedFeatures.register("tanzanite_ore_placed",
            ModConfiguredFeatures.TANZANITE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PlacedFeatures.register("nether_tanzanite_ore_placed",
            ModConfiguredFeatures.NETHER_TANZANITE_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> END_TANZANITE_ORE_PLACED = PlacedFeatures.register("end_tanzanite_ore_placed",
            ModConfiguredFeatures.END_TANZANITE_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));
    public static final RegistryEntry<PlacedFeature> OMEGA_BLOCK_PLACED = PlacedFeatures.register("omega_block_placed",
            ModConfiguredFeatures.OMEGA_BLOCK, modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-120), YOffset.fixed(120))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            ModConfiguredFeatures.RUBY_ORE, modifiersWithCount(12,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(100))));
    public static final RegistryEntry<PlacedFeature> OPAL_ORE_PLACED = PlacedFeatures.register("black_opal_ore_placed",
            ModConfiguredFeatures.OVERWORLD_OPAL_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> NETHER_OPAL_ORE_PLACED = PlacedFeatures.register("nether_opal_ore_placed",
            ModConfiguredFeatures.NETHER_OPAL_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> END_OPAL_ORE_PLACED = PlacedFeatures.register("end_opal_ore_placed",
            ModConfiguredFeatures.END_OPAL_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));
    public static final RegistryEntry<PlacedFeature> CITRINE_ORE_PLACED = PlacedFeatures.register("citrine_ore_placed",
            ModConfiguredFeatures.CITRINE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> NETHER_CITRINE_ORE_PLACED = PlacedFeatures.register("nether_citrine_ore_placed",
            ModConfiguredFeatures.NETHER_CITRINE_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));

    public static final RegistryEntry<PlacedFeature> END_CITRINE_ORE_PLACED = PlacedFeatures.register("end_citrine_ore_placed",
            ModConfiguredFeatures.END_CITRINE_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-100), YOffset.fixed(100))));



    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
