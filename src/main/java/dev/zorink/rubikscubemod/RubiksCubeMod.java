package dev.zorink.rubikscubemod;

import dev.zorink.rubikscubemod.init.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class RubiksCubeMod
{
    private static Logger logger;

    @Mod.Instance
    public static RubiksCubeMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info(Reference.MODID + ":preInit");
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info(Reference.MODID + ":init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(Reference.MODID + ":postInit");
    }
}
