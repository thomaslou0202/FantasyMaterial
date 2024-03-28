package com.github.thomaslou0202.fantasymaterials.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> UVAROITE_ORE_PLACED = PlacementUtils.register("uvaroite_ore_place",
        ModConfiguredFeatures.UVAROVITE_ORE, ModOrePlacement.commonOrePlacement(7,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> KUNZITE_ORE_PLACED = PlacementUtils.register("kunzite_ore_place",
        ModConfiguredFeatures.KUNZITE_ORE, ModOrePlacement.commonOrePlacement(7,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_place",
        ModConfiguredFeatures.TITANIUM_ORE, ModOrePlacement.commonOrePlacement(7,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> STIBNITE_ORE_PLACED = PlacementUtils.register("stibnite_ore_place",
        ModConfiguredFeatures.STIBNITE_ORE, ModOrePlacement.commonOrePlacement(7,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(80))));
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> LONSDALEITE_ORE_PLACED = PlacementUtils.register("lonsdaleite_ore_place",
        ModConfiguredFeatures.LONSDALEITE_ORE, ModOrePlacement.rareOrePlacement(1,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    @SuppressWarnings("null")
    public static final Holder<PlacedFeature> ASTRITE_ORE_PLACED = PlacementUtils.register("astrite_ore_place",
        ModConfiguredFeatures.ASTRITE_ORE, ModOrePlacement.rareOrePlacement(1,
            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(100))));
}
