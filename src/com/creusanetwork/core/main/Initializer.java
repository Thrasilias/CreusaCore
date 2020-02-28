package com.creusanetwork.core.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class Initializer {

    private Core core;

    public Initializer(Core core) {
        this.core = core;
    }

    public void registerAll() {
        registerCommands();
        registerListeners();
    }

    public void registerCommands() {
    }

    public void registerListeners() {

    }

    public void registerCommand(String command, CommandExecutor commandExecutor) {
        core.getCommand(command).setExecutor(commandExecutor);
    }

    public void registerListener(Listener listener) {
        core.getServer().getPluginManager().registerEvents(listener, core);
    }


}
