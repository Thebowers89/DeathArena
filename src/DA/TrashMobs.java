package DA;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Zombie;

public class TrashMobs {

    public static Zombie zTrash(Location loc) {
        Zombie z = (Zombie) loc.getWorld().spawn(loc, Zombie.class);
        z.setCustomName(ChatColor.RED + "Zombie");
        z.setCustomNameVisible(true);
        return z;
    }

    public static Skeleton sTrash(Location loc) {
        Skeleton s = (Skeleton) loc.getWorld().spawn(loc, Skeleton.class);
        s.setCustomName(ChatColor.RED + "Skeleton");
        s.setCustomNameVisible(true);
        return s;
    }

    public static Spider spTrash(Location loc) {
        Spider sp = (Spider) loc.getWorld().spawn(loc, Spider.class);
        sp.setCustomName(ChatColor.RED + "Spider");
        sp.setCustomNameVisible(true);
        return sp;
    }

    public static Witch wTrash(Location loc) {
        Witch w = (Witch) loc.getWorld().spawn(loc, Witch.class);
        w.setCustomName(ChatColor.RED + "Witch");
        w.setCustomNameVisible(true);
        return w;
    }

}
