package com.github.pritam252.hypercorelib.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.github.pritam252.hypercorelib.HyperCoreLib;
import com.github.pritam252.hypercorelib.Event;

@Mixin(TitleScreen.class)
public class TitleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Event.TitleScreenInit(info);
	}
}
