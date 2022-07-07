
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randommod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomModModTabs {
	public static CreativeModeTab TAB_RANDOM_MENU;

	public static void load() {
		TAB_RANDOM_MENU = new CreativeModeTab("tabrandom_menu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.AMETHYST_SHARD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
