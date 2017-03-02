package eyeq.playerparticle;

import eyeq.playerparticle.event.PlayerParticleEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.playerparticle.PlayerParticle.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class PlayerParticle {
    public static final String MOD_ID = "eyeq_playerparticle";

    @Mod.Instance(MOD_ID)
    public static PlayerParticle instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PlayerParticleEventHandler());
    }
}
