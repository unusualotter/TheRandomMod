
package net.mcreator.randommod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.randommod.init.RandomModModTabs;
import net.mcreator.randommod.init.RandomModModFluids;

import java.util.List;

public class MorbinWaterItem extends BucketItem {
	public MorbinWaterItem() {
		super(RandomModModFluids.MORBIN_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(RandomModModTabs.TAB_RANDOM_MENU));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("morbin water? wheres the morbin pool?"));
	}
}
