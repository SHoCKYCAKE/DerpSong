package io.github.shockycake.derpsong.events;

import io.github.shockycake.derpsong.ModInfo;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundManager {
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event) {
        try {
            event.manager.soundPoolStreaming.addSound("derpsong:crispy.ogg");
            ModInfo.logger.info("Loaded Sounds.");
        } catch (Exception e) {
            ModInfo.logger.warning("Looks like there was a problem loading the sounds with Derpy Songs");
        }
    }

}
