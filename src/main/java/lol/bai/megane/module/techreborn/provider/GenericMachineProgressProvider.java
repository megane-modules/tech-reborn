package lol.bai.megane.module.techreborn.provider;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import reborncore.common.recipes.RecipeCrafter;
import techreborn.blockentity.machine.GenericMachineBlockEntity;

public class GenericMachineProgressProvider extends AbstractInventoryProgressProvider<GenericMachineBlockEntity> {

    private RecipeCrafter crafter;

    @Override
    public void setContext(World world, BlockPos pos, PlayerEntity player, GenericMachineBlockEntity genericMachineBlockEntity) {
        super.setContext(world, pos, player, genericMachineBlockEntity);

        this.crafter = genericMachineBlockEntity.getRecipeCrafter();
    }

    @Override
    public boolean hasProgress() {
        return crafter != null;
    }

    @Override
    protected int[] getInputSlots() {
        return crafter.inputSlots;
    }

    @Override
    protected int[] getOutputSlots() {
        return crafter.outputSlots;
    }

    @Override
    public int getPercentage() {
        return getObject().getProgressScaled(100);
    }

}
