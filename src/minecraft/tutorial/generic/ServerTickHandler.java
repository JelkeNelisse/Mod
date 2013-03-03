package tutorial.generic;

import java.util.EnumSet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
