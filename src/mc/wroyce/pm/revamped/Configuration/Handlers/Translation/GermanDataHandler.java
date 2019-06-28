package mc.wroyce.pm.revamped.Configuration.Handlers.Translation;

import mc.wroyce.pm.revamped.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class GermanDataHandler {

    File cfile;
    FileConfiguration config;

    public GermanDataHandler() {
        cfile = new File(Core.getInstance().getDataFolder() + "/Translation/", "German.yml");
        config = YamlConfiguration.loadConfiguration(cfile);
    }

    public void setup() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(cfile);
        if (!cfile.exists()) {
            try { config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }

        if (cfile.exists()) {
            try { config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }
    }
}
