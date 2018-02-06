package com.jaime.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class event extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		System.out.println("PLUGIN IS ENABLE");
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent e ) {
		
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onThrow (PlayerEggThrowEvent e) {
		
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.DARK_RED + "Egg thrown!");
	}
	
}
	
	
