package sogur.tutopia.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class CraftingTableOpenListener implements Listener {

    @EventHandler
    public void onCraftingTableOpen(InventoryOpenEvent event) {
        if(event.getInventory().equals(InventoryType.CRAFTING)) {
            Player player = (Player) event.getPlayer();
            if (!player.hasPermission("Tutopia.use.CraftingTable")) {
                event.setCancelled(true);
            }
        }

    }
}
