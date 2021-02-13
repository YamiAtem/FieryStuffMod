package io.github.yamiatem.fiery_stuff.core.item.fiery_pick;

import io.github.yamiatem.fiery_stuff.core.item.fiery_ingot.FieryIngotInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

public class FieryPickTier implements IItemTier {
	@Override
	public int getMaxUses() {
		return 1000;
	}

	@Override
	public float getEfficiency() {
		return 10;
	}

	@Override
	public float getAttackDamage() {
		return 10;
	}

	@Override
	public int getHarvestLevel() {
		return 3;
	}

	@Override
	public int getEnchantability() {
		return 5;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromStacks(new ItemStack(FieryIngotInit.FIERY_INGOT.get()));
	}
}
