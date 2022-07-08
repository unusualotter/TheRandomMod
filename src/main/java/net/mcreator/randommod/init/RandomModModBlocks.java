
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randommod.block.SapphireIngotOreBlock;
import net.mcreator.randommod.block.SapphireIngotBlockBlock;
import net.mcreator.randommod.block.MorbinWaterBlock;
import net.mcreator.randommod.block.MorbinBlockBlock;
import net.mcreator.randommod.RandomModMod;

public class RandomModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomModMod.MODID);
	public static final RegistryObject<Block> SAPPHIRE_INGOT_ORE = REGISTRY.register("sapphire_ingot_ore", () -> new SapphireIngotOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_INGOT_BLOCK = REGISTRY.register("sapphire_ingot_block", () -> new SapphireIngotBlockBlock());
	public static final RegistryObject<Block> MORBIN_BLOCK = REGISTRY.register("morbin_block", () -> new MorbinBlockBlock());
	public static final RegistryObject<Block> MORBIN_WATER = REGISTRY.register("morbin_water", () -> new MorbinWaterBlock());
}
