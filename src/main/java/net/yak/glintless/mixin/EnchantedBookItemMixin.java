package net.yak.glintless.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.yak.glintless.Glintless;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EnchantedBookItem.class)
public abstract class EnchantedBookItemMixin {

    @ModifyReturnValue(method = "hasGlint", at = @At("RETURN"))
    private boolean glintless$removeEnchantedBookGlint(boolean original, ItemStack stack) {
        if (stack.isIn(Glintless.NO_GLINT)) {
            return false;
        }
        return original;
    }
}
