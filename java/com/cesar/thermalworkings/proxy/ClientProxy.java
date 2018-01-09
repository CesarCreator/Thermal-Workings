package com.cesar.thermalworkings.proxy;

import com.cesar.thermalworkings.init.ThermalBlocks;
import com.cesar.thermalworkings.init.ThermalItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ThermalBlocks.registerRenders();
		ThermalItems.registerRenders();
	}
}
