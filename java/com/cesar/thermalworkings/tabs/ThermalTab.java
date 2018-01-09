package com.cesar.thermalworkings.tabs;

import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThermalTab extends CreativeTabs {

	public ThermalTab(String label) {
		super(label);
		this.setBackgroundImageName("tw-h.png");
	}

	@Override
	public Item getTabIconItem() {
		return ThermalItems.double_thermal_core;
	}
	
}
