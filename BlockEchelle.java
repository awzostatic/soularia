package com.soulariamod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
import java.util.Random;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import static net.minecraftforge.common.util.ForgeDirection.*;
 
public class BlockEchelle extends Block
{
        public BlockEchelle()
    {
        super(Material.circuits);
    }
 
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }
 
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        this.func_149797_b(world.getBlockMetadata(x, y, z));
    }
 
 
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }
 
    public void func_149797_b(int p_149797_1_)
    {
        float f = 0.125F;
 
        if (p_149797_1_ == 2)
        {
            this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
 
        if (p_149797_1_ == 3)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
 
        if (p_149797_1_ == 4)
        {
            this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
 
        if (p_149797_1_ == 5)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
    }
 
    public boolean isOpaqueCube()
    {
        return false;
    }
 
   
    public boolean renderAsNormalBlock()
    {
        return false;
    }
 
    public int getRenderType()
    {
        return 8;
    }
 
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return world.isSideSolid(x - 1, y, z, EAST ) ||
               world.isSideSolid(x + 1, y, z, WEST ) ||
               world.isSideSolid(x, y, z - 1, SOUTH) ||
               world.isSideSolid(x, y, z + 1, NORTH);
    }
 
   
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
        int j1 = metadata;
 
        if ((metadata == 0 || side == 2) && world.isSideSolid(x, y, z + 1, NORTH))
        {
            j1 = 2;
        }
 
        if ((j1 == 0 || side == 3) && world.isSideSolid(x, y, z - 1, SOUTH))
        {
            j1 = 3;
        }
 
        if ((j1 == 0 || side == 4) && world.isSideSolid(x + 1, y, z, WEST))
        {
            j1 = 4;
        }
 
        if ((j1 == 0 || side == 5) && world.isSideSolid(x - 1, y, z, EAST))
        {
            j1 = 5;
        }
 
        return j1;
    }
 
   
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        int l = world.getBlockMetadata(x, y, z);
        boolean flag = false;
 
        if (l == 2 && world.isSideSolid(x, y, z + 1, NORTH))
        {
            flag = true;
        }
 
        if (l == 3 && world.isSideSolid(x, y, z - 1, SOUTH))
        {
            flag = true;
        }
 
        if (l == 4 && world.isSideSolid(x + 1, y, z, WEST))
        {
            flag = true;
        }
 
        if (l == 5 && world.isSideSolid(x - 1, y, z, EAST))
        {
            flag = true;
        }
 
        if (!flag)
        {
            this.dropBlockAsItem(world, x, y, z, l, 0);
            world.setBlockToAir(x, y, z);
        }
 
        super.onNeighborBlockChange(world, x, y, z, block);
    }
 
   
    public int quantityDropped(Random random)
    {
        return 1;
    }
 
        @Override
    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity)
    {
                entity.getAIMoveSpeed();
        return true;
    }
 
}
