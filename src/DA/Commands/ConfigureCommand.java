package DA.Commands;

import DA.DeathArenaMain;
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
        if (sender instanceof Player) {
            if (sender.isOp()) {
                Player player = (Player) sender;


            }
            return false;
        }
        return false;
    }

}
