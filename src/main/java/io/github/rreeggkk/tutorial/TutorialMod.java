package io.github.rreeggkk.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "tutorialMod", name = "Tutorial Mod", version = "0.0.1")
public class TutorialMod
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
