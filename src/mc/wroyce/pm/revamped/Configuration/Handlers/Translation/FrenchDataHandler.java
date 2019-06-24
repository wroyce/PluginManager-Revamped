package mc.wroyce.pm.revamped.Configuration.Handlers.Translation;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FrenchDataHandler {

    File cfile;
    FileConfiguration config;

    public FrenchDataHandler() {
        cfile = new File("Plugins/PluginManager-Revamped/Translation", "English.yml");
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
