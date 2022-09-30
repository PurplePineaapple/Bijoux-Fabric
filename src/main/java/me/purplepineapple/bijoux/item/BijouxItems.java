package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.item.items.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BijouxItems {

    // Raw Stones
    public static final Item RAW_AQUAMARINE = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RAW_OPAL = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RAW_ROSE_QUARTZ = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RAW_RUBY = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RAW_SAPPHIRE = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RAW_TOPAZ = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));

    // Polished Stones
    public static final Item AQUAMARINE = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item OPAL = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item ROSE_QUARTZ = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item RUBY = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));
    public static final Item TOPAZ = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));

    // Ruby Tools
    public static final BijouxSword RUBY_SWORD = new BijouxSword(BijouxTiers.RUBY, 3, -2.4F, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final BijouxPickaxe RUBY_PICKAXE = new BijouxPickaxe(BijouxTiers.RUBY, 1, -2.8F, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final BijouxAxe RUBY_AXE = new BijouxAxe(BijouxTiers.RUBY, 5.0F, -3.0F, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final BijouxShovel RUBY_SHOVEL = new BijouxShovel(BijouxTiers.RUBY, 1.5F, -3.0F, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final BijouxHoe RUBY_HOE = new BijouxHoe(BijouxTiers.RUBY, -4, 0.0F, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));

    // Ruby Armor
    public static final ArmorItem RUBY_HELMET = new ArmorItem(BijouxMaterials.RUBY, EquipmentSlot.HEAD, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final ArmorItem RUBY_CHESTPLATE = new ArmorItem(BijouxMaterials.RUBY, EquipmentSlot.CHEST, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final ArmorItem RUBY_LEGGINGS = new ArmorItem(BijouxMaterials.RUBY, EquipmentSlot.LEGS, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));
    public static final ArmorItem RUBY_BOOTS = new ArmorItem(BijouxMaterials.RUBY, EquipmentSlot.FEET, new Item.Settings().group(BijouxTabs.TOOLS_ARMOR));

    public static final Item PLATINUM_BAR = new Item(new Item.Settings().group(BijouxTabs.MATERIALS));

    public static final Item TUMBLER_GRIT = new Item(new Item.Settings().group(BijouxTabs.MATERIALS).maxDamage(25));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_aquamarine"), RAW_AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_opal"), RAW_OPAL);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_rose_quartz"), RAW_ROSE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_ruby"), RAW_RUBY);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_sapphire"), RAW_SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "raw_topaz"), RAW_TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "aquamarine"), AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "rose_quartz"), ROSE_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_hoe"), RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_boots"), RUBY_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "platinum_bar"), PLATINUM_BAR);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "tumbler_grit"), TUMBLER_GRIT);
    }
}