package DA;

import DA.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommands();
    }

    private void registerCommands() {
        getCommand("class").setExecutor(new ClassCommand(this));
        getCommand("start").setExecutor(new StartCommand(this));
        getCommand("configure").setExecutor(new ConfigureCommand(this));
        getCommand("summonboss").setExecutor(new BossSummonCommand(this));
    }
}
