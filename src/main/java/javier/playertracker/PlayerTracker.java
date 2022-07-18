package javier.playertracker;

import org.bukkit.plugin.java.JavaPlugin;
import javier.playertracker.Commands.FindPlayer;
import java.util.Objects;

public final class PlayerTracker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("FindPlayer")).setExecutor(new FindPlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
