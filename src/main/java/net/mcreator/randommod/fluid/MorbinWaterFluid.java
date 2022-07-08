
package net.mcreator.randommod.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.randommod.init.RandomModModItems;
import net.mcreator.randommod.init.RandomModModFluids;
import net.mcreator.randommod.init.RandomModModBlocks;

public abstract class MorbinWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RandomModModFluids.MORBIN_WATER,
			RandomModModFluids.FLOWING_MORBIN_WATER,
			FluidAttributes.builder(new ResourceLocation("random_mod:blocks/morbin_block"), new ResourceLocation("random_mod:blocks/morbin_block"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land"))))
			.explosionResistance(100f).canMultiply().tickRate(1)

			.slopeFindDistance(1).bucket(RandomModModItems.MORBIN_WATER_BUCKET).block(() -> (LiquidBlock) RandomModModBlocks.MORBIN_WATER.get());

	private MorbinWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
	}

	public static class Source extends MorbinWaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MorbinWaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
