package com.cesar.thermalworkings.tabs;

import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThermalDMTab extends CreativeTabs {

	public ThermalDMTab(String label) {
		super(label);
		this.setBackgroundImageName("tw-dm.png");
	}

	@Override
	public Item getTabIconItem() {
		return ThermalItems.dm_crystal;
	}

}
