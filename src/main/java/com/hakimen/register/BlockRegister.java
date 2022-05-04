package com.hakimen.register;

import com.hakimen.Dish;
import com.hakimen.blocks.CuttingBoardBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hakimen.Dish.ModId;

public class BlockRegister {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,ModId);

    public static RegistryObject<CuttingBoardBlock> cutting_board_block = BLOCKS.register("cutting_board",()->{
        return new CuttingBoardBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1).destroyTime(1));
    });
    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
