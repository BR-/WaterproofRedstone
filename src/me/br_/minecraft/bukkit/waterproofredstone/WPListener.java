package me.br_.minecraft.bukkit.waterproofredstone;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockListener;

public class WPListener extends BlockListener {
	private Set<Material> blocks;

	public WPListener() {
		blocks = new HashSet<Material>();
		blocks.add(Material.REDSTONE_WIRE);
		blocks.add(Material.REDSTONE_TORCH_ON);
		blocks.add(Material.REDSTONE_TORCH_OFF);
		blocks.add(Material.DIODE_BLOCK_OFF);
		blocks.add(Material.DIODE_BLOCK_ON);
		blocks.add(Material.LEVER);
		blocks.add(Material.STONE_BUTTON);
		blocks.add(Material.RAILS);
	}

	public void onBlockFromTo(BlockFromToEvent event) {
		if (blocks.contains(event.getToBlock().getType())) {
			event.setCancelled(true);
		}
	}
}
