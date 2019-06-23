package mc.wroyce.pm.revamped.Commands;

import mc.wroyce.pm.revamped.Managers.PermissionManager;
import mc.wroyce.pm.revamped.Utilities.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import static mc.wroyce.pm.revamped.Utilities.Util.color;

import java.io.File;

public class CommandLoad implements CommandExecutor {

    File cfile;
    FileConfiguration config;

    public CommandLoad() {
        cfile = new File("Plugins/PluginManager-Revamped/Translation", "English.yml");
        config = YamlConfiguration.loadConfiguration(cfile);
    }

    public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission(PermissionManager.loadPermission)) {
            try {
                Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin(args[0]);
                if (plugin != null && !plugin.isEnabled()) {
                    Bukkit.getPluginManager().enablePlugin(plugin);
                    player.sendMessage(color(config.getString("Load.Success")).replace("%Plugin%", args[0]));
                    Util.sendConsole("save-all");
                    return true;
                }

                if (plugin != null && plugin.isEnabled()) {
                    player.sendMessage(color(config.getString("Load.Already-Loaded")).replace("%Plugin%", args[0]));
                    return true;
                }

                if (plugin == null) {
                    player.sendMessage(color(config.getString("Unload.DoesNotExist")));
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                player.sendMessage(color(config.getString("Load.Usage")));
            }
        }
        return false;
    }
}
