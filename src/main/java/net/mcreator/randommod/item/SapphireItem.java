
package net.mcreator.randommod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.randommod.init.RandomModModTabs;

import java.util.List;

public class SapphireItem extends Item {
	public SapphireItem() {
		super(new Item.Properties().tab(RandomModModTabs.TAB_RANDOM_MENU).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can be used to craft some special stuff..."));
	}
}
