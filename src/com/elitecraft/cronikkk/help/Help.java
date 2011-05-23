package com.elitecraft.cronikkk.help;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Help for My Server
 * 
 * @author cronikkk
 */

public class Help extends JavaPlugin{
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println( "[" +pdfFile.getName()+"]" + " is disabled!" );
	}
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println( "[" + pdfFile.getName()+ "]" + " version " + pdfFile.getVersion() + " is enabled!" );
		
		PluginManager pm = this.getServer().getPluginManager();
		final HelpPlayerListener playerListener = new HelpPlayerListener();
		pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener, Event.Priority.Normal, this);
	}
	
}