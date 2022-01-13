package hu.adam.minecraft.first;

import org.bukkit.plugin.java.JavaPlugin;

public final class First extends JavaPlugin {

    @Override
    public void onEnable() {
        RainEventListener rainEventListener = new RainEventListener();
        getServer().getPluginManager().registerEvents(rainEventListener,this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



}
