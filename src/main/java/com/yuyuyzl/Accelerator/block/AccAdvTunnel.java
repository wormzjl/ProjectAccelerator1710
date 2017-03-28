package com.yuyuyzl.Accelerator.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import static com.yuyuyzl.Accelerator.AcceleratorMod.MODID;

/**
 * Created by yuyuyzl on 2017/3/27.
 */
public class AccAdvTunnel extends AccAdvMachineBlock {
    public IIcon stripe;

    @Override
    public void registerBlockIcons(IIconRegister icon) {
        super.registerBlockIcons(icon);
        stripe=icon.registerIcon(MODID + ":machine1_stripe");
    }

    @Override
    public IIcon getIcon(int facing, int meta) {
        if (facing==0 || facing==1){
            return square;
        }else {
            return stripe;
        }
    }
}