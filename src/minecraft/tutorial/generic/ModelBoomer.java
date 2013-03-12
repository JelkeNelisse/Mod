package tutorial.generic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBoomer extends ModelBase
{
//fields
 ModelRenderer head;
 ModelRenderer body;
 ModelRenderer armright;
 ModelRenderer armleft;
 ModelRenderer boneleft;

public ModelBoomer()
{
 textureWidth = 32;
 textureHeight = 64;
 
   head = new ModelRenderer(this, 0, 0);
   head.addBox(-3F, -6F, 0F, 6, 6, 6);
   head.setRotationPoint(0F, 22F, -7F);
   head.setTextureSize(32, 64);
   head.mirror = true;
   setRotation(head, -0.3346075F, 0F, 0F);
   body = new ModelRenderer(this, 0, 12);
   body.addBox(0F, 0F, 0F, 9, 3, 7);
   body.setRotationPoint(-4.5F, 21F, -1F);
   body.setTextureSize(32, 64);
   body.mirror = true;
   setRotation(body, 0F, 0F, 0F);
   armright = new ModelRenderer(this, 3, 22);
   armright.addBox(0F, 0F, 0F, 2, 1, 2);
   armright.setRotationPoint(4F, 22.5F, 0F);
   armright.setTextureSize(32, 64);
   armright.mirror = true;
   setRotation(armright, 0F, 0F, 0F);
   armleft = new ModelRenderer(this, 11, 22);
   armleft.addBox(0F, 0F, 0F, 3, 2, 2);
   armleft.setRotationPoint(-7F, 21.5F, 0F);
   armleft.setTextureSize(32, 64);
   armleft.mirror = true;
   setRotation(armleft, 0F, 0F, 0F);
   boneleft = new ModelRenderer(this, 25, 0);
   boneleft.addBox(0F, 0F, 0F, 1, 1, 2);
   boneleft.setRotationPoint(-6.5F, 22F, -2F);
   boneleft.setTextureSize(32, 64);
   boneleft.mirror = true;
   setRotation(boneleft, 0F, 0F, 0F);
}

public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
{
 super.render(par1Entity, par2, par3, par4, par5, par6, par7);
 setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
 head.render(par7);
 body.render(par7);
 armright.render(par7);
 armleft.render(par7);
 boneleft.render(par7);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
}

public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	    float var8 = MathHelper.sin(this.onGround * (float)Math.PI);
	    float var9 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
	    this.armleft.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.armleft.rotateAngleY = 0.0F;
	    
}
}
