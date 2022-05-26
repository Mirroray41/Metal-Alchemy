package net.zappfire.metal_alchemy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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

public class ModItems {
    public static final Item ICRIUM_INGOT = registerItem("icrium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.INGOT)));
    public static final Item ICRIUM_NUGGET = registerItem("icrium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.INGOT)));
    public static final Item RAW_ICRIUM = registerItem("raw_icrium",
            new Item(new FabricItemSettings().group(ModItemGroup.RAW)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MetalAlchemy.MOD_ID,name), item);
    }

    public static void registerModItems() {
        MetalAlchemy.LOGGER.info("Registering Mod Items for Metal Alchemy");
    }
}
