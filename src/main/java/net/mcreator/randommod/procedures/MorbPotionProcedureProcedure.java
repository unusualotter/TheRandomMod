package net.mcreator.randommod.procedures;

import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class MorbPotionProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			AbstractArrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
			entityToSpawn.shoot(_ent_sa.getLookAngle().x, _ent_sa.getLookAngle().y, _ent_sa.getLookAngle().z, 1, 0);
			entityToSpawn.setBaseDamage(9999999);
			entityToSpawn.setKnockback(999999999);
			_ent_sa.level.addFreshEntity(entityToSpawn);
		}
	}
}
