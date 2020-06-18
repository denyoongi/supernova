package com.jiminsdick.supernova.client.entity.model;
import com.jiminsdick.supernova.entities.AngelEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class AngelEntityModel <T extends AngelEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer leftwing;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer rightwing;
	private final ModelRenderer aureol;
	private final ModelRenderer torso;

	public AngelEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(headwear);
		headwear.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(16, 40).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(0, 32).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(leftwing);
		leftwing.setTextureOffset(24, 0).addBox(-2.0F, -22.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		leftwing.setTextureOffset(28, 16).addBox(-3.0F, -23.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(4, 0).addBox(-4.0F, -24.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(56, 18).addBox(-5.0F, -25.0F, 3.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(40, 16).addBox(-6.0F, -26.0F, 3.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(32, 16).addBox(-7.0F, -26.0F, 3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(48, 48).addBox(-8.0F, -27.0F, 3.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(12, 39).addBox(-9.0F, -27.0F, 3.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(12, 46).addBox(-10.0F, -27.0F, 3.0F, 1.0F, 17.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(11, 45).addBox(-11.0F, -27.0F, 3.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(52, 34).addBox(-12.0F, -25.0F, 2.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(52, 17).addBox(-13.0F, -24.0F, 1.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(52, 0).addBox(-14.0F, -22.0F, 0.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(56, 56).addBox(-15.0F, -19.0F, 0.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(56, 9).addBox(-15.0F, -13.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(32, 44).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(32, 0).addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(rightwing);
		rightwing.setTextureOffset(0, 16).addBox(1.0F, -22.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		rightwing.setTextureOffset(24, 16).addBox(2.0F, -23.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(0, 0).addBox(3.0F, -24.0F, 3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(56, 0).addBox(4.0F, -25.0F, 3.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(36, 16).addBox(5.0F, -26.0F, 3.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(16, 32).addBox(6.0F, -26.0F, 3.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(20, 56).addBox(7.0F, -27.0F, 3.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(16, 56).addBox(8.0F, -27.0F, 3.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(8, 47).addBox(9.0F, -27.0F, 3.0F, 1.0F, 17.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(2, 44).addBox(10.0F, -27.0F, 3.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(52, 34).addBox(11.0F, -25.0F, 2.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(48, 0).addBox(12.0F, -24.0F, 1.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(52, 34).addBox(13.0F, -22.0F, 0.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(48, 17).addBox(14.0F, -19.0F, 0.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(44, 16).addBox(14.0F, -13.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		aureol = new ModelRenderer(this);
		aureol.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(aureol);
		aureol.setTextureOffset(30, 0).addBox(-3.0F, -34.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		aureol.setTextureOffset(30, 0).addBox(2.0F, -34.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		aureol.setTextureOffset(4, 16).addBox(-2.0F, -34.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		aureol.setTextureOffset(4, 16).addBox(-2.0F, -34.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		aureol.setTextureOffset(4, 16).addBox(1.0F, -34.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		aureol.setTextureOffset(4, 16).addBox(1.0F, -34.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		aureol.setTextureOffset(0, 22).addBox(-1.0F, -34.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		aureol.setTextureOffset(0, 22).addBox(-1.0F, -34.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(torso);
		torso.setTextureOffset(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}