package com.github.thomaslou0202.fantasymaterials.item;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;
import com.github.thomaslou0202.fantasymaterials.fluid.ModFluids;
import com.github.thomaslou0202.fantasymaterials.item.ModTeirs.ModTeirs;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, FantasyMaterials.MODID);

    //ingot and nugget
    @SuppressWarnings("null")
    public static final RegistryObject<PickaxeItem> PIX = ITEMS.register("pix",
        () -> new PickaxeItem(ModTeirs.THOUNITE,0,0,new Item.Properties()));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_INGOT = ITEMS.register("uvarovite_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_NUGGET = ITEMS.register("uvarovite_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_INGOT = ITEMS.register("kunzite_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_NUGGET = ITEMS.register("kunzite_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_ALLOY_INGOT = ITEMS.register("titanium_alloy_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_ALLOY_NUGGET = ITEMS.register("titanium_alloy_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_INGOT = ITEMS.register("stibnite_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_NUGGET = ITEMS.register("stibnite_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")

    public static final RegistryObject<Item> LONSDALEITE = ITEMS.register("lonsdaleite",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_INGOT = ITEMS.register("astrite_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_NUGGET = ITEMS.register("astrite_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_INGOT = ITEMS.register("thounite_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_NUGGET = ITEMS.register("thounite_nugget",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    //curshed

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_CRUSHED = ITEMS.register("uvarovite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_CRUSHED = ITEMS.register("kunzite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
        
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ILMENITE_CRUSHED = ITEMS.register("ilmenite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_CRUSHED = ITEMS.register("stibnite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_CRUSHED = ITEMS.register("astrite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_CRUSHED = ITEMS.register("thounite_crushed",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    //dust

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_DUST = ITEMS.register("uvarovite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_DUST = ITEMS.register("kunzite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> ILMENITE_DUST = ITEMS.register("ilmenite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
        
    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_DUST = ITEMS.register("stibnite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_DUST = ITEMS.register("astrite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_DUST = ITEMS.register("thounite_dust",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    
    //rod

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_ROD = ITEMS.register("uvarovite_rod",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_ROD = ITEMS.register("kunzite_rod",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_ROD = ITEMS.register("stibnite_rod",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_ROD = ITEMS.register("astrite_rod",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_ROD = ITEMS.register("thounite_rod",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    
    //gear

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_GEAR = ITEMS.register("uvarovite_gear",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_GEAR = ITEMS.register("kunzite_gear",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_GEAR = ITEMS.register("stibnite_gear",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_GEAR = ITEMS.register("astrite_gear",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_GEAR = ITEMS.register("thounite_gear",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    //plate

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_PLATE = ITEMS.register("uvarovite_plate",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_PLATE = ITEMS.register("kunzite_plate",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_PLATE = ITEMS.register("stibnite_plate",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_PLATE = ITEMS.register("astrite_plate",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_PLATE = ITEMS.register("thounite_plate",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FantasyTab)));

    //bucket

    @SuppressWarnings("null")
    public static final RegistryObject<Item> UVAROVITE_BUCKET = ITEMS.register("uvarovite_bucket",
        () -> new BucketItem(ModFluids.UVAROVITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> KUNZITE_BUCKET = ITEMS.register("kunzite_bucket",
        () -> new BucketItem(ModFluids.KUNZITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_BUCKET = ITEMS.register("titanium_bucket",
        () -> new BucketItem(ModFluids.TITANIUM,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> TITANIUM_ALLOY_BUCKET = ITEMS.register("titanium_alloy_bucket",
        () -> new BucketItem(ModFluids.TITANIUM_ALLOY,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> STIBNITE_BUCKET = ITEMS.register("stibnite_bucket",
        () -> new BucketItem(ModFluids.STIBNITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));

    @SuppressWarnings("null")
    public static final RegistryObject<Item> LONSDALEITE_BUCKET = ITEMS.register("lonsdaleite_bucket",
        () -> new BucketItem(ModFluids.LONSDALEITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
            
    @SuppressWarnings("null")
    public static final RegistryObject<Item> ASTRITE_BUCKET = ITEMS.register("astrite_bucket",
        () -> new BucketItem(ModFluids.ASTRITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> THOUNITE_BUCKET = ITEMS.register("thounite_bucket",
        () -> new BucketItem(ModFluids.THOUNITE,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> BLOODLAVA_BUCKET = ITEMS.register("bloodlava_bucket",
        () -> new BucketItem(ModFluids.BLOODLAVA,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> SCORCHINGBLOOD_BUCKET = ITEMS.register("scorchingblood_bucket",
        () -> new BucketItem(ModFluids.SCORCHINGBLOOD,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
    @SuppressWarnings("null")
    public static final RegistryObject<Item> PLASMA_BUCKET = ITEMS.register("plasma_bucket",
        () -> new BucketItem(ModFluids.PLASMA,
            new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FantasyTab)));
            
    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
