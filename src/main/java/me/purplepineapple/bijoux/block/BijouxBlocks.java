package me.purplepineapple.bijoux.block;

import me.purplepineapple.bijoux.Bijoux;
import me.purplepineapple.bijoux.item.BijouxTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class BijouxBlocks {

    // Gem Blocks
    public static final Block AQUAMARINE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.75F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block OPAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block ROSE_QUARTZ_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(7.0F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(7.0F, 3.0F).sounds(BlockSoundGroup.METAL));
    public static final Block TOPAZ_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F, 3.0F).sounds(BlockSoundGroup.METAL));

    // Ore Blocks
    public static final OreBlock DEEPSLATE_RUBY_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(11.5F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock AQUAMARINE_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(7.75F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock OPAL_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(6.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock PLATINUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock ROSE_QUARTZ_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(7.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock RUBY_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(9.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(9.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));
    public static final OreBlock TOPAZ_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(8.0F, 3.0F).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7));

    // ROCK TUMBLER

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "aquamarine_block"), new BlockItem(AQUAMARINE_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "opal_block"), OPAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "opal_block"), new BlockItem(OPAL_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "rose_quartz_block"), ROSE_QUARTZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "rose_quartz_block"), new BlockItem(ROSE_QUARTZ_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "topaz_block"), new BlockItem(TOPAZ_BLOCK, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "aquamarine_ore"), new BlockItem(AQUAMARINE_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "opal_ore"), OPAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "opal_ore"), new BlockItem(OPAL_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "rose_quartz_ore"), ROSE_QUARTZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "rose_quartz_ore"), new BlockItem(ROSE_QUARTZ_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(Bijoux.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(Bijoux.MOD_ID, "topaz_ore"), new BlockItem(TOPAZ_ORE, new FabricItemSettings().group(BijouxTabs.BLOCKS)));

    }
}
