package tutorial.generic;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy
{
    public static String ITEMS_PNG = "/tutorial/generic/png/items.png";
    public static String BLOCK_PNG = "/tutorial/generic/png/block.png";
    public static String GenericItem_PNG = "/tutorial/generic/png/GenericItems.png";
    public static String GenericOres_PNG = "/tutorial/generic/png/GenericOre.png";
    public static String Pickaxe_PNG = "/tutorial/generic/png/pickaxe.png";
    public static String Sword_PNG = "/tutorial/generic/png/sword.png";
    public static String Axe_PNG = "/tutorial/generic/png/axe.png";
    public static String Shovel_PNG = "/tutorial/generic/png/shovel.png";
    public static String Hoe_PNG = "/tutorial/generic/png/hoe.png";
    public static String paxel_PNG = "/tutorial/generic/png/paxel.png";
    public static String Gshovel_PNG = "/tutorial/generic/png/gshovel.png";
    public static String Creep_PNG = "/tutorial/generic/png/creep.png";
    public static String copperblock_PNG = "/tutorial/generic/png/copperblock.png";
    public static String battleaxe_PNG = "/tutorial/generic/png/battleaxe.png";
    // Client stuff

    public int addArmor(String armor)
    {
        return 0;
    }
    
    public void registerServerTickHandler()
	 {
	  TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	 }

    public void registerRenderers()
    {
        // Nothing here as the server doesn't render graphics!
    }
}
