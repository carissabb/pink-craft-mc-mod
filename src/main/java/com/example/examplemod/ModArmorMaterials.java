package com.example.examplemod;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final ArmorMaterial PINK = new ArmorMaterial(
    	new EnumMap<>(ArmorItem.Type.class) {{
    		put(ArmorItem.Type.BOOTS, 3);
    		put(ArmorItem.Type.LEGGINGS, 6);
    		put(ArmorItem.Type.CHESTPLATE, 8);
    		put(ArmorItem.Type.HELMET, 3);
    		put(ArmorItem.Type.BODY, 11); 
    	}},
        	30,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 
            () -> Ingredient.of(ModItems.PINK_GEM.get()),
            List.of(new ArmorMaterial.Layer(new ResourceLocation("examplemod", "pink"))),
            2.0f, // toughness
            0.1f  // knockback resistance
        );
    public static final Holder<ArmorMaterial> PINK_MATERIAL = Holder.direct(ModArmorMaterials.PINK);
}
