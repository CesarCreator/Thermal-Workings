package com.cesar.thermalworkings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ThermiumBlock extends Block {

	public ThermiumBlock(Material materialIn) {
		super(materialIn);
		this.setHardness(2.5F);
		this.setResistance(2000F);
	}
}
