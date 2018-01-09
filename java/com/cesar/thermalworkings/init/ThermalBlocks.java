package com.cesar.thermalworkings.init;

import com.cesar.thermalworkings.Reference;
import com.cesar.thermalworkings.ThermalWorkings;
import com.cesar.thermalworkings.blocks.SparkiumBlock;
import com.cesar.thermalworkings.blocks.ThermiumBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ThermalBlocks {
	
	public static Block thermium_block;
	public static Block sparkium_block;
	public static Block thermium_ore;
	
	public static void init() 
	{
		thermium_block = new ThermiumBlock(Material.iron).setUnlocalizedName("thermium_block").setCreativeTab(ThermalWorkings.tabThermal);
		thermium_ore = new Block(Material.iron).setUnlocalizedName("thermium_ore").setHardness(3.0F).setResistance(123.4F).setCreativeTab(ThermalWorkings.tabThermal);
		sparkium_block = new SparkiumBlock(Material.iron).setUnlocalizedName("sparkium_block").setCreativeTab(ThermalWorkings.tabThermal);
	}
	
	public static void register() 
	{
		GameRegistry.registerBlock(thermium_block, thermium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sparkium_block, sparkium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(thermium_ore, thermium_ore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(thermium_block);
		registerRender(sparkium_block);
		registerRender(thermium_ore);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
}
