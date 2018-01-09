package com.cesar.thermalworkings.tabs;

import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThermalTechTab extends CreativeTabs {

	public ThermalTechTab(String label) {
		super(label);
		this.setBackgroundImageName("tw-tech.png");
	}

	@Override
	public Item getTabIconItem() {
		return ThermalItems.basic_circuit;
	}

}
