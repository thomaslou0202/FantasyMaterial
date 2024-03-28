package com.github.thomaslou0202.fantasymaterials.modifiers;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class ElectrifyingModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
    public int afterEntityHit(IToolStackView tool, int level, ToolAttackContext context, float damageDealt) {
		Entity target = context.getTarget();
		LivingEntity attacker = context.getAttacker();
        if(context.getCooldown() > 0.9){
            if(target.level instanceof Level) {
                BlockPos pos = target.blockPosition();
                if (target.getLevel().canSeeSky(pos)) {
                    Entity lighting = EntityType.LIGHTNING_BOLT.create(target.getLevel());
                    lighting.moveTo(pos, 0,0);
                    target.getLevel().addFreshEntity(lighting);
                    attacker.captureDrops();
                }
            }
        }
		
		return 0;
	}
    @SuppressWarnings("null")
    @Override
    public void onBreakSpeed(IToolStackView tool,int level,BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
        if(event.getPlayer().getLevel().isThundering() && isEffective){
            event.setNewSpeed(event.getNewSpeed() * (level * 1.5f));
        }
    }
}
