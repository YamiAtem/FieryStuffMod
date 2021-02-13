package io.github.yamiatem.fiery_stuff.core.item.fiery_ingot;

import io.github.yamiatem.fiery_stuff.FieryStuff;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FieryIngotInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FieryStuff.MOD_ID);

	public static final RegistryObject<Item> FIERY_INGOT = ITEMS.register("fiery_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
