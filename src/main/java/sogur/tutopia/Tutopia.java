package sogur.tutopia;

import org.bukkit.plugin.java.JavaPlugin;
import sogur.tutopia.listeners.CraftListener;
import sogur.tutopia.listeners.CraftingTableOpenListener;

public final class Tutopia extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new CraftingTableOpenListener(), this);
        getServer().getPluginManager().registerEvents(new CraftListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
