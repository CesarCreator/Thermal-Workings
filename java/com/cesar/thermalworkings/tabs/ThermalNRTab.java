package com.cesar.thermalworkings.tabs;

import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThermalNRTab extends CreativeTabs {

	public ThermalNRTab(String label) {
		super(label);
		this.setBackgroundImageName("tw-nr.png");
	}

	@Override
	public Item getTabIconItem() {
		return ThermalItems.carbon_chunk;
	}
	

}
