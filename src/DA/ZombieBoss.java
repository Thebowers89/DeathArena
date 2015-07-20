package DA;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ZombieBoss {

    DeathArenaMain plugin;

    public ZombieBoss(DeathArenaMain instance) {
        plugin = instance;
    }

    public static Zombie zBoss(Location boss) {
        Zombie z = (Zombie) boss.getWorld().spawn(boss, Zombie.class);

        if (z.isBaby() == true) {
            z.setCustomName(ChatColor.RED + "Baby Labeouf");
        }else{
            z.setCustomName(ChatColor.RED + "Shia Labeouf");
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
        z.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 25000, 3));
        z.setRemoveWhenFarAway(false);

        return z;
    }

}
