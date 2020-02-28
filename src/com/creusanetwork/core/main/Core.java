package com.creusanetwork.core.main;

import com.creusanetwork.core.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    private static Utils utils;
    public static Utils getUtils() {
        return utils;
    }

    private static Initializer initializer;
    public static Initializer getInitializer() {
        return initializer;
    }


    @Override
    public void onEnable() {
        utils = new Utils();
        initializer = new Initializer(this);
        initializer.registerAll();
    }

    @Override
    public void onDisable() {

    }
}
