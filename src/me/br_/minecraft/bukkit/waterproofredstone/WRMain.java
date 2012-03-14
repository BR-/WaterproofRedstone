package me.br_.minecraft.bukkit.waterproofredstone;

import org.bukkit.plugin.java.JavaPlugin;

public class WRMain extends JavaPlugin {
        @Override	
        public void onDisable() {
            System.out.println("[WaterproofRedstone] Disabled.");
	}

        @Override
	public void onEnable() {
            this.getServer().getPluginManager().registerEvents(new WPListener(), this);
            System.out.println("[WaterproofRedstone] Enabled.");
	}
}
