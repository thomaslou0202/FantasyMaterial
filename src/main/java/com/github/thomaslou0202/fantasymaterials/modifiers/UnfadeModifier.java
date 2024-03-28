package com.github.thomaslou0202.fantasymaterials.modifiers;

import javax.annotation.Nullable;

import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class UnfadeModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
    public int onDamageTool(IToolStackView tool, int level, int amount, @Nullable LivingEntity holder) {
        if (RANDOM.nextInt(level+2) <= 1) {
			return amount;
		}else{
            return 0;
        }
    }
}
