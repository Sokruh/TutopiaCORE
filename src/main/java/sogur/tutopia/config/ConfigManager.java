package sogur.tutopia.config;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import sogur.tutopia.Tutopia;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private static Tutopia plugin;
    public static FileConfiguration invcfg;
    public static File invfile;

    public static void initialize(Tutopia instance) {
        plugin = instance;

    }

    public static void setup() {
        if(!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        invfile = new File(plugin.getDataFolder(), "invs.yml");
        if (!invfile.exists()) {
            try {
                invfile.createNewFile();
                Bukkit.getLogger().info("§ainvs.yml luotu!");
            }catch (IOException e) {
                Bukkit.getServer().getLogger().warning("§cinvs.yml ei voitu luoda!");
            }
        }

        invcfg = YamlConfiguration.loadConfiguration(invfile);
    }

    public static FileConfiguration getPlayers() {
        return invcfg;
    }

    public static void savePlayers() {
        try {
            invcfg.save(invfile);
        }catch (IOException e) {
            Bukkit.getServer().getLogger().warning("§cEi voitu tallentaa invs.yml");
        }
    }

    public static void reloadPlayers() {
        invcfg = YamlConfiguration.loadConfiguration(invfile);
        Bukkit.getServer().getLogger().info("§ainvs.yml reloaded");
    }

    public static void reloadConfigs() {
        Bukkit.getPluginManager().getPlugin("Tutopia").reloadConfig();
    }
}
