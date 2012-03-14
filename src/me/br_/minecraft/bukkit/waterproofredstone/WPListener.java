package me.br_.minecraft.bukkit.waterproofredstone;

import java.util.EnumSet;

import org.bukkit.Material;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class WPListener implements Listener {
	private EnumSet<Material> blocks;

	public WPListener() {                
		blocks = EnumSet.of(
                        Material.REDSTONE_WIRE,
                        Material.REDSTONE_TORCH_ON,
                        Material.REDSTONE_TORCH_OFF,
                        Material.DIODE_BLOCK_OFF,
                        Material.DIODE_BLOCK_ON,
                        Material.LEVER,
                        Material.STONE_BUTTON,
                        Material.RAILS
                );		
	}

        @EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockFromTo(BlockFromToEvent event) {
		if (blocks.contains(event.getToBlock().getType())) {
			event.setCancelled(true);
		}
	}
}
