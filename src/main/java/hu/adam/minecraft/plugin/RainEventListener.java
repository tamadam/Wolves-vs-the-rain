package hu.adam.minecraft.plugin;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class RainEventListener implements Listener {

    @EventHandler
    public void isRaining(WeatherChangeEvent weatherChangeEvent){
        Collection<Wolf> entites = weatherChangeEvent.getWorld().getEntitiesByClass(Wolf.class);
        if(weatherChangeEvent.toWeatherState()){
            for(Wolf w: entites){
                w.setAngry(true);
            }
        }
        else{
            for(Wolf w: entites){
                w.setAngry(false);
            }
        }
    }

}