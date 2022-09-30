package me.purplepineapple.bijoux.item;

import me.purplepineapple.bijoux.Bijoux;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BijouxTabs {

    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.create(
            new Identifier(Bijoux.MOD_ID, "blocks"))
            .icon(() -> new ItemStack(BijouxBlocks.RUBY_BLOCK))
            .build();

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.create(
            new Identifier(Bijoux.MOD_ID, "materials"))
            .icon(() -> new ItemStack(BijouxItems.PLATINUM_BAR))
            .build();

    public static final ItemGroup TOOLS_ARMOR = FabricItemGroupBuilder.create(
            new Identifier(Bijoux.MOD_ID, "tools_armor"))
            .icon(() -> new ItemStack(BijouxItems.RUBY_HOE))
            .build();
}
