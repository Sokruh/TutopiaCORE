package sogur.tutopia;

import org.bukkit.plugin.java.JavaPlugin;
import sogur.tutopia.listeners.CraftListener;
import sogur.tutopia.listeners.CraftingTableOpenListener;
import sogur.tutopia.listeners.onPlayerJoinListener;

public final class Tutopia extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new CraftingTableOpenListener(), this);
        getServer().getPluginManager().registerEvents(new CraftListener(), this);
        getServer().getPluginManager().registerEvents(new onPlayerJoinListener(), this);

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
