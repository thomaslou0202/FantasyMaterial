package com.github.thomaslou0202.fantasymaterials.modifiers;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class VenomousModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		if(context.getCooldown() > 0.9 && damageDealt > 0) {
            target.addEffect(new MobEffectInstance(MobEffects.POISON, level * 50,0));
        }
		return 0;
	}
}
