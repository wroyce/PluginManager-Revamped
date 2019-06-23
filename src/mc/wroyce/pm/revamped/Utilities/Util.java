package mc.wroyce.pm.revamped.Utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Util
{
    public static void sendConsole(String command)
    {
        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), command);
    }

    public static void log(String message)
    {
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(color(message));
    }

    public static String color(String message)
    {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static List<String> colorList(List<String> input)
    {
        List<String> ret = new ArrayList();
        String line;
        for (Iterator localIterator = input.iterator(); localIterator.hasNext(); ret.add(ChatColor.translateAlternateColorCodes('&', line))) {
            line = (String)localIterator.next();
        }
        return ret;
    }

    public static void sendMessage(String message, CommandSender sender)
    {
        sender.sendMessage(color(message));
    }

    public static void SendMainframeMessage(String message, CommandSender player)
    {
        message = message.replaceAll("&", "�");
        player.sendMessage(message);
    }
}