package mc.wroyce.pm.revamped;

import mc.wroyce.pm.revamped.Commands.CommandLoad;
import mc.wroyce.pm.revamped.Commands.CommandUnload;
import mc.wroyce.pm.revamped.Configuration.ConfigHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Core extends JavaPlugin implements Listener {

    private static Core instance;
    private static Logger logger;

    public void onEnable() {
        instance = this;
        logger = getLogger();
        ConfigHandler.setupConfiguration();
        registerCommands();
    }

    private void registerCommands() {
        getCommand("load").setExecutor(new CommandLoad());
        getCommand("unload").setExecutor(new CommandUnload());
    }

    public static void log (Level level, String message) {
        logger.log(level, message);
    }

    public static Core getInstance() {
        return instance;
    }
}
