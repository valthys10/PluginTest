package fr.SMA.Plugin.Command;

import java.lang.reflect.AccessFlag.Location;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			
			Location spawn = new Location(Bukkit.getWorld("world") , -0.5,100,-0.5);
		
			
			
		}
	return false
	}
}
