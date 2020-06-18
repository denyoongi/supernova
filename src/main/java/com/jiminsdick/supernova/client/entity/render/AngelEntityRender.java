package com.jiminsdick.supernova.client.entity.render;

import com.jiminsdick.supernova.Supernova;
import com.jiminsdick.supernova.client.entity.model.AngelEntityModel;
import com.jiminsdick.supernova.entities.AngelEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AngelEntityRender extends MobRenderer<AngelEntity, AngelEntityModel<AngelEntity>>{
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Supernova.MOD_ID,
			"textures/entity/angel_entity.png");
	
	public AngelEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new AngelEntityModel<AngelEntity>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(AngelEntity entity) {
		return TEXTURE;
		
	}

}
