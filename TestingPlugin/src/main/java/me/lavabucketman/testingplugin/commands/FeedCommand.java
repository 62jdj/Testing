package me.lavabucketman.testingplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;
            if (p.hasPermission("testingplugin.feed")) {

                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "Your hunger set to max.");

            } else {
                p.sendMessage(ChatColor.RED + "You don't have a permission to do this command");
            }

        } else {
            System.out.printf("This command can run only for player");
        }

        return true;
    }

}
