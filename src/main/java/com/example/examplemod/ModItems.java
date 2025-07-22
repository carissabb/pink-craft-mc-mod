package com.example.examplemod;

import java.util.Collections;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
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

    // sword
    public static final RegistryObject<Item> PINK_SWORD = ITEMS.register("pink_sword",
        () -> new SwordItem(ModToolTiers.PINK, new Item.Properties()));
    
    // shovel
    public static final RegistryObject<Item> PINK_SHOVEL = ITEMS.register("pink_shovel",
            () -> new ShovelItem(ModToolTiers.PINK, new Item.Properties()));
    
    // pickaxe
    public static final RegistryObject<Item> PINK_PICKAXE = ITEMS.register("pink_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PINK, new Item.Properties()));
    
    // axe
    public static final RegistryObject<Item> PINK_AXE = ITEMS.register("pink_axe",
            () -> new AxeItem(ModToolTiers.PINK, new Item.Properties()));

    // hoe
    public static final RegistryObject<Item> PINK_HOE = ITEMS.register("pink_hoe",
            () -> new HoeItem(ModToolTiers.PINK, new Item.Properties()));
    
    // helmet
    public static final RegistryObject<Item> PINK_HELMET = ITEMS.register("pink_helmet",
            () -> new ArmorItem(ModArmorMaterials.PINK_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()));
    
    // chestplate
    public static final RegistryObject<Item> PINK_CHESTPLATE = ITEMS.register("pink_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PINK_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    
    // leggings
    public static final RegistryObject<Item> PINK_LEGGINGS = ITEMS.register("pink_leggings",
            () -> new ArmorItem(ModArmorMaterials.PINK_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    
    // boots
    public static final RegistryObject<Item> PINK_BOOTS = ITEMS.register("pink_boots",
            () -> new ArmorItem(ModArmorMaterials.PINK_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()));
    
    // pink gem
    public static final RegistryObject<Item> PINK_GEM = ITEMS.register("pink_gem",
    	    () -> new Item(new Item.Properties()));
    
    // pink block
    public static final RegistryObject<Item> PINK_BLOCK_ITEM = ITEMS.register("pink_block",
    	    () -> new BlockItem(ModBlocks.PINK_BLOCK.get(), new Item.Properties()));


    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
