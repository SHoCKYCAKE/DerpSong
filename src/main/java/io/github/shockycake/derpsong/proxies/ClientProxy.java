package io.github.shockycake.derpsong.proxies;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import io.github.shockycake.derpsong.events.SoundManager;
import io.github.shockycake.derpsong.util.TickHandlerSound;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy {

    public void soundHandler() {
        MinecraftForge.EVENT_BUS.register(new SoundManager());
    }

    public void tickHandler() {
        TickHandlerSound tick = new TickHandlerSound();
        TickRegistry.registerTickHandler(tick, Side.CLIENT);

    }
}
