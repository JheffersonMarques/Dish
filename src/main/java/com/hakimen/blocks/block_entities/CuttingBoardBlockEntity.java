package com.hakimen.blocks.block_entities;

import com.hakimen.register.BlockEntityRegister;
import com.hakimen.register.BlockRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.hakimen.register.BlockEntityRegister.cutting_board_entity;

public class CuttingBoardBlockEntity extends BlockEntity {
    public CuttingBoardBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(cutting_board_entity.get(), pWorldPosition, pBlockState);
    }
}
