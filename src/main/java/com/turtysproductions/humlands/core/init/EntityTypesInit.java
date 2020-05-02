package com.turtysproductions.humlands.core.init;

import com.turtysproductions.humlands.HumlandsMod;
import com.turtysproductions.humlands.common.entities.Humadillo;
import com.turtysproductions.umlands.common.entities.Humahog;
import com.turtysproductions.umlands.common.entities.RubberBallEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
	HumlandsMod.MOD_ID);

	public static final RegistryObject<EntityType<Humadillo>> HUMADILLO = ENTITY_TYPES
	.register("humadillo", () -> EntityType.Builder.<Humadillo>create(Humadillo::new, EntityClassification.CREATURE)
	.size(0.9f, 1.3f)
        .build(new ResourceLocation(HumlandsMod.MOD_ID, "humadillo").toString()));
	
	public static final RegistryObject<EntityType<Humahog>> HUMAHOG = ENTITY_TYPES
        .register("humahog", () -> EntityType.Builder.<Humahog>create(Humahog::new, EntityClassification.MONSTER)
        .size(0.9f, 1.3f)
        .build(new ResourceLocation(HumlandsMod.MOD_ID, "humahog").toString()));
        
        public static final RegistryObject<EntityType<RubberBallEntity>> RUBBER_BALL_ENTITY = ENTITY_TYPES
        .register("rubber_ball_entity", () -> EntityType.Builder.<RubberBallEntity>create(RubberBallEntity::new, EntityClassification.MISC)
        .size(0.9f, 1.3f)
        .build(new ResourceLocation(HumlandsMod.MOD_ID, "rubber_ball_entity").toString()));
	
}
