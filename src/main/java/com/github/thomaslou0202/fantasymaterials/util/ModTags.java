package com.github.thomaslou0202.fantasymaterials.util;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_UVAROVITE_TOOL = tag("needs_uvarovite_tool");
        public static final TagKey<Block> NEEDS_KUNZITE_TOOL = tag("needs_kunzite_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = tag("needs_titanium_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_ALLOY_TOOL = tag("needs_titanium_alloy_tool");
        public static final TagKey<Block> NEEDS_STIBNITE_TOOL = tag("needs_stibnite_tool");
        public static final TagKey<Block> NEEDS_LONSDALEITE_TOOL = tag("needs_lonsdaleite_tool");
        public static final TagKey<Block> NEEDS_ASTRITE_TOOL = tag("needs_astrite_tool");
        public static final TagKey<Block> NEEDS_THOUNITE_TOOL = tag("needs_thounite_tool");
        public static final TagKey<Block> END_STONE = tag("end_stone");

        @SuppressWarnings("null")
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(FantasyMaterials.MODID, name));
        }
    }
}
