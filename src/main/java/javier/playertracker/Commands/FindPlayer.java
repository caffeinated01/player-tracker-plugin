package javier.playertracker.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.World;

public class FindPlayer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You can only use this command as an player!");
            return true;
        }
        Player p = (Player) sender;
        String targetPlayer;
        if (args.length > 1) {
            targetPlayer = args[1];
        } else {
            targetPlayer = p.getDisplayName();
        }
        Player targetWorld = Bukkit.getServer().getPlayer(targetPlayer);
        assert targetWorld != null;
        World w = targetWorld.getWorld();
        switch (args[0]) {
            case "coordinates":
                p.sendMessage(ChatColor.RED+ targetPlayer +"'s coordinates are");
                return true;
            case "world":
                p.sendMessage(ChatColor.RED + targetPlayer +" is in the "+ w);
            default:
                sender.sendMessage("Unknown section specified!");
                return false;
        }

    }
}
