package com.github.thomaslou0202.fantasymaterials.modifiers;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolRebuildContext;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class LuxuryModifier extends Modifier{
    @SuppressWarnings("null")
    @Override
    public void addToolStats(ToolRebuildContext context, int level, ModifierStatsBuilder builder) {
        ToolStats.ATTACK_DAMAGE.multiply(builder, 1+(0.1f * level));
        ToolStats.DURABILITY.multiply(builder, 1+(0.1f * level));
    }
}
