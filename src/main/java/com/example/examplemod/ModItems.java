package com.example.examplemod;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    // ore  
    /*
    public static final RegistryObject<Item> PINK_ORE_ITEM = ITEMS.register("pink_ore",
    	    () -> new BlockItem(ModBlocks.PINK_ORE.get(), new Item.Properties()));*/

    // sword
    public static final RegistryObject<Item> PINK_SWORD = ITEMS.register("pink_sword",
        () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()));
    
    // shovel
    public static final RegistryObject<Item> PINK_SHOVEL = ITEMS.register("pink_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, new Item.Properties()));
    
    // pickaxe
    public static final RegistryObject<Item> PINK_PICKAXE = ITEMS.register("pink_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties()));
    
    // axe
    public static final RegistryObject<Item> PINK_AXE = ITEMS.register("pink_axe",
            () -> new AxeItem(Tiers.DIAMOND, new Item.Properties()));

    // hoe
    public static final RegistryObject<Item> PINK_HOE = ITEMS.register("pink_hoe",
            () -> new HoeItem(Tiers.DIAMOND, new Item.Properties()));
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
