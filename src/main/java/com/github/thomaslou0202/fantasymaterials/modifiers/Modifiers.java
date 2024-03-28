package com.github.thomaslou0202.fantasymaterials.modifiers;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import slimeknights.tconstruct.library.data.tinkering.AbstractModifierProvider;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class Modifiers extends AbstractModifierProvider{
    public static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(FantasyMaterials.MODID);

    public static final StaticModifier<Modifier> VenomousModifier = MODIFIERS.register("venomous", VenomousModifier::new);
    public static final StaticModifier<Modifier> LifeStealModifier = MODIFIERS.register("life_steal", LifeStealModifier::new);
    public static final StaticModifier<Modifier> NetherCrushingModifier = MODIFIERS.register("nether_crushing", NetherCrushingModifier::new);
    public static final StaticModifier<Modifier> ImpurityModifier = MODIFIERS.register("impurity", ImpurityModifier::new);
    public static final StaticModifier<Modifier> UnfadeModifier = MODIFIERS.register("unfade", UnfadeModifier::new);
    public static final StaticModifier<Modifier> LuxuryModifier = MODIFIERS.register("luxury", LuxuryModifier::new);
    public static final StaticModifier<Modifier> AstralSpeedModifier = MODIFIERS.register("astral_speed", AstralSpeedModifier::new);
    public static final StaticModifier<Modifier> ElectrifyingModifier = MODIFIERS.register("electrifying", ElectrifyingModifier::new);

    public Modifiers(DataGenerator generator){
        super(generator);
    }

    @Override
    public String getName(){
        return "Fantasy Modifiers";
    }

    @Override
    protected void addModifiers() {
    }
       
    @SuppressWarnings("null")
    public static void register(IEventBus eventbus){
        MODIFIERS.register(eventbus);
    }
}
