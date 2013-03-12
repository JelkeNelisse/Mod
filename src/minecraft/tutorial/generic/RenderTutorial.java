package tutorial.generic;


import java.util.Map;

import cpw.mods.fml.client.registry.RenderingRegistry; 
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderTutorial extends RenderLiving
{
public ModelTutorial model;

public RenderTutorial (ModelTutorial par1ModelBase, float par2)
{
super(par1ModelBase, par2);
model = ((ModelTutorial)mainModel);
}

public void addRenderer(Map map) 
{ 
  map.put(EntityTutorial.class, new RenderTutorial(new ModelTutorial(), 0.5F)); 
}


public void renderTutorial(EntityTutorial par1EntityTutorial, double par2, double par4, double par6, float par8, float par9)
{
    super.doRenderLiving(par1EntityTutorial, par2, par4, par6, par8, par9);
}

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
{
    this.renderTutorial((EntityTutorial)par1EntityLiving, par2, par4, par6, par8, par9);
}

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
{
    this.renderTutorial((EntityTutorial)par1Entity, par2, par4, par6, par8, par9);
}
}