package dev.zorink.rubikscubemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RubiksCubeBlock extends Block {
    public static final AxisAlignedBB AABB =
            new AxisAlignedBB(6.0 / 16.0, 0, 6.0 / 16.0, 10.0 / 16.0, 4.0 / 16.0, 10.0 / 16.0);

    public RubiksCubeBlock(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(
            IBlockState state, IBlockAccess source, BlockPos pos
    ) {
        return AABB;
    }
}
