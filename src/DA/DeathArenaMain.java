package DA;

import DA.Commands.*;
import DA.EventHandlers.*;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
    }

    private void registerCommands() {
        getCommand("class").setExecutor(new ClassCommand(this));
        getCommand("start").setExecutor(new StartCommand(this));
        getCommand("configure").setExecutor(new ConfigureCommand(this));
        getCommand("summonboss").setExecutor(new BossSummonCommand(this));
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new TrashMobSpawn(this), this);
    }

}
