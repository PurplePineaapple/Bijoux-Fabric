package me.purplepineapple.bijoux.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum BijouxMaterials implements ArmorMaterial {
    RUBY("ruby", 35, new int[]{3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.5F, 0.0F, () -> {
        return Ingredient.ofStacks(new ItemStack(BijouxItems.RUBY));
    });

    private final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantibility;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float kbResistance;
    private final Lazy<Ingredient> ingredient;

    private BijouxMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantibility, SoundEvent equipSound, float toughness, float kbResistance, Supplier ingredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantibility = enchantibility;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.kbResistance = kbResistance;
        this.ingredient = new Lazy(ingredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantibility;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.ingredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.kbResistance;
    }
}
