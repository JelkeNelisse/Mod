package tutorial.generic;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.event.entity.living.LivingEvent;

public class EntityMiner extends EntityMob{


	public EntityMiner(World par1World) {
		super(par1World);
		this.texture = "/tutorial/generic/png/miner.png";
		this.moveSpeed = 0.25f;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}
	
	public int getTotalArmorValue(){
		return 8;
	}
	
     
	@Override 
	protected String getLivingSound() { 
	return "mob.goblin.say"; 
	}

    
    
    protected String getHurtSound(){
    	return "mob.goblin.hurt";
    }
    
    protected String getDeathSound(){
    	return "mob.goblin.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4){
    	this.worldObj.playSoundAtEntity(this, "mob.goblin.step", 0.15F, 1.0F);
    }

    
	protected boolean isAIEnabled(){
		return true;
	}

	@Override
	public int getMaxHealth() {
		
		return 20;
	}
	
	public int getAttackStrenght (Entity par1Entity){
		return 4;
	}
	
	protected int getDropItemId(){
		return Generic.HatPiece.itemID;
	}
	
	 protected void dropRareDrop(int par1)
	    {
	        switch (this.rand.nextInt(3))
	        {
	            case 0:
	                this.dropItem(Item.ingotIron.itemID, 1);
	                break;

	            case 1:
	                this.dropItem(Item.bone.itemID, 1);
	                break;

	            case 2:
	                this.dropItem(Item.rottenFlesh.itemID, 1);
	            
	        }
	    }
	
	public EnumCreatureAttribute getCreatureAttribute(){
		return EnumCreatureAttribute.UNDEFINED;
	}

}
