package test.testbasic.testmod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import test.testbasic.testmod.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class orangeBlock extends Block {
	
	private String name = "orangeBlock";
	
	private IIcon[] icons = new IIcon[6];
	
	public orangeBlock(){
		
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(Constants.MODID + "_" + name);
		this.setBlockTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);

	}

	@Override
	
	public IIcon getIcon(int side, int meta) {
	    return icons[side];
	}
	
	public void registerBlockIcons (IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
		}
	
	}
	
	private void setTextureName(String string) {
		
	}

}
