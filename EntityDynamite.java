package com.soulariamod.init;
 
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
 
public class EntityDynamite extends EntityThrowable implements IEntityAdditionalSpawnData
{
   private int fuseTime = 40;
private ByteBuf additionalData;
 
   public EntityDynamite(World world)
   {
       super(world);
   }
 
   public EntityDynamite(World world, EntityLivingBase thrower)
   {
       super(world, thrower);
   }
 
   public EntityDynamite(World world, double x, double y, double z)
   {
       super(world, x, y, z);
   }
 
   protected void onImpact(MovingObjectPosition mop)
   {
       this.motionX = 0;
       this.motionY = 0;
       this.motionZ = 0;
       if (!this.worldObj.isRemote)
       {
 
       }
   }       
   @Override
   public void onUpdate()
   {
       super.onUpdate();
       if(this.fuseTime > 0)
       {
           this.fuseTime --;
       }
 
       else if(!this.worldObj.isRemote)
       {
           this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 5.0F, false, true);
           this.setDead();
       }
 
   }
 
   @Override
   public void writeSpawnData(ByteBuf buffer)
   {
	   buffer.writeDouble(this.motionX);
	this.motionX = additionalData.readDouble();
	   buffer.writeDouble(this.motionY);
	this.motionY = additionalData.readDouble();
	   buffer.writeDouble(this.motionZ);
	this.motionZ = additionalData.readDouble();
       buffer.writeInt(this.fuseTime);
   }
 
   @Override
   public void readSpawnData(ByteBuf additionalData)
   {
       this.fuseTime = additionalData.readInt();
   }
}
