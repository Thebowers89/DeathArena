package DA;

import org.bukkit.Location;
import org.bukkit.entity.Zombie;

public class ZombieBoss {

    DeathArenaMain plugin;

    public ZombieBoss(DeathArenaMain instance) {
        plugin = instance;
    }

    public static Zombie zBoss(Location boss) {
        Zombie z = (Zombie) boss.getWorld().spawn(boss, Zombie.class);

        if (z.isBaby() == true) {
            z.setCustomName("Baby Shia");
        }else{
            z.setCustomName("Shia");
        }
        z.setCustomNameVisible(true);
        z.setMaxHealth(250.0);
        z.setHealth(250.0);
        z.getEquipment().setHelmet(ItemStacks.bHead());
        z.getEquipment().setHelmetDropChance(0.1f);
        z.getEquipment().setChestplate(ItemStacks.bChest());
        z.getEquipment().setChestplateDropChance(0.0f);
        z.getEquipment().setLeggings(ItemStacks.bLeg());
        z.getEquipment().setLeggingsDropChance(0.0f);
        z.getEquipment().setBoots(ItemStacks.bBoot());
        z.getEquipment().setBootsDropChance(0.0f);
        z.getEquipment().setItemInHand(ItemStacks.bSword());
        z.getEquipment().setItemInHandDropChance(0.0f);

        return z;
    }

}
