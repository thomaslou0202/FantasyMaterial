package com.github.thomaslou0202.fantasymaterials.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FantasyTab = new CreativeModeTab("fantasytab") {
        @SuppressWarnings("null")
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.UVAROVITE_INGOT.get());
        }
    };
}
