package DA.Commands;

import DA.DeathArenaMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StartCommand implements CommandExecutor {

    DeathArenaMain plugin;

    public StartCommand(DeathArenaMain instance) {
        plugin = instance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {

        return false;
    }
}
