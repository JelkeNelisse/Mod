package tutorial.generic;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.oredict.OreDictionary;

public class CopperSword extends ItemSword
{
    public CopperSword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    
    
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
	      return OreDictionary.getOreID("ingotCopper") == OreDictionary.getOreID(par2ItemStack) ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	   }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) 
    { 
             par2EntityLiving.setFire(2); 
    //x is number of seconds set fire for. 
             return true; 
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.Sword_PNG;
    }
}
