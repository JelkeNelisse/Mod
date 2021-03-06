package tutorial.generic;


import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;

import java.util.Map;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.RenderingRegistry; 
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class RenderMiner extends RenderLiving
{
public ModelMiner model;

public RenderMiner (ModelMiner par1ModelBase, float par2)
{
super(par1ModelBase, par2);
model = ((ModelMiner)mainModel);
}

public void addRenderer(Map map) 
{ 
	
  map.put(EntityMiner.class, new RenderMiner(new ModelMiner(), 0.5F)); 
}

public void renderMiner(EntityMiner par1EntityMiner, double par2, double par4, double par6, float par8, float par9)
{
    super.doRenderLiving(par1EntityMiner, par2, par4, par6, par8, par9);
}

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
{
    this.renderMiner((EntityMiner)par1EntityLiving, par2, par4, par6, par8, par9);
}

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
{
    this.renderMiner((EntityMiner)par1Entity, par2, par4, par6, par8, par9);
}
}