
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.randommod.potion.MorbMobEffect;
import net.mcreator.randommod.RandomModMod;

public class RandomModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RandomModMod.MODID);
	public static final RegistryObject<MobEffect> MORB = REGISTRY.register("morb", () -> new MorbMobEffect());
}
