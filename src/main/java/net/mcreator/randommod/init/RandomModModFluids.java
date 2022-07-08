
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.randommod.fluid.MorbinWaterFluid;
import net.mcreator.randommod.RandomModMod;

public class RandomModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, RandomModMod.MODID);
	public static final RegistryObject<Fluid> MORBIN_WATER = REGISTRY.register("morbin_water", () -> new MorbinWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MORBIN_WATER = REGISTRY.register("flowing_morbin_water", () -> new MorbinWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MORBIN_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MORBIN_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
