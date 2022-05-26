package net.zappfire.metal_alchemy.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.zappfire.metal_alchemy.MetalAlchemy;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block ICRIUM_BLOCK = registerBlock("icrium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.MISC);

    public static final Block ICRIUM_ORE = registerBlock("icrium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.MISC);
    public static final Block DEEPSLATE_ICRIUM_ORE = registerBlock("deepslate_icrium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.MISC,"","");

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey, String shiftTooltipKey) {
        registerBlockItem(name, block, group, tooltipKey, shiftTooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MetalAlchemy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey, String shiftTooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MetalAlchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        if(Screen.hasShiftDown()) {
                            tooltip.add(new TranslatableText(tooltipKey));
                            tooltip.add(new TranslatableText("general.tooltip"));
                        } else {
                            tooltip.add(new TranslatableText(shiftTooltipKey));
                        }
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group, String shiftTooltipKey) {
        registerBlockItem(name, block, group, shiftTooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MetalAlchemy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String shiftTooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MetalAlchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        if(Screen.hasShiftDown()) {
                            tooltip.add(new TranslatableText("general.tooltip"));
                        } else {
                            tooltip.add(new TranslatableText(shiftTooltipKey));
                        }
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MetalAlchemy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MetalAlchemy.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MetalAlchemy.LOGGER.info("Registering ModBlocks for Metal Alchemy");
    }

}
