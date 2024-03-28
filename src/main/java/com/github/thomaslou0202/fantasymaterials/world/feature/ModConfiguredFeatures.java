package com.github.thomaslou0202.fantasymaterials.world.feature;

import java.util.List;

import com.github.thomaslou0202.fantasymaterials.block.ModBlocks;
import com.github.thomaslou0202.fantasymaterials.util.ModTags;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {

	@SuppressWarnings("null")
    public static final RuleTest END_STONE = new TagMatchTest(ModTags.Blocks.END_STONE);

    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_UVAROVITE_ORES = List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,ModBlocks.UVAROVITE_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEPSLATE_UVAROVITE_ORE.get().defaultBlockState()));
    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_KUNZITE_ORES = List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,ModBlocks.KUNZITE_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEPSLATE_KUNZITE_ORE.get().defaultBlockState()));
    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TITANIUM_ORES = List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,ModBlocks.ILMENITE_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEPSLATE_ILMENITE_ORE.get().defaultBlockState()));
    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> NETHER_STIBNITE_ORES = List.of(
        OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES,ModBlocks.STIBNITE_ORE.get().defaultBlockState()));
    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LONSDALEITE_ORES = List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,ModBlocks.LONSDALEITE_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEPSLATE_LONSDALEITE_ORE.get().defaultBlockState()));
    @SuppressWarnings("null")
    public static final List<OreConfiguration.TargetBlockState> END_ASTRITE_ORES = List.of(
        OreConfiguration.target(END_STONE,ModBlocks.ASTRITE_ORE.get().defaultBlockState()));
        

    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> UVAROVITE_ORE = FeatureUtils.register("uvarovite_ore", 
        Feature.ORE,new OreConfiguration(OVERWORLD_UVAROVITE_ORES, 8));
    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> KUNZITE_ORE = FeatureUtils.register("kunzite_ore", 
        Feature.ORE,new OreConfiguration(OVERWORLD_KUNZITE_ORES, 7));
    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TITANIUM_ORE = FeatureUtils.register("titanium_ore", 
        Feature.ORE,new OreConfiguration(OVERWORLD_TITANIUM_ORES, 7));
    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> STIBNITE_ORE = FeatureUtils.register("stibnite_ore", 
        Feature.ORE,new OreConfiguration(NETHER_STIBNITE_ORES, 5));
    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LONSDALEITE_ORE = FeatureUtils.register("lonsdaleite_ore", 
        Feature.ORE,new OreConfiguration(OVERWORLD_LONSDALEITE_ORES, 4));
    @SuppressWarnings("null")
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ASTRITE_ORE = FeatureUtils.register("astrite_ore", 
        Feature.ORE,new OreConfiguration(END_ASTRITE_ORES, 4));
}
