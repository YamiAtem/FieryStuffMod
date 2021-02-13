package io.github.yamiatem.fiery_stuff.core.item.fiery_pick;

import io.github.yamiatem.fiery_stuff.FieryStuff;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FieryPickInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FieryStuff.MOD_ID);

	public static final RegistryObject<Item> FIERY_INGOT = ITEMS.register("fiery_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<PickaxeItem> FIERY_PICK = ITEMS.register("fiery_pick",
			() -> new PickaxeItem(new FieryPickTier(), 0, 0,
					new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));
}
