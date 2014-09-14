package test.testbasic.testmod;

import test.testbasic.testmod.blocks.ModBlocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Constants.MODID", name = "Constants.NAME", version = "Constants.VERSION")
public class StronicTest {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.Init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void posteInit(FMLPostInitializationEvent event) {
		
	}
}
