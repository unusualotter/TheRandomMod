
package net.mcreator.randommod.item;

import net.minecraft.network.chat.Component;

public class JurassicParkItem extends RecordItem {

	public JurassicParkItem() {
		super(0, RandomModModSounds.REGISTRY.get(new ResourceLocation("random_mod:custom_jurassicpark")),
				new Item.Properties().tab(RandomModModTabs.TAB_RANDOM_MENU).stacksTo(1).rarity(Rarity.RARE));
	}

}
