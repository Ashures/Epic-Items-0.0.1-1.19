package net.ashures.epicitems.item;

import net.ashures.epicitems.EpicItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicItems.MOD_ID);

    public static final RegistryObject<Item> RAW_OPAL = ITEMS.register("raw_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICITEMS_TAB)));

    public static final RegistryObject<Item> OPAL_ORB = ITEMS.register("opal_orb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICITEMS_TAB)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
