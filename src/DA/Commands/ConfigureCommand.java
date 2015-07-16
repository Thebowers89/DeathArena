package DA.Commands;

import DA.DeathArenaMain;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class ConfigureCommand implements CommandExecutor {

    DeathArenaMain plugin;
    public ConfigureCommand(DeathArenaMain instance) {
        plugin = instance;
    }

    public HashMap<Location, Long> locations = new HashMap<Location, Long>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (commandLabel.equalsIgnoreCase("configure")) {
            if (sender instanceof Player) {
                if (sender.isOp()) {
                    Player player = (Player) sender;
                    if (args[0].equalsIgnoreCase("tank")) {
                        Location ploc = player.getLocation();

                        plugin.getConfig().set("Class.Tank.Spawn", ploc);
                        sender.sendMessage(ChatColor.DARK_RED + "Tank spawn set.");
                        plugin.saveConfig();
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("ranger")) {
                        Location ploc = player.getLocation();

                        plugin.getConfig().set("Class.Ranger.Spawn", ploc);
                        sender.sendMessage(ChatColor.GREEN + "Ranger spawn set.");
                        plugin.saveConfig();
                        return true;

                    }
                    if (args[0].equalsIgnoreCase("alchemist")) {
                        Location ploc = player.getLocation();

                        plugin.getConfig().set("Class.alchemist.Spawn", ploc);
                        sender.sendMessage(ChatColor.BLUE + "Alchemist spawn set.");
                        plugin.saveConfig();
                        return true;

                    }
                    if (args[0].equalsIgnoreCase("reload")) {
                        plugin.reloadConfig();
                        player.sendMessage(ChatColor.GREEN + "Death Arena config reloaded.");

                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

}
