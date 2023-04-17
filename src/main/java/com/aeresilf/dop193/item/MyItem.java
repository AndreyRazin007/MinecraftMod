package com.aeresilf.dop193.item;

import com.aeresilf.dop193.dop193;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MyItem {
    public static final DeferredRegister<Item> MYITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dop193.MOD_ID);

    public static void register(IEventBus eventBus) {
        MYITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> ABSTRACTION = MYITEMS.register("abstraction",
            () -> new Item(new Item.Properties()));
}
