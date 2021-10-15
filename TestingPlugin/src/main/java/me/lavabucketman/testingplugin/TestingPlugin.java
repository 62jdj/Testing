package me.lavabucketman.testingplugin;

import me.lavabucketman.testingplugin.commands.FeedCommand;
import me.lavabucketman.testingplugin.commands.GodCommand;
import me.lavabucketman.testingplugin.listeners.JoinLeaveListener;
import me.lavabucketman.testingplugin.listeners.ShearSheepListener;
import me.lavabucketman.testingplugin.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("The plugin has started");

        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
    }
}