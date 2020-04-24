package dev.zorink.rubikscubemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubiksCubeBlock extends Block{
    public RubiksCubeBlock(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
