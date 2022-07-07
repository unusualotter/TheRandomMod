
package net.mcreator.randommod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randommod.init.RandomModModTabs;
import net.mcreator.randommod.init.RandomModModSounds;

public class JurassicParkItem extends RecordItem {
	public JurassicParkItem() {
		super(0, RandomModModSounds.REGISTRY.get(new ResourceLocation("random_mod:custom_jurassicpark")),
				new Item.Properties().tab(RandomModModTabs.TAB_RANDOM_MENU).stacksTo(1).rarity(Rarity.RARE));
	}
}
