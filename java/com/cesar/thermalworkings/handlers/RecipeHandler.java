package com.cesar.thermalworkings.handlers;

import com.cesar.thermalworkings.init.ThermalBlocks;
import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void registerCraftingRecipes()
	{
		//Blocks
		GameRegistry.addRecipe(new ItemStack(ThermalBlocks.thermium_block), new Object [] { "TTT","TTT","TTT", 'T',ThermalItems.thermium_crystal});
		//GameRegistry.addShapelessRecipe(new ItemStack(ThermalItems.thermium_crystal, 9), new Object []);
		
		//Technology
		GameRegistry.addRecipe(new ItemStack(ThermalItems.thermal_core), new Object [] { "ITI","TAT","ITI", 'T',ThermalItems.thermium_crystal, 'I',Items.iron_ingot, 'A',ThermalItems.thermal_battery3});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.adv_thermal_core), new Object [] { "DID","DTD","DID", 'T',ThermalItems.thermal_core, 'I',Items.iron_ingot, 'D',Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.double_thermal_core), new Object [] { "TTT","ADA","TTT", 'T',ThermalItems.thermium_crystal, 'A',ThermalItems.adv_thermal_core, 'D',Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.ind_thermal_core), new Object [] { "TDT","DDD","TDT", 'D',ThermalItems.double_thermal_core, 'T',ThermalItems.thermium_module});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.basic_circuit), new Object [] { "III","EBE","III", 'E',ThermalItems.eletronic_steel_rod, 'B',ThermalItems.circuit_base, 'I',Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.smart_circuit), new Object [] { "III","BDB","III", 'B',ThermalItems.basic_circuit, 'I',Items.iron_ingot, 'D',Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.thermium_module), new Object [] { "TST","SSS","TST", 'T',ThermalItems.thermium_crystal, 'S',ThermalItems.smart_circuit});
		
		//Thermal Batteries
		GameRegistry.addRecipe(new ItemStack(ThermalItems.thermal_battery1), new Object [] { "ITI","ITI","ITI", 'T',ThermalItems.thermium_crystal, 'I',Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.thermal_battery2), new Object [] { "IDI","TBT","IDI", 'T',ThermalItems.thermium_crystal, 'B',ThermalItems.thermal_battery1, 'I',Items.iron_ingot, 'D',Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.thermal_battery3), new Object [] { "DDD","DAD","DDD", 'D',Items.diamond, 'A',ThermalItems.thermal_battery2});
		
		//Dark Matter
		GameRegistry.addRecipe(new ItemStack(ThermalItems.dm_crystal), new Object [] { "DDD", "DBD", "DDD", 'D',Items.diamond, 'B',Blocks.diamond_block });
		GameRegistry.addRecipe(new ItemStack(ThermalItems.dm_laser), new Object [] { "ISI","DDD","IBI", 'I',ThermalItems.heat_insulator, 'D',ThermalItems.dm_crystal,'S',ThermalItems.smart_circuit, 'B',ThermalItems.basic_circuit });
		GameRegistry.addRecipe(new ItemStack(ThermalItems.dm_core), new Object [] { "ILI","LDL","ILI", 'D',ThermalItems.dm_crystal, 'I',Items.iron_ingot, 'L',ThermalItems.dm_laser });
		
		//Machine pieces
		GameRegistry.addRecipe(new ItemStack(ThermalItems.heat_projector), new Object [] { "SMS","ITT","SBS", 'T',ThermalItems.thermium_crystal, 'S',ThermalItems.steel_ingot, 'M',ThermalItems.smart_circuit, 'I',Items.iron_ingot, 'B',ThermalItems.basic_circuit});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.heat_insulator), new Object [] { "SSS","STS","SSS", 'T',ThermalItems.thermium_crystal, 'S',ThermalItems.steel_ingot});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.heat_compartment), new Object [] { "STS","TTT","STS", 'T',ThermalItems.thermium_crystal, 'S',ThermalItems.steel_ingot});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.electro_scope), new Object [] { "PSP","ASA","PSP", 'A',ThermalItems.thermal_battery2, 'P',ThermalItems.electrified_steel, 'S',ThermalItems.sparkium_crystal});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.molecule_modifier), new Object [] { "SGS","PGP","SGS", 'G',Blocks.glass, 'P',ThermalItems.sparkium_crystal, 'S',ThermalItems.steel_ingot});
		
		//Misc
		GameRegistry.addRecipe(new ItemStack(ThermalItems.adv_compass), new Object [] { "SSS","ERE","SSS", 'S',ThermalItems.steel_ingot, 'E',ThermalItems.electrified_steel, 'R',Items.redstone});
		//GameRegistry.addRecipe(new ItemStack(ThermalItems.hf_checker), new Object [] { "TTT","TTT","TTT", 'T',ThermalItems.thermium_crystal});
		
		//Resources
		GameRegistry.addRecipe(new ItemStack(ThermalItems.steel_rod), new Object [] { "  S"," S ","S  ", 'S',ThermalItems.steel_ingot});
		GameRegistry.addRecipe(new ItemStack(ThermalItems.eletronic_steel_rod), new Object [] { "B B", " S ", "B B", 'B',ThermalItems.basic_circuit, 'S',ThermalItems.steel_rod});
		//GameRegistry.addReci
		
		System.out.println("Crafting recipes are Registered!");
	}
	//public static void registerToolRecipe(Item pickaxe, Item axe, Item hoe, Item sword, Item thermiumcrystal) {
		
	//}

	public static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(ThermalItems.raw_steel, new ItemStack(ThermalItems.steel_ingot), 10);
		GameRegistry.addSmelting(ThermalBlocks.thermium_ore, new ItemStack(ThermalItems.thermium_crystal), 123);
	}
}

