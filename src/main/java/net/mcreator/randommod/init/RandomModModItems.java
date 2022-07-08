
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randommod.item.SapphireItem;
import net.mcreator.randommod.item.SapphireIngotItem;
import net.mcreator.randommod.item.NevergonnagiveyouupItem;
import net.mcreator.randommod.item.MorbinWaterItem;
import net.mcreator.randommod.item.JurassicParkItem;
import net.mcreator.randommod.RandomModMod;

public class RandomModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomModMod.MODID);
	public static final RegistryObject<Item> JURASSIC_PARK = REGISTRY.register("jurassic_park", () -> new JurassicParkItem());
	public static final RegistryObject<Item> NEVERGONNAGIVEYOUUP = REGISTRY.register("nevergonnagiveyouup", () -> new NevergonnagiveyouupItem());
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SAPPHIRE_INGOT = REGISTRY.register("sapphire_ingot", () -> new SapphireIngotItem());
	public static final RegistryObject<Item> SAPPHIRE_INGOT_ORE = block(RandomModModBlocks.SAPPHIRE_INGOT_ORE, RandomModModTabs.TAB_RANDOM_MENU);
	public static final RegistryObject<Item> SAPPHIRE_INGOT_BLOCK = block(RandomModModBlocks.SAPPHIRE_INGOT_BLOCK, RandomModModTabs.TAB_RANDOM_MENU);
	public static final RegistryObject<Item> MORBIN_BLOCK = block(RandomModModBlocks.MORBIN_BLOCK, RandomModModTabs.TAB_RANDOM_MENU);
	public static final RegistryObject<Item> MORBIN_WATER_BUCKET = REGISTRY.register("morbin_water_bucket", () -> new MorbinWaterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
