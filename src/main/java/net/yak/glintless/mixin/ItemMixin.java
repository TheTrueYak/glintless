package net.yak.glintless.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.yak.glintless.Glintless;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Item.class)
public abstract class ItemMixin {

    @ModifyReturnValue(method = "hasGlint", at = @At("RETURN"))
    private boolean glintless$removeGlint(boolean original, ItemStack stack) {
        if (stack.isIn(Glintless.NO_GLINT)) {
            return false;
        }
        return original;
    }
}
