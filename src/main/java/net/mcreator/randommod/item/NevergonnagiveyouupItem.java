
package net.mcreator.randommod.item;

import net.minecraft.network.chat.Component;

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
