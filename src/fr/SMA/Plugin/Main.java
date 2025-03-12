package fr.SMA.Plugin;


import org.bukkit.plugin.java.JavaPlugin;

import fr.SMA.Plugin.commands.Spawn;

public class Main extends JavaPlugin  {
	@Override
	public void onEnable() {
		getCommand("spawn").setExecutor(new Spawn());
	}

	@Override
	public void onDisable() {

	}

}
