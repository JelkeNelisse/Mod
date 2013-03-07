package tutorial.generic;

import java.util.ArrayList;
import java.util.EnumSet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import tutorial.generic.*;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;





public class ServerTickHandler implements ITickHandler {
	
	
	Item Axes[] = new Item[]{Generic.WoodenBattleAxe, Generic.StoneBattleAxe, Generic.IronBattleAxe, 
	Generic.EmeraldBattleAxe, Generic.GoldenBattleAxe, Generic.CopperBattleAxe};
	
	
	
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
			
			
			if(hand.getItem() == Generic.WoodenBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 1)));
			}
			
			if(hand.getItem() == Generic.StoneBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 2)));
			}
			
			if(hand.getItem() == Generic.IronBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 2)));
			}
			
			if(hand.getItem() == Generic.EmeraldBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 2)));
			}
			
			if(hand.getItem() == Generic.GoldenBattleAxe){
				player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 10, 1)));
				player.addPotionEffect((new PotionEffect(Potion.heal.getId(), 10, 1)));
			}
			
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
