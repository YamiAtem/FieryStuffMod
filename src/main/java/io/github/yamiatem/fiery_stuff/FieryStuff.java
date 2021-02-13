package io.github.yamiatem.fiery_stuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.yamiatem.fiery_stuff.core.items.fiery_ingot.FieryIngotInit;
import io.github.yamiatem.fiery_stuff.core.items.fiery_pick.FieryPickInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FieryStuff.MOD_ID)
public class FieryStuff {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "fiery_stuff";

	public FieryStuff() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		FieryPickInit.ITEMS.register(bus);
		FieryIngotInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		
	}
}

