package DA;

import DA.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerCommands();
    }

    private void registerCommands() {
        getCommand("class").setExecutor(new ClassCommand());
        getCommand("start").setExecutor(new StartCommand(this));
    }
}
