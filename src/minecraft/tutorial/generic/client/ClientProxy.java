package tutorial.generic.client;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.generic.CommonProxy;
import tutorial.generic.EntityMiner;
import tutorial.generic.EntityTutorial;
import tutorial.generic.ModelMiner;
import tutorial.generic.ModelTutorial;
import tutorial.generic.RenderMiner;
import tutorial.generic.RenderTutorial;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {

    	Minecraft mc = ModLoader.getMinecraftInstance();
    	
    	mc.installResource("sound3/mob/goblin/hurt.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/hurt.ogg"));
     	mc.installResource("sound3/mob/goblin/say.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/say.ogg"));
     	mc.installResource("sound3/mob/goblin/death.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/death.ogg"));
     	mc.installResource("sound3/mob/goblin/step.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/step.ogg"));
     	mc.installResource("sound3/mob/miner/hurt.ogg", new File (mc.mcDataDir, "resources/tutorial/miner/hurt.ogg"));
     	mc.installResource("sound3/mob/miner/say.ogg", new File (mc.mcDataDir, "resources/tutorial/miner/say.ogg"));
     	mc.installResource("sound3/mob/miner/death.ogg", new File (mc.mcDataDir, "resources/tutorial/miner/death.ogg"));
     	mc.installResource("sound3/mob/miner/step.ogg", new File (mc.mcDataDir, "resources/tutorial/miner/step.ogg"));
        MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        MinecraftForgeClient.preloadTexture(GenericItem_PNG);
        MinecraftForgeClient.preloadTexture(GenericOres_PNG);
        MinecraftForgeClient.preloadTexture(Pickaxe_PNG);
        MinecraftForgeClient.preloadTexture(Axe_PNG);
        MinecraftForgeClient.preloadTexture(Sword_PNG);
        MinecraftForgeClient.preloadTexture(Hoe_PNG);
        MinecraftForgeClient.preloadTexture(Shovel_PNG);
        MinecraftForgeClient.preloadTexture(paxel_PNG);
        MinecraftForgeClient.preloadTexture(Gshovel_PNG);
        MinecraftForgeClient.preloadTexture(Creep_PNG);
        MinecraftForgeClient.preloadTexture(copperblock_PNG);
        MinecraftForgeClient.preloadTexture(battleaxe_PNG);
        MinecraftForgeClient.preloadTexture(rottenapple_PNG);
        MinecraftForgeClient.preloadTexture(hatpiece_PNG);
             }
    

    @Override
    public  void registerRenderInformation() 
    { 
    MinecraftForgeClient.preloadTexture("/tutorial/generic/png/goblin.png"); 
    RenderingRegistry.instance().registerEntityRenderingHandler(EntityTutorial.class, new RenderTutorial(new ModelTutorial(), 0.3F)); //Register the rendering for your entities. 
    RenderingRegistry.instance().registerEntityRenderingHandler(EntityMiner.class, new RenderMiner(new ModelMiner(), 0.3F)); //Register the rendering for your entities. 
    } 
   

    
    public int addArmor(String Armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(Armor);
    }
    
    

}
