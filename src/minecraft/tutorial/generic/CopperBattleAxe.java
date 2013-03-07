package tutorial.generic;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.oredict.OreDictionary;

public class CopperBattleAxe extends ItemSword
{
	
	
    public static void knockbackEntity (EntityLiving living, double boost)	{	
		living.motionX *= boost;
		}


    public CopperBattleAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return OreDictionary.getOreID("ingotCopper") == OreDictionary.getOreID(par2ItemStack) ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
  
   
   // public void onUpdate(ItemStack itemstack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving){
    	//if(itemstack.isItemEnchanted() == false){itemstack.addEnchantment(Enchantment.knockback, 1);}}
    

    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
    	knockbackEntity(par2EntityLiving, 1.7f);
        par1ItemStack.damageItem(1, par3EntityLiving);

        return true;
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.battleaxe_PNG;
    }

}
