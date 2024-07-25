package vaper.ruben.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import vaper.ruben.Vaperruben;
import vaper.ruben.list.FoodList;


public class iteminit {
    public static final Item VAPER = register("vaper",
            new Item(new Item.Settings().food(FoodList.Example_food).maxCount(16)));



    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, Vaperruben.id(name), item);
    }

    public static void load() {}
}
