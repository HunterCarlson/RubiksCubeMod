package dev.zorink.rubikscubemod.init;

import dev.zorink.rubikscubemod.Reference;
import dev.zorink.rubikscubemod.blocks.RubiksCubeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModBlocks {

    static Block rubiksCubeBlock;

    public static void init() {
        rubiksCubeBlock =
                new RubiksCubeBlock("rubiksCubeBlock", Material.WOOD).setCreativeTab(CreativeTabs.DECORATIONS);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(rubiksCubeBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(rubiksCubeBlock).setRegistryName(rubiksCubeBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(rubiksCubeBlock));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                new ModelResourceLocation(item.getRegistryName(), "inventory")
        );
    }

}
