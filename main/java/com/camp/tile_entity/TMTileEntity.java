package com.camp.tile_entity;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class TMTileEntity {

	public static void mainRegistry(){
		registerTileEntity();
	}

	private static void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityTutChest.class, StringLibrary.MODID);
	}
	
}