package me.wesleyvanneck;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.wesleyvanneck.ProtocolSupportSwordBlocking;


public class Main extends JavaPlugin {
	
     public static final String PREFIX = "[" + ChatColor.DARK_PURPLE + "ChaYasCore" + ChatColor.RESET + "] ";

	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "Starting ChaYasCore!" + ChatColor.RESET);
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "disableing ChaYasCore!" + ChatColor.RESET);
	}
	
 class ProtocolSupportSwordBlocking{
   public void ProtocolSupportSwordBlocking(){
     //do stuff
      }
   }
}
