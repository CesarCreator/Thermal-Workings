package com.cesar.thermalworkings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SparkiumBlock extends Block {

	public SparkiumBlock(Material materialIn) {
		super(materialIn);
		this.setHardness(3.2F);
		this.setResistance(1000F);
		this.setLightLevel(0.3F);
	}
}
