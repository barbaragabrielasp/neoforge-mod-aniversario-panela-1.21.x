package net.salamandemon.modaniversario.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.salamandemon.modaniversario.ModAniversario;
import net.salamandemon.modaniversario.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModAniversario.MOD_ID);

    public static final Supplier<CreativeModeTab> PANELA_ITEMS_TAB = CREATIVE_MODE_TAB.register("panela_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOLODECENOURACOMCHOCOLATE.get()))
                    .title(Component.translatable("creativetab.modaniversario.panela_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BOLODECENOURACOMCHOCOLATE);
                        output.accept(ModItems.BALDEDECHOCOLATE);
                        output.accept(ModItems.CRACK);
                    }).build());

    public static final Supplier<CreativeModeTab> PANELA_BLOCK_TAB = CREATIVE_MODE_TAB.register("panela_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCODEMACONHA))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ModAniversario.MOD_ID, "panela_items_tab"))
                    .title(Component.translatable("creativetab.modaniversario.panela_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOCODEMACONHA);
                        output.accept(ModBlocks.PEDRADECRACK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
