package com.aeresilf.dop193.block;

import com.aeresilf.dop193.dop193;
import com.aeresilf.dop193.item.ModItems;
import com.aeresilf.dop193.item.MyItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MyBlocks {
    public static final DeferredRegister<Block> MYBLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, dop193.MOD_ID);

    public static void register(IEventBus eventBus) {
        MYBLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block) {
        return MyItem.MYITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = MYBLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> ABSTARCTIONBLOCK = registerBlock("abstraction_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));
}
