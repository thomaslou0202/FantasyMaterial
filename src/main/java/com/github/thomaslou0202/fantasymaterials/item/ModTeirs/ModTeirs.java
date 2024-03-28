package com.github.thomaslou0202.fantasymaterials.item.ModTeirs;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;
import com.github.thomaslou0202.fantasymaterials.item.ModItems;
import com.github.thomaslou0202.fantasymaterials.util.ModTags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

@SuppressWarnings("null")
public class ModTeirs {
    public static Tier UVAROVITE;
    public static Tier KUNZITE;
    public static Tier TITANIUM;
    public static Tier TITANIUM_ALLOY;
    public static Tier STIBNITE;
    public static Tier LONSDALEITE;
    public static Tier ASTRITE;
    public static Tier THOUNITE;

    static {
        UVAROVITE= TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_UVAROVITE_TOOL, () -> Ingredient.of(ModItems.UVAROVITE_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"uvarovite_tier"),
                List.of(Tiers.NETHERITE),
                List.of());
        KUNZITE = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_KUNZITE_TOOL, () -> Ingredient.of(ModItems.KUNZITE_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"kunzite_tier"),
                List.of(UVAROVITE),
                List.of());
        TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(7, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.ILMENITE_CRUSHED.get())),
                new ResourceLocation(FantasyMaterials.MODID,"titanium_tier"),
                List.of(KUNZITE),
                List.of());
        TITANIUM_ALLOY = TierSortingRegistry.registerTier(
            new ForgeTier(8, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_TITANIUM_ALLOY_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"titanium_alloy_tier"),
                List.of(TITANIUM),
                List.of());
        STIBNITE = TierSortingRegistry.registerTier(
            new ForgeTier(9, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_STIBNITE_TOOL, () -> Ingredient.of(ModItems.STIBNITE_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"stibnite_tier"),
                List.of(TITANIUM_ALLOY),
                List.of());
        LONSDALEITE = TierSortingRegistry.registerTier(
            new ForgeTier(10, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_LONSDALEITE_TOOL, () -> Ingredient.of(ModItems.LONSDALEITE.get())),
                new ResourceLocation(FantasyMaterials.MODID,"lonsdaleite_tier"),
                List.of(STIBNITE),
                List.of());
        ASTRITE = TierSortingRegistry.registerTier(
            new ForgeTier(11, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_ASTRITE_TOOL, () -> Ingredient.of(ModItems.ASTRITE_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"astrite_tier"),
                List.of(LONSDALEITE),
                List.of());
        THOUNITE = TierSortingRegistry.registerTier(
            new ForgeTier(12, 2000, 9f, 3f, 0,
                ModTags.Blocks.NEEDS_THOUNITE_TOOL, () -> Ingredient.of(ModItems.THOUNITE_INGOT.get())),
                new ResourceLocation(FantasyMaterials.MODID,"thounite_tier"),
                List.of(ASTRITE),
                List.of());
    }
}
