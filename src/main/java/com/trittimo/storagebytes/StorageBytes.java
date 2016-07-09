package com.trittimo.storagebytes;

import com.trittimo.storagebytes.items.InventoryLinker;
import com.trittimo.storagebytes.util.Constants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid=Constants.MOD_ID, version=Constants.VERSION)
public class StorageBytes {
	@EventHandler
	public void init(FMLInitializationEvent e) {
		new InventoryLinker();
	}
}
