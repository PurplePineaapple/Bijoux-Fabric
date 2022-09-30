package me.purplepineapple.bijoux.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BijouxTiers implements ToolMaterial {
    RUBY(2000, 9.0F, 3.5F, 3, 22, () -> {
        return Ingredient.ofStacks(new ItemStack(BijouxItems.RUBY));
    });

    private final int durability;
    private final float speed;
    private final float damage;
    private final int level;
    private final int enchantability;
    private final Lazy<Ingredient> ingredient;

    private BijouxTiers(int durability, float speed, float damage, int level, int enchantability, Supplier ingredient) {
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
        this.enchantability = enchantability;
        this.ingredient = new Lazy(ingredient);
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    @Override
    public float getAttackDamage() {
        return this.damage;
    }

    @Override
    public int getMiningLevel() {
        return this.level;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
