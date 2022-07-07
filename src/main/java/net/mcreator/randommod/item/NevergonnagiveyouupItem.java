
package net.mcreator.randommod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randommod.init.RandomModModTabs;
import net.mcreator.randommod.init.RandomModModSounds;

public class NevergonnagiveyouupItem extends RecordItem {
	public NevergonnagiveyouupItem() {
		super(0, RandomModModSounds.REGISTRY.get(new ResourceLocation("random_mod:custom_rickroll")),
				new Item.Properties().tab(RandomModModTabs.TAB_RANDOM_MENU).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
