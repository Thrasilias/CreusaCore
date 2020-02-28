package com.creusanetwork.core.language;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class LanguageChangeEvent {

    private Player player;
    private Language newLanguage;
    private Language oldLanguage;
    private boolean cancelled;

    private static final HandlerList handlerList = new HandlerList();

    public LanguageChangeEvent(Player player, Language oldLanguage, Language newLanguage) {
        this.player = player;
        this.newLanguage = newLanguage;
        this.oldLanguage = oldLanguage;
        this.cancelled = false;
    }

    public Player getPlayer() {
        return player;
    }

    public Language getNewLanguage() {
        return newLanguage;
    }

    public Language getOldLanguage() {
        return oldLanguage;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
