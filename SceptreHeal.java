package com.soulariamod.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SceptreHeal extends Item
{
	public SceptreHeal()
	{
		this.maxStackSize = 1;
		this.setMaxDamage(10);
	
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.damageItem(1, par3EntityPlayer);
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1));
        return par1ItemStack;
    }
}