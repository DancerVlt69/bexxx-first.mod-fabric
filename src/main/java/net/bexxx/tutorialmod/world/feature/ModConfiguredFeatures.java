package net.bexxx.tutorialmod.world.feature;

import net.bexxx.tutorialmod.TutorialMod;
import net.bexxx.tutorialmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TANZANITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_GENERATED_BLOCK = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.OMEGA_BLOCK.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_OTHER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_OPAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_OPAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BLACK_OPAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_OPAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_BLACK_OPAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_OPAL_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_BLACK_OPAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_CITRINE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CITRINE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_CITRINE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_CITRINE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_CITRINE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_CITRINE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TANZANITE_ORE =
            ConfiguredFeatures.register("tanzanite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TANZANITE_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_TANZANITE_ORE =
            ConfiguredFeatures.register("nether_tanzanite_ore",Feature.ORE, new OreFeatureConfig(NETHER_TANZANITE_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_TANZANITE_ORE =
            ConfiguredFeatures.register("end_tanzanite_ore",Feature.ORE, new OreFeatureConfig(END_TANZANITE_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OMEGA_BLOCK =
            ConfiguredFeatures.register("omega_block", Feature.ORE, new OreFeatureConfig(OVERWORLD_GENERATED_BLOCK, 5));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_OTHER_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OVERWORLD_OPAL_ORE =
            ConfiguredFeatures.register("opal_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_OPAL_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_OPAL_ORE =
            ConfiguredFeatures.register("nether_opal_ore",Feature.ORE, new OreFeatureConfig(NETHER_OPAL_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_OPAL_ORE =
            ConfiguredFeatures.register("end_opal_ore",Feature.ORE, new OreFeatureConfig(END_OPAL_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CITRINE_ORE =
            ConfiguredFeatures.register("citrine_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_CITRINE_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_CITRINE_ORE =
            ConfiguredFeatures.register("nether_citrine_ore",Feature.ORE, new OreFeatureConfig(NETHER_CITRINE_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_CITRINE_ORE =
            ConfiguredFeatures.register("end_citrine_ore",Feature.ORE, new OreFeatureConfig(END_CITRINE_ORES, 12));


    public static void registerConfiguredFeatures() {

        TutorialMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + TutorialMod.MODID);
    }
}
