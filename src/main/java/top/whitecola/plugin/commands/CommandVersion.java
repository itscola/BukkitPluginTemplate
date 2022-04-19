package top.whitecola.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.whitecola.annotations.ItsACommand;
import top.whitecola.commandhandler.ICommand;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ItsACommand(CommandNmae = "version",premission = "pl.version")
public class CommandVersion implements ICommand {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        String version = Bukkit.getPluginManager().getPlugin("BukkitPluginTemplate").getDescription().getVersion();
        commandSender.sendMessage(version);

        return true;
    }

    public List<String> getArgs() {
        return Arrays.asList("[ver]");
    }

    public List<String> handleArg(CommandSender sender, String handleArg) {
        if (!handleArg.equalsIgnoreCase("[ver]")) {
            return Arrays.asList("test");
        }
        return Bukkit.getOnlinePlayers().stream().map(i->i.getName()).collect(Collectors.toList());

    }

    public String getUsage() {
        return "/pl ver";
    }

    public String getUsageDescripition() {
        return "Get version of the plugin";
    }
}
