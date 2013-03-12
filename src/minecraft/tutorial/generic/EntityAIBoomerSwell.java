package tutorial.generic;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityCreeper;

public class EntityAIBoomerSwell extends EntityAIBase
{
    /** The creeper that is swelling. */
    EntityBoomer swellingBoomer;

    /**
     * The creeper's attack target. This is used for the changing of the creeper's state.
     */
    EntityLiving creeperAttackTarget;

    public EntityAIBoomerSwell(EntityBoomer par1EntityBoomer)
    {
        this.swellingBoomer = par1EntityBoomer;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        EntityLiving var1 = this.swellingBoomer.getAttackTarget();
        return this.swellingBoomer.getCreeperState() > 0 || var1 != null && this.swellingBoomer.getDistanceSqToEntity(var1) < 9.0D;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.swellingBoomer.getNavigator().clearPathEntity();
        this.creeperAttackTarget = this.swellingBoomer.getAttackTarget();
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.creeperAttackTarget = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        if (this.creeperAttackTarget == null)
        {
            this.swellingBoomer.setCreeperState(-1);
        }
        else if (this.swellingBoomer.getDistanceSqToEntity(this.creeperAttackTarget) > 49.0D)
        {
            this.swellingBoomer.setCreeperState(-1);
        }
        else if (!this.swellingBoomer.getEntitySenses().canSee(this.creeperAttackTarget))
        {
            this.swellingBoomer.setCreeperState(-1);
        }
        else
        {
            this.swellingBoomer.setCreeperState(1);
        }
    }
}
