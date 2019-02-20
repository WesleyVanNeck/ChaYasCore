package me.wesleyvanneck;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
		@Override
	public void onEnable() {
		enableMessage();
	}
	
	private void enableMessage() {
		String v = this.getDescription().getVersion();
		Messenger mes = new Messenger(this);
		
		mes.log("&d----------------------------------------------");
		mes.log("&d Enabling ChaYasCore version 0.1 alpha"
		mes.log("&d----------------------------------------------");
	}
}