package com.esdevelopment.mediacommands.commands;

import com.esdevelopment.mediacommands.MediaCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StoreCommand implements CommandExecutor {

    private final MediaCommands plugin;

    public StoreCommand(final MediaCommands plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(plugin.getConfig().getString("messages.console"));
        }
        final Player player = (Player) sender;

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("messages.store")));

        return true;


    }
}
