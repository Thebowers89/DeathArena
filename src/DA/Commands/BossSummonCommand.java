package DA.Commands;

import DA.DeathArenaMain;
import DA.ItemStacks;
import DA.ZombieBoss;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class BossSummonCommand implements CommandExecutor {

    DeathArenaMain plugin;

    public BossSummonCommand(DeathArenaMain instance) {
        plugin = instance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            if (sender.isOp()) {
                if (commandLabel.equalsIgnoreCase("summonboss")) {
                    World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("Class.Boss.location.World"));
                    Double x = plugin.getConfig().getDouble("Class.Boss.location.X");
                    Double y = plugin.getConfig().getDouble("Class.Boss.location.Y");
                    Double z = plugin.getConfig().getDouble("Class.Boss.location.Z");
                    Location boss = new Location(w, x, y, z);

                    ZombieBoss.zBoss(boss);
                    return true;
                }
             return false;
            }
            return false;
        }
        return false;
    }
}
