package com.yuyuyzl.Accelerator.block;

import com.yuyuyzl.Accelerator.tile.TileAccEnergy;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import static com.yuyuyzl.Accelerator.AcceleratorMod.MODID;

/**
 * Created by yuyuyzl on 2017/3/24.
 */
public class AccEnergyBlock extends AccMachineBlock implements ITileEntityProvider{

    public IIcon hole;
    @Override
    public void registerBlockIcons(IIconRegister icon) {
        super.registerBlockIcons(icon);
        hole=icon.registerIcon(MODID+":machine_hole");
    }
    @Override
    public IIcon getIcon(int facing, int meta) {
        if (facing==0 || facing==1){
            return empty;
        }else {
            return hole;
        }
    }
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileAccEnergy();
    }
}