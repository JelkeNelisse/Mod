package tutorial.generic;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class CopperBattleAxe extends ItemSword
{
	

    public CopperBattleAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return OreDictionary.getOreID("ingotCopper") == OreDictionary.getOreID(par2ItemStack) ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
   
   public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5){if(itemstack.isItemEnchanted() == false){itemstack.addEnchantment(Enchantment.knockback, 1);}}
    
    public boolean hasEffect(ItemStack par1ItemStack)
    {
    		return false;
    }


    
   

    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {

        par1ItemStack.damageItem(1, par3EntityLiving);
        //x is number of seconds set fire for.
        return true;
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.battleaxe_PNG;
    }
}