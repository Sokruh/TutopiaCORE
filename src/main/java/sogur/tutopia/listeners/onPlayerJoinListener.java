package sogur.tutopia.listeners;

import com.destroystokyo.paper.Title;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import sogur.tutopia.Tutopia;

public class onPlayerJoinListener implements Listener {
    private Tutopia plugin;


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        Location loc = player.getLocation();
        player.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("JoinTitle")),
                ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("JoinSubTitle")),
                plugin.getConfig().getInt("JoinTitleFadeIn"),
                plugin.getConfig().getInt("JoinTitleStay"),
                plugin.getConfig().getInt("JoinTitleFadeOut")
                );
        player.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 10);
    }
}
