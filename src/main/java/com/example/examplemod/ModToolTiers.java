package com.example.examplemod;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ModToolTiers {
    public static final Tier PINK = new Tier() {
    	
    	@Override
        public int getUses() {
            return 1800; // durability
        }

        @Override
        public float getSpeed() {
            return 10.0F; // mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 4.0F; // base attack damage
        }
        

        @Override
        public int getEnchantmentValue() {
            return 22; // how easily enchanted
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.PINK_GEM.get()); // use your gem item
        }

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
		    return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("minecraft", "needs_diamond_tool"));
		}
  
    };
}
