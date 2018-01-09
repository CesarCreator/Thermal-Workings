package com.cesar.thermalworkings.items.tools.mk1;

import com.cesar.thermalworkings.init.ThermalItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemMk1Armor extends ItemArmor {

	public ItemMk1Armor(ArmorMaterial material, int renderIndex, int armorType, String unlocalizedName) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	public void onArmorTick(World w, EntityPlayer p, ItemStack i) {
		if (p.inventory.armorItemInSlot(3) != null && p.inventory.armorItemInSlot(3).getItem() == ThermalItems.thermium_helmet
		        && p.inventory.armorItemInSlot(2) != null && p.inventory.armorItemInSlot(2).getItem() == ThermalItems.thermium_chestplate
		        && p.inventory.armorItemInSlot(1) != null && p.inventory.armorItemInSlot(1).getItem() == ThermalItems.thermium_leggings
		        && p.inventory.armorItemInSlot(0) != null && p.inventory.armorItemInSlot(0).getItem() == ThermalItems.thermium_boots) {
		        this.effectPlayer(p, Potion.fireResistance, 1);
		}
	}

	private void effectPlayer(EntityPlayer p, Potion regeneration, int i) {
		
	}

}
