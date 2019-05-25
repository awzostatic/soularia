package com.soulariamod.init;

import com.soulariamod.CheminSoularia;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemPArmor extends ItemArmor {

	public ItemPArmor(ArmorMaterial material, int metaData) 
	{
		super(material, 0, metaData);
	}
	
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.leggingsRuby)
        {
            return CheminSoularia.MOD_ID + ":textures/models/armor/rubyMod_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmetRuby || stack.getItem() == ItemMod.chestPlateRuby || stack.getItem() == ItemMod.bootsRuby) 
        	
        {
        
        return CheminSoularia.MOD_ID + ":textures/models/armor/rubyMod_layer_1.png";
      
        }
        else if(stack.getItem() == ItemMod.leggingsCobalt)
        {
            return CheminSoularia.MOD_ID + ":textures/models/armor/cobaltMod_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmetCobalt || stack.getItem() == ItemMod.chestPlateCobalt || stack.getItem() == ItemMod.bootsCobalt) 
        	
        {
        
        return CheminSoularia.MOD_ID + ":textures/models/armor/cobaltMod_layer_1.png";
        
        }
        else if(stack.getItem() == ItemMod.leggingsJade)
        {
            return CheminSoularia.MOD_ID + ":textures/models/armor/jadeMod_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmetJade || stack.getItem() == ItemMod.chestPlateJade || stack.getItem() == ItemMod.bootsJade) 
        	
        {
        
        return CheminSoularia.MOD_ID + ":textures/models/armor/jadeMod_layer_1.png";
        
        }
        else if(stack.getItem() == ItemMod.leggingsEnfer)
        {
            return CheminSoularia.MOD_ID + ":textures/models/armor/enferMod_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmetEnfer || stack.getItem() == ItemMod.chestPlateEnfer || stack.getItem() == ItemMod.bootsEnfer) 
        	
        {
        
        return CheminSoularia.MOD_ID + ":textures/models/armor/enferMod_layer_1.png";
        
        }
        else if(stack.getItem() == ItemMod.leggingssoularium)
        {
            return CheminSoularia.MOD_ID + ":textures/models/armor/soulariumMod_layer_2.png";
        }
        else if(stack.getItem() == ItemMod.helmetsoularium || stack.getItem() == ItemMod.chestPlatesoularium || stack.getItem() == ItemMod.bootssoularium) 
        	
        {
        
        return CheminSoularia.MOD_ID + ":textures/models/armor/soulariumMod_layer_1.png";
        
        }
        
        return null;
    }
}
        	


