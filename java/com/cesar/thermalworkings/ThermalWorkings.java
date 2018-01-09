package com.cesar.thermalworkings;

import com.cesar.thermalworkings.handlers.RecipeHandler;
import com.cesar.thermalworkings.init.ThermalBlocks;
import com.cesar.thermalworkings.init.ThermalItems;
import com.cesar.thermalworkings.proxy.CommonProxy;
import com.cesar.thermalworkings.tabs.ThermalDMTab;
import com.cesar.thermalworkings.tabs.ThermalNRTab;
import com.cesar.thermalworkings.tabs.ThermalTab;
import com.cesar.thermalworkings.tabs.ThermalTechTab;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ThermalWorkings {
		
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ThermalTab tabThermal = new ThermalTab("tabThermal");
	public static final ThermalDMTab tabTwDm = new ThermalDMTab("tabTwDm");
	public static final ThermalTechTab tabTwTech = new ThermalTechTab("tabTwTech");
	public static final ThermalNRTab tabTwNature = new ThermalNRTab("tabTwNature");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ThermalBlocks.init();
		ThermalBlocks.register();
		ThermalItems.init();
		ThermalItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		RecipeHandler.registerCraftingRecipes();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
