package tutorial.generic;

import java.util.EnumSet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	@Override
	 public void tickStart(EnumSet<TickType> type, Object... tickData)
	 {
	  if (type.equals(EnumSet.of(TickType.PLAYER)))
	  {
	    onPlayerTick((EntityPlayer)tickData[0]);
	  }
	 }


	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float var5 = 0.125F;
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1) - var5), (double)(par4 + 1));
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.motionX *= 0.4D;
        par5Entity.motionZ *= 0.4D;
    }
	
	private void onPlayerTick(EntityPlayer player) {
		if(player.getCurrentItemOrArmor(0) != null){
			ItemStack hand = player.getCurrentItemOrArmor(0);
			
			if(hand.getItem() == Generic.CopperBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 2)));
			}
		}
		}


	@Override
	 public EnumSet<TickType> ticks() 
	 {
	  return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	 }
	
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
