package DA.Commands;

import DA.DeathArenaMain;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.UUID;

public class StartCommand implements CommandExecutor {

    DeathArenaMain plugin;

    public StartCommand(DeathArenaMain instance) {
        plugin = instance;
    }

    public HashMap<UUID, Long> players = new HashMap<UUID, Long>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {



        return false;
    }

}
