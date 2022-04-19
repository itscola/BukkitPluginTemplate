package top.whitecola.plugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerDead(PlayerDeathEvent e){

    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent e){

    }

    @EventHandler
    public void playerMoveListener(PlayerMoveEvent e) {

        if (e.getFrom().getBlockX() == e.getTo().getBlockX() && e.getFrom().getBlockY() == e.getTo().getBlockY() && e.getFrom().getBlockZ() == e.getTo().getBlockZ()) {
            return;
        }

    }
}
