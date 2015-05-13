package com.camp.dimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {
	
	public static void MainRegistry(){
		registerDimension();

	}
	
	public static final int dimensionId = 8;
	
	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderTest.class, false);
		
		DimensionManager.registerDimension(dimensionId, dimensionId);
	}

}
