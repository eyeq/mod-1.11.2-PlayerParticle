package eyeq.playerparticle.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.Random;

public class PlayerParticleEventHandler {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        World world = player.getEntityWorld();
        Random rand = player.getRNG();
        Vec3d pos = player.getPositionVector();
        for(int i = 0; i < 2; i++) {
            Vec3d posi = pos.addVector(player.width * (rand.nextDouble() - 0.5D), player.height * rand.nextDouble(), player.width * (rand.nextDouble() - 0.5D));
            world.spawnParticle(EnumParticleTypes.REDSTONE, posi.xCoord, posi.yCoord, posi.zCoord, rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
        }
    }
}
