package net.zappfire.metal_alchemy.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zappfire.metal_alchemy.MetalAlchemy;
import net.zappfire.metal_alchemy.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup INGOT = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"ingot"),
            () ->new ItemStack(ModItems.ICRIUM_INGOT));
    public static final ItemGroup ORE = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"ore"),
            () ->new ItemStack(ModBlocks.ICRIUM_ORE));
    public static final ItemGroup TOOL = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"tool"),
            () ->new ItemStack(ModItems.ICRIUM_INGOT));
    public static final ItemGroup ARMOR = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"armor"),
            () ->new ItemStack(ModItems.ICRIUM_INGOT));
    public static final ItemGroup BLOCK = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"block"),
            () ->new ItemStack(ModBlocks.ICRIUM_BLOCK));
    public static final ItemGroup RAW = FabricItemGroupBuilder.build(new Identifier(MetalAlchemy.MOD_ID,"raw"),
            () ->new ItemStack(ModItems.RAW_ICRIUM));
}
