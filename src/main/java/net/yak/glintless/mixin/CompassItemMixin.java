package net.yak.glintless.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.CompassItem;
import net.minecraft.item.ItemStack;
import net.yak.glintless.Glintless;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CompassItem.class)
public abstract class CompassItemMixin {

    @ModifyReturnValue(method = "hasGlint", at = @At("RETURN"))
    private boolean glintless$removeCompassGlint(boolean original, ItemStack stack) {
        if (stack.isIn(Glintless.NO_GLINT)) {
            return false;
        }
        return original;
    }

}
