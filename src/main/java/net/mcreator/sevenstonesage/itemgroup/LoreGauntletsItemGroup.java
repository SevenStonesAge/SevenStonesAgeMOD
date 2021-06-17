
package net.mcreator.sevenstonesage.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sevenstonesage.SevenStonesAgeModElements;

@SevenStonesAgeModElements.ModElement.Tag
public class LoreGauntletsItemGroup extends SevenStonesAgeModElements.ModElement {
	public LoreGauntletsItemGroup(SevenStonesAgeModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablore_gauntlets") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.NETHERITE_SWORD, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
