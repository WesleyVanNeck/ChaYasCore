package me.wesleyvanneck;

import org.bukkit.plugin.java.JavaPlugin;
import me.wesleyvanneck.ProtocolSupportSwordBlocking;

public class Main extends JavaPlugin {
	
        private static Plugin plugin;
	private static Server instance;
	public ProtocolSupportSwordBlocking ProtocolSupportSwordBlocking = null;

	
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

	public static ProtocolSupportSwordBlocking ProtocolSupportSwordBlocking() {
		return ProtocolSupportSwordBlocking;
	
	}
		if (Link$.isPluginEnabled("ProtocolSupportSwordBlocking")) {
			ProtocolSupportSwordBlocking = new AProtocolSupportSwordBlocking();
			ProtocolSupportSwordBlocking.register();
		}
	}
}
