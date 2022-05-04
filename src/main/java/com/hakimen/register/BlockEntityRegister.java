package com.hakimen.register;


import com.hakimen.blocks.CuttingBoardBlock;
import com.hakimen.blocks.block_entities.CuttingBoardBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hakimen.Dish.ModId;

public class BlockEntityRegister {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,ModId);

    public static RegistryObject<BlockEntityType<CuttingBoardBlockEntity>> cutting_board_entity = BLOCK_ENTITY.register("cutting_board_entity",() ->
            BlockEntityType.Builder.of(CuttingBoardBlockEntity::new,BlockRegister.cutting_board_block.get()).build(null));

    public static void register(IEventBus bus){
        BLOCK_ENTITY.register(bus);
    }
}
