package com.jiminsdick.supernova;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jiminsdick.supernova.init.ModEntityTypes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("supernova")
public class Supernova
{
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "supernova";
	public static Supernova instance;
	
    public Supernova() 
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
       
        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
     
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
 
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
      
    }
}
