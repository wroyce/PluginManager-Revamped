package mc.wroyce.pm.revamped.Configuration.Handlers;

import mc.wroyce.pm.revamped.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ConfigDataHandler {

    File cfile;
    FileConfiguration config;

    public ConfigDataHandler() {
        cfile = new File(Core.getInstance().getDataFolder(), "Config.yml");
        config = YamlConfiguration.loadConfiguration(cfile);
    }

    public void setup() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(cfile);
        if (!cfile.exists()) {
            try {
                config.set("Language", "English");
                config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }

        if (cfile.exists()) {
            try {
                config.set("Language", "English");
                config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }
    }
}
