package com.github.thomaslou0202.fantasymaterials.modifiers;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class NetherCrushingModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
    public void onBreakSpeed(IToolStackView tool,int level,BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
        Player player = event.getPlayer();
        if(isEffective){
            if(player.getLevel().dimension() == net.minecraft.world.level.Level.NETHER){
                event.setNewSpeed(event.getNewSpeed() * (level * 5.0f));
            }
        }
    }
}