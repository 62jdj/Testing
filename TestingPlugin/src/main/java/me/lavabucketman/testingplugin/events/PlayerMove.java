package me.lavabucketman.testingplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

    void onPlayerMove(PlayerMoveEvent e) {

        Player p = e.getPlayer();
        if (!p.hasPermission("testingplugin.move")) {

            e.setCancelled(true);
            p.sendMessage(ChatColor.RED + "You didn't have permission to move.");

        }

    }

}
