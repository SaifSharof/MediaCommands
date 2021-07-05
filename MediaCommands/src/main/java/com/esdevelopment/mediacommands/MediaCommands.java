package com.esdevelopment.mediacommands;

import com.esdevelopment.mediacommands.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MediaCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m----------------------------------"));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "        &cMedia Commands &7by &eSaifSharof     "));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cLoading commands...."));
        loadCommands();
        saveDefaultConfig();
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlugin loaded up successfully"));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cVersion &7: " + getDescription().getVersion()));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&r"));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSupport &7: discord.me/esdevelopment"));
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m----------------------------------"));
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "MediaCommands has shutdown.");
    }

    public void loadCommands() {
        getCommand("discord").setExecutor(new DiscordCommand(this));
        getCommand("website").setExecutor(new WebsiteCommand(this));
        getCommand("store").setExecutor(new StoreCommand(this));
        getCommand("twitter").setExecutor(new TwitterCommand(this));
        getCommand("mediareload").setExecutor(new ReloadCommand(this));
    }

}
