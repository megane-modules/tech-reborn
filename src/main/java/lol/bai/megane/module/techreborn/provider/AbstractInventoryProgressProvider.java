package lol.bai.megane.module.techreborn.provider;

import lol.bai.megane.api.provider.base.SlotArrayProgressProvider;
import org.jetbrains.annotations.NotNull;
import reborncore.api.blockentity.InventoryProvider;
import net.minecraft.item.ItemStack;

public abstract class AbstractInventoryProgressProvider<T extends InventoryProvider> extends SlotArrayProgressProvider<T> {

    @Override
    protected @NotNull ItemStack getStack(int slot) {
        return getObject().getInventory().getStack(slot);
    }

}
