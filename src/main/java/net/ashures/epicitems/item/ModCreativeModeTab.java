package net.ashures.epicitems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab EPICITEMS_TAB = new CreativeModeTab("epicitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OPAL_ORB.get());
        }
    };

}
