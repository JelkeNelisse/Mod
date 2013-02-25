
package tutorial.generic;

import net.minecraft.item.ItemStack;
import thermalexpansion.api.crafting.IPulverizerManager;
import net.minecraft.item.Item;



public interface Pulverizer extends IPulverizerManager {
	
	ItemStack CopperOre = new ItemStack(Generic.genericOre);
	ItemStack CopperBar = new ItemStack(Generic.genericItem);
	ItemStack Creep = new ItemStack(Generic.CreepOre);

	public boolean addRecipe(int energy , ItemStack CopperOre, ItemStack CopperBar, boolean overwrite);
}



/**
 * Add a recipe to the Pulverizer
 * 
 * @param energy
 *            Energy needed to process the item.
 * @param input
 *            ItemStack representing the input item.
 * @param primaryOutput
 *            ItemStack representing the primary output product.
 * @param secondaryOutput
 *            ItemStack representing the secondary output product. Product % is taken to be 100.
 * @param overwrite
 *            Flag to enable recipe overwriting. This will only be allowed if enabled in the Thermal Expansion Configuration file and will be logged for
 *            information purposes.
 */