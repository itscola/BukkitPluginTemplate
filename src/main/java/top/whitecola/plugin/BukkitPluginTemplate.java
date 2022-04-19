package top.whitecola.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.whitecola.commandhandler.HiCommand;
import top.whitecola.confighandler.HiConfig;
import top.whitecola.plugin.commands.CommandVersion;
import top.whitecola.plugin.configs.struct.PluginConfig;
import top.whitecola.plugin.listeners.PlayerListener;

import java.nio.charset.Charset;

public class BukkitPluginTemplate extends JavaPlugin {
    private static BukkitPluginTemplate instacne;
    {
        instacne = this;
    }
    private String pluginName = "plugin";

    private HiCommand commands = new HiCommand(this,"pl");
    private HiConfig<PluginConfig> config1 = new HiConfig<>(this.getDataFolder()+"/Config.json",PluginConfig.class, Charset.forName("utf8"),this);


    @Override
    public void onEnable() {
        init();
        super.onEnable();
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    public void init(){
        registerListener();
        registerCommands();
    }

    public void registerListener(){
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);
    }

    public void registerCommands(){
        commands.addCommand(new CommandVersion());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static BukkitPluginTemplate getInstacne() {
        return instacne;
    }


    public HiCommand getCommands() {
        return commands;
    }


    public HiConfig<PluginConfig> getConfig1() {
        return config1;
    }
}
