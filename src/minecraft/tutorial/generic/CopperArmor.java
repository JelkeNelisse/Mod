package tutorial.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class CopperArmor extends ItemArmor implements IArmorTextureProvider{

	public CopperArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == Generic.CopperHelmet.itemID || itemstack.itemID == Generic.CopperPlate.itemID || itemstack.itemID ==Generic.CopperBoots.itemID) {
			return "/tutorial/generic/png/copperarmour1.png";
	}
		if(itemstack.itemID == Generic.CopperLegs.itemID){
			 return"/tutorial/generic/png/copperarmour2.png";
	}
		else return "/tutorial/generic/png/copperarmour2.png";
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
	      return Generic.genericItem.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	   }

	
	

	public String getTextureFile(){
		return "/tutorial/generic/png/armour.png";
	}
}