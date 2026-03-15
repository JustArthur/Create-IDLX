package com.vladiscrafter.createidlx.mixin.source;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.simibubi.create.content.redstone.displayLink.source.CurrentFloorDisplaySource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CurrentFloorDisplaySource.class)
public class CurrentFloorDisplaySourceMixin {
    @ModifyReturnValue(method = "allowsLabeling", at = @At("RETURN"))
    protected boolean allowsLabeling(boolean original) {
        return true;
    }
}
