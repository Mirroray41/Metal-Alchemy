
package net.zappfire.metal_alchemy.mixins;

import net.zappfire.metal_alchemy.MetalAlchemy;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MetalAlchemyMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        MetalAlchemy.LOGGER.info("Mixin initialization complete!");
    }
}