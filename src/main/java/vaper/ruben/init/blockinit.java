package vaper.ruben.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import vaper.ruben.Vaperruben;

public class blockinit {
    public static final Block vga = registerWithItem("vga", new Block(AbstractBlock.Settings.create()
            .strength(1.5f,6.0f)
            .requiresTool()
    ));


    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, Vaperruben.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        iteminit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
