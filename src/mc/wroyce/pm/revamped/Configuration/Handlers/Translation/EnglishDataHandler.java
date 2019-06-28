package mc.wroyce.pm.revamped.Configuration.Handlers.Translation;

import mc.wroyce.pm.revamped.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class EnglishDataHandler {

    File cfile;
    FileConfiguration config;

    public EnglishDataHandler() {
        cfile = new File(Core.getInstance().getDataFolder() + "/Translation/", "English.yml");
        config = YamlConfiguration.loadConfiguration(cfile);
    }

    public void setup() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(cfile);
        if (!cfile.exists()) {
            try {
                // Basic General
                config.set("Messages.Usage", "&6(!) &7Usage: <load:unload> <plugin>");

                // Loading a plugin
                config.set("Load.Usage", "&6(!) &7Usage: load <plugin>");
                config.set("Load.Success", "&a(!) &7%Plugin% &ahas been loaded.");
                config.set("Load.Already-Loaded", "&c(!) &7%Plugin% &cis already loaded.");
                config.set("Load.DoesNotExist", "&c(!) Plugin is spelled wrong or could not be found.");

                // Unloading a plugin
                config.set("Unload.Usage", "&6(!) &7Usage: unload <plugin>");
                config.set("Unload.Success", "&a(!) &7%Plugin% &ahas been unloaded.");
                config.set("Unload.Already-Unloaded", "&c(!) &7%Plugin% &cis already unloaded.");
                config.set("Unload.DoesNotExist", "&c(!) Plugin is spelled wrong or could not be found.");

                // Saving the configuration
                config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }

        if (cfile.exists()) {
            try { config.save(cfile);
            } catch (Exception ex ) { ex.printStackTrace(); }
        }
    }
}
