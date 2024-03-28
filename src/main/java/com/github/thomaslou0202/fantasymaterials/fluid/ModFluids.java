package com.github.thomaslou0202.fantasymaterials.fluid;

import com.github.thomaslou0202.fantasymaterials.FantasyMaterials;
import com.github.thomaslou0202.fantasymaterials.block.ModBlocks;
import com.github.thomaslou0202.fantasymaterials.item.ModItems;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/molten_metal_flowing");
    public static final ResourceLocation BLOOD_STILL = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/blood_lava_still");
    public static final ResourceLocation BLOOD_FLOW = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/blood_lava_flow");
    public static final ResourceLocation SCORCHING_STILL = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/scorching_blood_still");
    public static final ResourceLocation SCORCHING_FLOW = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/scorching_blood_flow");
    public static final ResourceLocation PLASMA_STILL = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/plasma_still");
    public static final ResourceLocation PLASMA_FLOW = new ResourceLocation(FantasyMaterials.MODID, "block/fluids/plasma_flow");

    public static final DeferredRegister<Fluid> FLUIDS =
        DeferredRegister.create(ForgeRegistries.FLUIDS, FantasyMaterials.MODID);

    public static final RegistryObject<FlowingFluid> UVAROVITE = FLUIDS.register("molten_uvarovite",
            () -> new ForgeFlowingFluid.Source(makeUvaroviteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_UVAROVITE = FLUIDS.register("flowing_molten_uvarovite",
            () -> new ForgeFlowingFluid.Flowing(makeUvaroviteProperties()));
	
    public static final RegistryObject<FlowingFluid> KUNZITE = FLUIDS.register("molten_kunzite",
            () -> new ForgeFlowingFluid.Source(makeKunziteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_KUNZITE = FLUIDS.register("flowing_molten_kunzite",
            () -> new ForgeFlowingFluid.Flowing(makeKunziteProperties()));
	
    public static final RegistryObject<FlowingFluid> TITANIUM = FLUIDS.register("molten_titanium",
            () -> new ForgeFlowingFluid.Source(makeTitaniumProperties()));
    public static final RegistryObject<FlowingFluid> flowing_TITANIUM = FLUIDS.register("flowing_molten_titanium",
            () -> new ForgeFlowingFluid.Flowing(makeTitaniumProperties()));
	
    public static final RegistryObject<FlowingFluid> TITANIUM_ALLOY = FLUIDS.register("molten_titanium_alloy",
            () -> new ForgeFlowingFluid.Source(makeTitaniumAlloyProperties()));
    public static final RegistryObject<FlowingFluid> flowing_TITANIUM_ALLOY = FLUIDS.register("flowing_molten_titanium_alloy",
            () -> new ForgeFlowingFluid.Flowing(makeTitaniumAlloyProperties()));
    
    public static final RegistryObject<FlowingFluid> STIBNITE = FLUIDS.register("molten_stibnite", 
    		() -> new ForgeFlowingFluid.Source(makeStibniteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_STIBNITE = FLUIDS.register("flowing_molten_stibnite", 
    		() -> new ForgeFlowingFluid.Flowing(makeStibniteProperties()));
    
    public static final RegistryObject<FlowingFluid> LONSDALEITE = FLUIDS.register("molten_lonsdaleite", 
    		() -> new ForgeFlowingFluid.Source(makeLonsdaeiteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_LONSDALEITE = FLUIDS.register("flowing_molten_lonsdaleite", 
    		() -> new ForgeFlowingFluid.Flowing(makeLonsdaeiteProperties()));
    
    public static final RegistryObject<FlowingFluid> ASTRITE = FLUIDS.register("molten_astrite", 
    		() -> new ForgeFlowingFluid.Source(makeAstriteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_ASTRITE = FLUIDS.register("flowing_molten_astrite", 
    		() -> new ForgeFlowingFluid.Flowing(makeAstriteProperties()));
    
    public static final RegistryObject<FlowingFluid> THOUNITE = FLUIDS.register("molten_thounite", 
    		() -> new ForgeFlowingFluid.Source(makeThouniteProperties()));
    public static final RegistryObject<FlowingFluid> flowing_THOUNITE = FLUIDS.register("flowing_molten_thounite", 
    		() -> new ForgeFlowingFluid.Flowing(makeThouniteProperties()));
    
    //liquid block
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_UVAROVITE = ModBlocks.BLOCKS.register("molten_molten_uvarovite_block",
    () -> new LiquidBlock(() -> ModFluids.UVAROVITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_KUNZITE = ModBlocks.BLOCKS.register("molten_kunzite_block",
    () -> new LiquidBlock(() -> ModFluids.KUNZITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));
        
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM = ModBlocks.BLOCKS.register("molten_titanium_block",
    () -> new LiquidBlock(() -> ModFluids.TITANIUM.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));
        
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_ALLOY = ModBlocks.BLOCKS.register("molten_titanium_alloy_block",
    () -> new LiquidBlock(() -> ModFluids.TITANIUM_ALLOY.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));

    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_STIBNITE = ModBlocks.BLOCKS.register("molten_stibnite_block",
    () -> new LiquidBlock(() -> ModFluids.STIBNITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));

    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_LONSDALEITE = ModBlocks.BLOCKS.register("molten_lonsdaleite_block",
    () -> new LiquidBlock(() -> ModFluids.LONSDALEITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));

    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_ASTRITE = ModBlocks.BLOCKS.register("molten_astrite_block",
    () -> new LiquidBlock(() -> ModFluids.ASTRITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_THOUNITE = ModBlocks.BLOCKS.register("molten_thounite_block",
    () -> new LiquidBlock(() -> ModFluids.THOUNITE.get(),BlockBehaviour.Properties
        .of(Material.METAL)
        .noCollission()
        .strength(100f).noDrops()));
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> BLOOD_LAVA = ModBlocks.BLOCKS.register("molten_bloodlava_block",
    () -> new LiquidBlock(() -> ModFluids.BLOODLAVA.get(),BlockBehaviour.Properties
        .of(Material.LAVA)
        .noCollission()
        .strength(100f).noDrops()));
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> SCORCHING_BLOOD = ModBlocks.BLOCKS.register("molten_scorchinglood_block",
    () -> new LiquidBlock(() -> ModFluids.SCORCHINGBLOOD.get(),BlockBehaviour.Properties
        .of(Material.LAVA)
        .noCollission()
        .strength(100f).noDrops()));
    @SuppressWarnings("null")
    public static final RegistryObject<LiquidBlock> MOLTEN_PLASMA = ModBlocks.BLOCKS.register("molten_plasma_block",
    () -> new LiquidBlock(() -> ModFluids.PLASMA.get(),BlockBehaviour.Properties
        .of(Material.LAVA)
        .noCollission()
        .strength(100f).noDrops()));

    //fuels
    public static final RegistryObject<FlowingFluid> BLOODLAVA = FLUIDS.register("blood_lava",
            () -> new ForgeFlowingFluid.Source(makeBloodlavaProperties()));
    public static final RegistryObject<FlowingFluid> flowing_BLOODLAVA = FLUIDS.register("flowing_bloodlava",
            () -> new ForgeFlowingFluid.Flowing(makeBloodlavaProperties()));
    
    public static final RegistryObject<FlowingFluid> SCORCHINGBLOOD = FLUIDS.register("scorching_blood",
            () -> new ForgeFlowingFluid.Source(makeScorchingBloodProperties()));
    public static final RegistryObject<FlowingFluid> flowing_SCORCHINGBLOOD = FLUIDS.register("flowing_scorchingblood",
            () -> new ForgeFlowingFluid.Flowing(makeScorchingBloodProperties()));
    
    public static final RegistryObject<FlowingFluid> PLASMA = FLUIDS.register("plasma",
            () -> new ForgeFlowingFluid.Source(makePlasmaProperties()));
    public static final RegistryObject<FlowingFluid> flowing_PLASMA = FLUIDS.register("flowing_plasma",
            () -> new ForgeFlowingFluid.Flowing(makePlasmaProperties()));

    
    //materials
    private static ForgeFlowingFluid.Properties makeUvaroviteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> UVAROVITE.get(), () -> flowing_UVAROVITE.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF30D513)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.UVAROVITE_BUCKET).block(ModFluids.MOLTEN_UVAROVITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeKunziteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> KUNZITE.get(), () -> flowing_KUNZITE.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFCF6284)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.KUNZITE_BUCKET).block(ModFluids.MOLTEN_KUNZITE).explosionResistance(1000F).tickRate(9);       
    } 
    
    private static ForgeFlowingFluid.Properties makeTitaniumProperties() {
    	return new ForgeFlowingFluid.Properties(() -> TITANIUM.get(), () -> flowing_TITANIUM.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF45517A)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.TITANIUM_BUCKET).block(ModFluids.MOLTEN_TITANIUM).explosionResistance(1000F).tickRate(9);       
    } 
    
    private static ForgeFlowingFluid.Properties makeTitaniumAlloyProperties() {
    	return new ForgeFlowingFluid.Properties(() -> TITANIUM_ALLOY.get(), () -> flowing_TITANIUM_ALLOY.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFC2DDED)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1700).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.TITANIUM_ALLOY_BUCKET).block(ModFluids.MOLTEN_TITANIUM_ALLOY).explosionResistance(1000F).tickRate(9);       
    } 
    
    private static ForgeFlowingFluid.Properties makeStibniteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> STIBNITE.get(), () -> flowing_STIBNITE.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB7C3DE)
                        .luminosity(15).density(3000).viscosity(6000).temperature(2000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.STIBNITE_BUCKET).block(ModFluids.MOLTEN_STIBNITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeLonsdaeiteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> LONSDALEITE.get(), () -> flowing_LONSDALEITE.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFD4A7FC)
                        .luminosity(15).density(3000).viscosity(6000).temperature(2000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.LONSDALEITE_BUCKET).block(ModFluids.MOLTEN_LONSDALEITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeAstriteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> ASTRITE.get(), () -> flowing_ASTRITE.get(),
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFF3222)
                        .luminosity(15).density(3000).viscosity(6000).temperature(2500).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.ASTRITE_BUCKET).block(ModFluids.MOLTEN_ASTRITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeThouniteProperties() {
    	return new ForgeFlowingFluid.Properties(() -> THOUNITE.get(), () -> flowing_THOUNITE.get(),
    			FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFBBE53)
    					.luminosity(15).density(3000).viscosity(6000).temperature(2750).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
					.bucket(ModItems.THOUNITE_BUCKET).block(ModFluids.MOLTEN_THOUNITE).explosionResistance(1000F).tickRate(9);
    }
    
    //fuels
    private static ForgeFlowingFluid.Properties makeBloodlavaProperties() {
    	return new ForgeFlowingFluid.Properties(() -> BLOODLAVA.get(), () -> flowing_BLOODLAVA.get(),
                FluidAttributes.builder(BLOOD_STILL, BLOOD_FLOW)
                		.luminosity(15).density(3000).viscosity(6000).temperature(1250).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.BLOODLAVA_BUCKET).block(ModFluids.BLOOD_LAVA).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeScorchingBloodProperties() {
    	return new ForgeFlowingFluid.Properties(() -> SCORCHINGBLOOD.get(), () -> flowing_SCORCHINGBLOOD.get(),
    			FluidAttributes.builder(SCORCHING_STILL, SCORCHING_FLOW)
    					.luminosity(15).density(3000).viscosity(6000).temperature(3000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.SCORCHINGBLOOD_BUCKET).block(ModFluids.SCORCHING_BLOOD).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makePlasmaProperties() {
    	return new ForgeFlowingFluid.Properties(() -> PLASMA.get(), () -> flowing_PLASMA.get(),
    			FluidAttributes.builder(PLASMA_STILL, PLASMA_FLOW)
    					.luminosity(15).density(3000).viscosity(6000).temperature(4000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    				.bucket(ModItems.PLASMA_BUCKET).block(ModFluids.MOLTEN_PLASMA).explosionResistance(1000F).tickRate(9);
    }

    public static void register(IEventBus eventBus){
        FLUIDS.register(eventBus);
    }
}
