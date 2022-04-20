package com.example.example_mod.quilt;

import com.example.example_mod.ExampleMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExampleModQuilt implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		// Do Quilt stuff here.
		ExampleMod.LOGGER.info("I also forgot to remove this message from the Quilt mod!");

	}
}
