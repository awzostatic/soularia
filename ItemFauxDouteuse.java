package com.soulariamod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFauxDouteuse extends ItemSword{

	public ItemFauxDouteuse(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.damageItem(1, par3EntityPlayer);
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 3000, 1));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 1500, 0));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 3000, 1));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1500, 1));
        return par1ItemStack;
    }
	

}
