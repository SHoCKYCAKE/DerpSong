package io.github.shockycake.derpsong;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import io.github.shockycake.derpsong.items.Items;
import io.github.shockycake.derpsong.network.PacketHandler;
import io.github.shockycake.derpsong.proxies.CommonProxy;
import io.github.shockycake.derpsong.util.Config;
import io.github.shockycake.derpsong.util.ResetCommand;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION)
@NetworkMod(channels = {ModInfo.MOD_CHANNEL}, clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class DerpSong {
    public static int hourTime;
    public static int configPlayTime;
    public static boolean isPlayingRecord;

    @Instance(ModInfo.MOD_ID)
    public static DerpSong instance;

    @SidedProxy(clientSide = "io.github.shockycake.derpsong.proxies.ClientProxy", serverSide = "io.github.shockycake.derpsong.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.createConfig(event.getSuggestedConfigurationFile());
        Items.init();
        proxy.soundHandler();
        proxy.tickHandler();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new ResetCommand());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postLoad(FMLPostInitializationEvent event) {
    }
}
