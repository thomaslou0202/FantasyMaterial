package com.github.thomaslou0202.fantasymaterials;

import com.github.thomaslou0202.fantasymaterials.block.ModBlocks;
import com.github.thomaslou0202.fantasymaterials.fluid.ModFluids;
import com.github.thomaslou0202.fantasymaterials.item.ModItems;
import com.github.thomaslou0202.fantasymaterials.modifiers.Modifiers;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod(FantasyMaterials.MODID)
public class FantasyMaterials {
    public static final String MODID = "fantasymaterials";
    public static final String NAME = "Materials from nature and fantasy.";

    public FantasyMaterials(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.register(modEventBus);
        Modifiers.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event){
    }
    private void setup(final FMLClientSetupEvent event){
    }
}
