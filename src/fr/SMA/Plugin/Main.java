package fr.SMA.Plugin;


import org.bukkit.plugin.java.JavaPlugin;

import fr.SMA.Plugin.command.Spawn;

public class Main extends JavaPlugin  {
	@Override
	public void onEnable() {
		getCommand("spawn").setExecutor(new Spawn());
	}

	@Override
	public void onDisable() {

	}

}
