package net.salamandemon.modaniversario.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.salamandemon.modaniversario.ModAniversario;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModAniversario.MOD_ID);

    public static final DeferredItem<Item> BOLODECENOURACOMCHOCOLATE = ITEMS.register("bolodecenouracomchocolate",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BOLODECENOURACOMCHOCOLATE)));
    public static final DeferredItem<Item> BALDEDECHOCOLATE = ITEMS.register("baldedechocolate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRACK = ITEMS.register("crack",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRACK)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
