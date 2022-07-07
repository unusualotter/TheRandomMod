
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.randommod.item.NevergonnagiveyouupItem;
import net.mcreator.randommod.RandomModMod;

public class RandomModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomModMod.MODID);
	public static final RegistryObject<Item> NEVERGONNAGIVEYOUUP = REGISTRY.register("nevergonnagiveyouup", () -> new NevergonnagiveyouupItem());
}
