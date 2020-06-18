package com.jiminsdick.supernova.init;

import com.jiminsdick.supernova.Supernova;
import com.jiminsdick.supernova.entities.AngelEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Supernova.MOD_ID);
	
	public static final RegistryObject<EntityType<AngelEntity>> ANGEL = ENTITY_TYPES.register("angel", () -> EntityType.Builder.<AngelEntity>create(AngelEntity::new, EntityClassification.CREATURE).size(0.6f, 1.95f).build(new ResourceLocation(Supernova.MOD_ID, "angel").toString()));

}
