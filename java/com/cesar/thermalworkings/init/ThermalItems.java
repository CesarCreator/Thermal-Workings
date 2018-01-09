package com.cesar.thermalworkings.init;

import com.cesar.thermalworkings.Reference;
import com.cesar.thermalworkings.ThermalWorkings;
import com.cesar.thermalworkings.items.foods.ThermalDish;
import com.cesar.thermalworkings.items.misc.ItemAdvancedCompass;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Armor;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Axe;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Hoe;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Pick;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Shovel;
import com.cesar.thermalworkings.items.tools.mk1.ItemMk1Sword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ThermalItems {
	
	/*
	 * This is a sample text.
	 * This place is to add an item to the game.
	 * 27 Items in total. Good Job losing some time programming... 
	 */
	
	//Foods
	public static ItemFood thermal_dish;
	
	//Technology
	public static Item thermal_core;
	public static Item adv_thermal_core;
	public static Item double_thermal_core;
	public static Item ind_thermal_core;
	public static Item basic_circuit;
	public static Item smart_circuit;
	public static Item thermium_module;
	public static Item circuit_base;
	
	//Thermal Batteries
	public static Item thermal_battery1;
	public static Item thermal_battery2;
	public static Item thermal_battery3;
	
	//Dark Matter
	public static Item dm_core;
	public static Item dm_laser;
	public static Item dm_crystal; //In Factorio, Tenemut.
	
	//Machine pieces
	public static Item heat_projector;
	public static Item electro_scope;
	public static Item molecule_modifier;
	public static Item heat_insulator;
	public static Item heat_compartment;
	
	//Oregen
	public static Item thermium_crystal;
	public static Item sparkium_crystal;
	
	//Resources and Utilities
	public static Item carbon_chunk;
	public static Item carbon_pellet;
	public static Item steel_ingot;
	public static Item raw_steel;
	public static Item steel_rod;
	public static Item eletronic_steel_rod;
	public static Item electrified_steel;
	//public static Item steel_plate;
	
	//Misc
	public static Item adv_compass;
	public static Item developer_secret; //Hidden deep inside the code, not the core.
	//public static Item hf_checker;
	
	//MK1 Tools
	public static ItemPickaxe eletronic_pickaxe;
	public static ItemAxe eletronic_axe;
	public static ItemSpade eletronic_shovel;
	public static ItemHoe eletronic_hoe;
	public static ItemSword eletronic_sword;
	//public static Item iron_plate_mold;
	
	//MK1 Armor
	public static ItemArmor thermium_helmet;
	public static ItemArmor thermium_chestplate;
	public static ItemArmor thermium_leggings;
	public static ItemArmor thermium_boots;
	
	//Materials
	public static ToolMaterial mk1Material = EnumHelper.addToolMaterial("mk1Eletronic", 3, 1680, 13.0F, 4.0F, 10); //ADD DA TOOLZ 2 DA GAEM!
	public static ArmorMaterial mk1AMaterial = EnumHelper.addArmorMaterial("mk1Thermium", "tw:thermium_armor", 40, new int[]{5,9,7,4}, 10);
	//public static ToolMaterial mk2Material = EnumHelper.addToolMaterial("mk2Mechanic", 3, 2325, 15.0F, 5.0F, 10);
	
	
	public static void init() {
		
		//Foods
		thermal_dish = new ThermalDish(10, false);
		
		//Technology
		thermal_core = new Item().setUnlocalizedName("thermal_core").setCreativeTab(ThermalWorkings.tabThermal);
		adv_thermal_core = new Item().setUnlocalizedName("adv_thermal_core").setCreativeTab(ThermalWorkings.tabThermal);
		double_thermal_core = new Item().setUnlocalizedName("double_thermal_core").setCreativeTab(ThermalWorkings.tabThermal);
		ind_thermal_core = new Item().setUnlocalizedName("ind_thermal_core").setCreativeTab(ThermalWorkings.tabThermal);
		basic_circuit = new Item().setUnlocalizedName("basic_circuit").setCreativeTab(ThermalWorkings.tabTwTech);
		smart_circuit = new Item().setUnlocalizedName("smart_circuit").setCreativeTab(ThermalWorkings.tabTwTech);
		thermium_module = new Item().setUnlocalizedName("thermium_module").setCreativeTab(ThermalWorkings.tabTwTech);
		circuit_base = new Item().setUnlocalizedName("circuit_base").setCreativeTab(ThermalWorkings.tabTwTech);
		
		//Thermal Batteries
		thermal_battery1 = new Item().setUnlocalizedName("thermal_battery1").setCreativeTab(ThermalWorkings.tabThermal);
		thermal_battery2 = new Item().setUnlocalizedName("thermal_battery2").setCreativeTab(ThermalWorkings.tabThermal);
		thermal_battery3 = new Item().setUnlocalizedName("thermal_battery3").setCreativeTab(ThermalWorkings.tabThermal);
		
		//Dark Matter
		dm_core = new Item().setUnlocalizedName("dm_core").setCreativeTab(ThermalWorkings.tabTwDm);
		dm_laser = new Item().setUnlocalizedName("dm_laser").setCreativeTab(ThermalWorkings.tabTwDm);
		dm_crystal = new Item().setUnlocalizedName("dm_crystal").setCreativeTab(ThermalWorkings.tabTwDm);
		
		//Machine pieces
		heat_projector = new Item().setUnlocalizedName("heat_projector").setCreativeTab(ThermalWorkings.tabTwTech);
		electro_scope = new Item().setUnlocalizedName("electro_scope").setCreativeTab(ThermalWorkings.tabTwTech);
		molecule_modifier = new Item().setUnlocalizedName("molecule_modifier").setCreativeTab(ThermalWorkings.tabTwTech);
		heat_insulator = new Item().setUnlocalizedName("heat_insulator").setCreativeTab(ThermalWorkings.tabTwTech);
		heat_compartment = new Item().setUnlocalizedName("heat_compartment").setCreativeTab(ThermalWorkings.tabTwTech);
		
		//Oregen
		thermium_crystal = new Item().setUnlocalizedName("thermium_crystal").setCreativeTab(ThermalWorkings.tabThermal);
		sparkium_crystal = new Item().setUnlocalizedName("sparkium_crystal").setCreativeTab(ThermalWorkings.tabThermal);
		
		//Resources and Utilities (Oregen expansion)
		carbon_chunk = new Item().setUnlocalizedName("carbon_fragment").setCreativeTab(ThermalWorkings.tabTwNature);
		carbon_pellet = new Item().setUnlocalizedName("carbon_pellet").setCreativeTab(ThermalWorkings.tabTwNature);
		steel_ingot = new Item().setUnlocalizedName("steel_ingot").setCreativeTab(ThermalWorkings.tabThermal);
		raw_steel = new Item().setUnlocalizedName("raw_steel").setCreativeTab(ThermalWorkings.tabThermal);
		steel_rod = new Item().setUnlocalizedName("steel_rod").setCreativeTab(ThermalWorkings.tabTwTech);
		eletronic_steel_rod = new Item().setUnlocalizedName("eletronic_steel_rod").setCreativeTab(ThermalWorkings.tabTwTech);
		electrified_steel = new Item().setUnlocalizedName("electrified_steel").setCreativeTab(ThermalWorkings.tabTwTech);
		
		//Misc
		adv_compass = new ItemAdvancedCompass().setUnlocalizedName("adv_compass").setCreativeTab(ThermalWorkings.tabThermal);
		//hf_checker = new Item().setUnlocalizedName("hf_checker").setCreativeTab(ThermalWorkings.tabTwTech);
		
		//MK1 Tools
		eletronic_pickaxe = new ItemMk1Pick(mk1Material, "eletronic_pickaxe");
		eletronic_axe = new ItemMk1Axe(mk1Material, "eletronic_axe");
		eletronic_hoe = new ItemMk1Hoe(mk1Material, "eletronic_hoe");
		eletronic_shovel = new ItemMk1Shovel(mk1Material, "eletronic_shovel");
		eletronic_sword = new ItemMk1Sword(mk1Material, "eletronic_sword");
		
		//MK1 Armor
		thermium_helmet = new ItemMk1Armor(mk1AMaterial, 0, 0, "thermium_helmet");
		thermium_chestplate = new ItemMk1Armor(mk1AMaterial, 0, 1, "thermium_chestplate");
		thermium_leggings = new ItemMk1Armor(mk1AMaterial, 1, 2, "thermium_leggings");
		thermium_boots = new ItemMk1Armor(mk1AMaterial, 0, 3, "thermium_boots");
	}
	
	public static void register()
	{
		//Food
		GameRegistry.registerItem(thermal_dish, thermal_dish.getUnlocalizedName().substring(5));
		
		//Technology
		GameRegistry.registerItem(thermal_core, thermal_core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adv_thermal_core, adv_thermal_core.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(double_thermal_core, double_thermal_core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ind_thermal_core, ind_thermal_core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(basic_circuit, basic_circuit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smart_circuit, smart_circuit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermium_module, thermium_module.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(circuit_base, circuit_base.getUnlocalizedName().substring(5));
		
		//Thermal Batteries
		GameRegistry.registerItem(thermal_battery1, thermal_battery1.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermal_battery2, thermal_battery2.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermal_battery3, thermal_battery3.getUnlocalizedName().substring(5));
		
		//Dark Matter
		GameRegistry.registerItem(dm_crystal, dm_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dm_core, dm_core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dm_laser, dm_laser.getUnlocalizedName().substring(5));
		
		//Machine pieces
		GameRegistry.registerItem(heat_projector, heat_projector.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(electro_scope, electro_scope.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(molecule_modifier, molecule_modifier.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(heat_insulator, heat_insulator.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(heat_compartment, heat_compartment.getUnlocalizedName().substring(5));
		
		//Oregen
		GameRegistry.registerItem(thermium_crystal, thermium_crystal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sparkium_crystal, sparkium_crystal.getUnlocalizedName().substring(5));
		
		//Resources and Utilities (extends Oregen)
		GameRegistry.registerItem(carbon_chunk, carbon_chunk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbon_pellet, carbon_pellet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steel_ingot, steel_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_steel, raw_steel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steel_rod, steel_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eletronic_steel_rod, eletronic_steel_rod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(electrified_steel, electrified_steel.getUnlocalizedName().substring(5));
		
		//Misc
		GameRegistry.registerItem(adv_compass, adv_compass.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(hf_checker, hf_checker.getUnlocalizedName().substring(5));
		
		//MK1 Tools
		GameRegistry.registerItem(eletronic_pickaxe, eletronic_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eletronic_axe, eletronic_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eletronic_hoe, eletronic_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eletronic_shovel, eletronic_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(eletronic_sword, eletronic_sword.getUnlocalizedName().substring(5));
		
		//MK1 Armor
		GameRegistry.registerItem(thermium_helmet, thermium_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermium_chestplate, thermium_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermium_leggings, thermium_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thermium_boots, thermium_boots.getUnlocalizedName().substring(5));
		
	}
	

	public static void registerRenders()
	{
		//Food
		registerRender(thermal_dish);
		
		//Technology
		registerRender(thermal_core);
		registerRender(adv_thermal_core);
		registerRender(double_thermal_core);
		registerRender(ind_thermal_core);
		registerRender(basic_circuit); 
		registerRender(smart_circuit); 
		registerRender(thermium_module); 
		registerRender(circuit_base);
		
		//Thermal Batteries
		registerRender(thermal_battery1);
		registerRender(thermal_battery2);
		registerRender(thermal_battery3);
		
		//Dark Matter
		registerRender(dm_crystal);
		registerRender(dm_core);
		registerRender(dm_laser);
		
		//Machine pieces
		registerRender(heat_projector);
		registerRender(electro_scope);
		registerRender(molecule_modifier);
		registerRender(heat_insulator);
		registerRender(heat_compartment);
		
		//Oregen
		registerRender(thermium_crystal);
		registerRender(sparkium_crystal);
		
		//Resources
		registerRender(carbon_chunk);
		registerRender(carbon_pellet);
		registerRender(steel_ingot);
		registerRender(raw_steel);
		registerRender(steel_rod);
		registerRender(eletronic_steel_rod);
		registerRender(electrified_steel);
		
		//Misc
		registerRender(adv_compass);
		//registerRender(hf_checker);
		
		//MK1 Tools
		registerRender(eletronic_pickaxe);
		registerRender(eletronic_axe);
		registerRender(eletronic_hoe);
		registerRender(eletronic_shovel);
		registerRender(eletronic_sword);
		
		//MK1 Armor
		registerRender(thermium_helmet);
		registerRender(thermium_chestplate);
		registerRender(thermium_leggings);
		registerRender(thermium_boots);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}
}
