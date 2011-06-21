package me.br_.minecraft.bukkit.waterproofredstone;

import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class WRMain extends JavaPlugin {
	public void onDisable() {
		System.out.println("[WaterproofRedstone] Disabled.");
	}

	public void onEnable() {
		this.getServer().getPluginManager().registerEvent(Event.Type.BLOCK_FROMTO, new WPListener(), Event.Priority.Highest, this);
		System.out.println("[WaterproofRedstone] Enabled.");
	}
}
