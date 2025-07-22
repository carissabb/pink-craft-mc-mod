package com.example.examplemod;
import com.example.examplemod.ModArmorMaterials;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(ExampleMod.MODID)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger();
    

    public ExampleMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register tab content
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    	// get combat items
        if (event.getTab().getDisplayName().getString().equals("Combat")) {
        	event.accept(ModItems.PINK_SWORD.get());
            event.accept(ModItems.PINK_HELMET.get());
            event.accept(ModItems.PINK_CHESTPLATE.get());
            event.accept(ModItems.PINK_LEGGINGS.get());
            event.accept(ModItems.PINK_BOOTS.get());
        }

        
        // get tools & utility items
        if(event.getTab().getDisplayName().getString().equals("Tools & Utilities")) {
        	event.accept(ModItems.PINK_SHOVEL.get());
            event.accept(ModItems.PINK_PICKAXE.get());
            event.accept(ModItems.PINK_AXE.get());
            event.accept(ModItems.PINK_HOE.get());
        }
        
        // get natural blocks
        if (event.getTab().getDisplayName().getString().equals("Natural Blocks")) {
            event.accept(ModBlocks.PINK_ORE.get());
        }
        
        // get ingredients
        if (event.getTab().getDisplayName().getString().equals("Ingredients")) {
            event.accept(ModItems.PINK_GEM.get());
        }
        
        // get building blocks
        if (event.getTab().getDisplayName().getString().equals("Building Blocks")) {
            event.accept(ModBlocks.PINK_BLOCK.get());
        }


    }
}
