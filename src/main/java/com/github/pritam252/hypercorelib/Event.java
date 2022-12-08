package com.github.pritam252.hypercorelib;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.github.pritam252.hypercorelib.HyperCoreLib;

public class Event {
	public static void TitleScreenInit(CallbackInfo ci) {
		HyperCoreLib.LOGGER.info("Called by TitleScreenInit()");
	}
}
