package com.elitecraft.cronikkk.help;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class HelpPlayerListener extends PlayerListener {
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(player.isOp()){
			player.sendMessage("Welcome " + event.getPlayer().getDisplayName() + " (OP) to the server!");
		}
		else
		{
			player.sendMessage("Welcome to the server " + event.getPlayer().getDisplayName() + "!");
		}
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
		String commandName = command.getName().toLowerCase();
		if(commandName.equals("help"))
		{
			if(arguments.length == 0) {
				sender.sendMessage(ChatColor.RED + "-------- [HELP] Commands --------");
				sender.sendMessage(ChatColor.GREEN + "/help plugins - " + ChatColor.GOLD + "About Our Plugins");
				sender.sendMessage(ChatColor.GREEN + "/help admins - " + ChatColor.GOLD + "Our Main Administrators");
				sender.sendMessage(ChatColor.GREEN + "/help website - " + ChatColor.GOLD + "Website Information");
				sender.sendMessage(ChatColor.GREEN + "/help voice - " + ChatColor.GOLD + "Voice Server Information");
				sender.sendMessage(ChatColor.GREEN + "/help aboutus - " + ChatColor.GOLD + "About Us");
				sender.sendMessage(ChatColor.GREEN + "/help - " + ChatColor.GOLD + "This Screen");
			}else if(arguments.length == 1 && arguments[0].equalsIgnoreCase("plugins")) {
				sender.sendMessage(ChatColor.RED + "------- Our Main Plugins --------");
				sender.sendMessage(ChatColor.GREEN + "iConomy - " + ChatColor.GOLD + "Server Wide Currency Plugin");
				sender.sendMessage(ChatColor.GREEN + "Lockette - " + ChatColor.GOLD + "Lock Doors and Storage Boxes With A Sign");
				sender.sendMessage(ChatColor.GREEN + "Permissions - " + ChatColor.GOLD + "Ranking System");
				sender.sendMessage(ChatColor.GREEN + "Stargate - " + ChatColor.GOLD + "Teleporter Gates");
			}else if(arguments.length == 1 && arguments[0].equalsIgnoreCase("admins")){
				sender.sendMessage(ChatColor.RED + "------- Our Administrators --------");
				sender.sendMessage(ChatColor.GREEN + "Cronikkk");
				sender.sendMessage(ChatColor.GREEN + "Nolaz");
			}else if(arguments.length == 1 && arguments[0].equalsIgnoreCase("website")){
				sender.sendMessage(ChatColor.RED + "-------- Our Website --------");
				sender.sendMessage(ChatColor.GREEN + "URL: " + ChatColor.AQUA + "http://elitecraft.net");
			}else if(arguments.length == 1 && arguments[0].equalsIgnoreCase("voice")){
				sender.sendMessage(ChatColor.RED + "-------- Voice Server --------");
				sender.sendMessage(ChatColor.GREEN + "Type: " + ChatColor.AQUA + "Ventrilo");
				sender.sendMessage(ChatColor.GREEN + "IP: " + ChatColor.AQUA + "vent30.gameservers.com");
				sender.sendMessage(ChatColor.GREEN + "Port: " + ChatColor.AQUA + "4444");
			}else if(arguments.length == 1 && arguments[0].equalsIgnoreCase("aboutus")){
				sender.sendMessage(ChatColor.RED + "-------- About Us --------");
				sender.sendMessage(ChatColor.GREEN + "The object is to build up your EliteCraft wallet to have the most money in the server");
				sender.sendMessage(ChatColor.GREEN + "To do that, you need to get rare items and sell them");
				sender.sendMessage(ChatColor.GREEN + "This works like the real world. Supply and demand");
			}
		} 		
		return true;
		
	}
}
