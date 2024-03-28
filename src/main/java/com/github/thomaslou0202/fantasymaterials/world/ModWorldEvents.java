package com.github.thomaslou0202.fantasymaterials.world;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;
import com.github.thomaslou0202.fantasymaterials.world.gen.ModOreGeneration;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FantasyMaterials.MODID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void BiomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
    }
}
