
package net.mcreator.randommod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.randommod.procedures.MorbPotionProcedureProcedure;

public class MorbMobEffect extends MobEffect {
	public MorbMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16754589);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_mod.morb";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		MorbPotionProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
