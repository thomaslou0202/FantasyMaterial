package com.github.thomaslou0202.fantasymaterials.modifiers;

import java.util.function.BiConsumer;
import java.util.UUID;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlot.Type;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.hook.KeybindInteractModifierHook;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class AstralSpeedModifier extends Modifier implements KeybindInteractModifierHook{
	private static final UUID ATTRIBUTE_UUID = UUID.fromString("f8a6e738-642b-11eb-ae93-0242ac130002");

    @SuppressWarnings("all")
    @Override
    public void onBreakSpeed(IToolStackView tool,int level,BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
        if(event.getPlayer().isShiftKeyDown() && isEffective){
            event.setNewSpeed(event.getNewSpeed() * (level * 1.25f));
        }
    }
	@SuppressWarnings("null")
    @Override
	public void addAttributes(IToolStackView tool, int level, EquipmentSlot slot, BiConsumer<Attribute, AttributeModifier> consumer) {
		if (slot.getType() == Type.HAND) {
			consumer.accept(Attributes.MOVEMENT_SPEED,new AttributeModifier(ATTRIBUTE_UUID, "astral_speed", level * 0.1, Operation.MULTIPLY_BASE));
		}
	}
}