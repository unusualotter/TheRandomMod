
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.randommod.RandomModMod;

public class RandomModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, RandomModMod.MODID);
	public static final RegistryObject<Potion> MORBIUS_POTION = REGISTRY.register("morbius_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 10, false, true),
					new MobEffectInstance(RandomModModMobEffects.MORB.get(), 3600, 1, false, true),
					new MobEffectInstance(MobEffects.JUMP, 3600, 5, false, true), new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 255, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 3600, 1, false, true),
					new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 255, false, true)));
}
