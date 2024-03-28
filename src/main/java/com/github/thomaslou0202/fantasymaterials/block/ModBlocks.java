package com.github.thomaslou0202.fantasymaterials.block;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;
import com.github.thomaslou0202.fantasymaterials.item.ModCreativeModeTab;
import com.github.thomaslou0202.fantasymaterials.item.ModItems;
import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, FantasyMaterials.MODID);
        
        //regular ore
        @SuppressWarnings("null")
        public static final RegistryObject<Block> UVAROVITE_ORE = registerBlock("uvarovite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> KUNZITE_ORE = registerBlock("kunzite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> ILMENITE_ORE = registerBlock("ilmenite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> STIBNITE_ORE = registerBlock("stibnite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> LONSDALEITE_ORE = registerBlock("lonsdaleite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> ASTRITE_ORE = registerBlock("astrite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        
                        //Deepslate ore

        @SuppressWarnings("null")
        public static final RegistryObject<Block> DEEPSLATE_UVAROVITE_ORE = registerBlock("deepslate_uvarovite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> DEEPSLATE_KUNZITE_ORE = registerBlock("deepslate_kunzite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> DEEPSLATE_ILMENITE_ORE = registerBlock("deepslate_ilmenite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> DEEPSLATE_LONSDALEITE_ORE = registerBlock("deepslate_lonsdaleite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);

                        //blcok

        @SuppressWarnings("null")
        public static final RegistryObject<Block> UVAROVITE_BLOCK = registerBlock("uvarovite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> KUNZITE_BLOCK = registerBlock("kunzite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> TITANIUM_ALLOY_BLOCK = registerBlock("titanium_alloy_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> STIBNITE_BLOCK = registerBlock("stibnite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> LONSDALEITE_BLOCK = registerBlock("lonsdaleite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> ASTRITE_BLOCK = registerBlock("astrite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);
        @SuppressWarnings("null")
        public static final RegistryObject<Block> THOUNITE_BLOCK = registerBlock("thounite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(6f)
                        .requiresCorrectToolForDrops()),ModCreativeModeTab.FantasyTab);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    @SuppressWarnings("null")
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
