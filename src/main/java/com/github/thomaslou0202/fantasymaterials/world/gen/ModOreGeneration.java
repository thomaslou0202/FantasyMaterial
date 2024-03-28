package com.github.thomaslou0202.fantasymaterials.world.gen;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import java.util.List;

import com.github.thomaslou0202.fantasymaterials.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        base.add(ModPlacedFeatures.UVAROITE_ORE_PLACED);
        base.add(ModPlacedFeatures.KUNZITE_ORE_PLACED);
        base.add(ModPlacedFeatures.TITANIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.STIBNITE_ORE_PLACED);
        base.add(ModPlacedFeatures.LONSDALEITE_ORE_PLACED);
        base.add(ModPlacedFeatures.ASTRITE_ORE_PLACED);
}
}
