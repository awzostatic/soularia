package com.soulariamod.tems;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;


public class ItemsMods extends Item
{
public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
		{
			p_77659_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 2, 0));
			return p_77659_1_;
		}

}
