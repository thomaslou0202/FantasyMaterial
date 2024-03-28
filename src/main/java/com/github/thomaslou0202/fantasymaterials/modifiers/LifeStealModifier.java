package com.github.thomaslou0202.fantasymaterials.modifiers;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class LifeStealModifier extends Modifier{
    
	@SuppressWarnings("null")
    @Override
	public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
		Entity target = context.getTarget();
		LivingEntity attacker = context.getAttacker();
		if(attacker instanceof Player && target instanceof Mob) {
			if(context.getCooldown() > 0.9 && damageDealt > 0) {
                attacker.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, level * 50,(int)(damageDealt/6)));
			}
		}
		return 0;
		
	}
}
