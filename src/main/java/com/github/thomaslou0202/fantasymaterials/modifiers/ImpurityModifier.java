package com.github.thomaslou0202.fantasymaterials.modifiers;

import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class ImpurityModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
	public float getEntityDamage(IToolStackView tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		if (context.getTarget().isEyeInFluid(FluidTags.WATER))
			return (float)(((RANDOM.nextInt(level*2) - level) * 0.1) + 1) * damage;
		return damage;
	}
	@Override
	public void onBreakSpeed(IToolStackView tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective)
			event.setNewSpeed((float)(event.getNewSpeed() * (((RANDOM.nextInt(level*2) - level) * 0.1) + 1)));
	}
}
