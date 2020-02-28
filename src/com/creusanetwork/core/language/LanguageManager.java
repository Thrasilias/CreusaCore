package com.creusanetwork.core.language;

import org.bukkit.ChatColor;

import java.util.HashMap;

public class LanguageManager {

    private HashMap<String, String> englishMap;
    private HashMap<String, String> dutchMap;

    public LanguageManager() {
        englishMap = new HashMap<>();
        dutchMap = new HashMap<>();
    }

    public void loadData() {
        loadDifferentServer("core");
    }

    public void loadDifferentServer(String server) {
        //TODO load data from database
    }

    public String getMessage(String messageCode, Language language) {
        switch(language) {
            case DUTCH:
                if(!dutchMap.containsKey(messageCode)) {
                    return ChatColor.translateAlternateColorCodes('&', "&cFout bij het ophalen van de message, " + messageCode + " is een onbekende code! Vraag staff voor hulp!'");
                }
                return ChatColor.translateAlternateColorCodes('&', dutchMap.get(messageCode));
            default:
                if(!englishMap.containsKey(messageCode)) {
                    return ChatColor.translateAlternateColorCodes('&', "&cError while retrieving message, " + messageCode + " is an unknown code! Ask staff for help!'");
                }
                return ChatColor.translateAlternateColorCodes('&', englishMap.get(messageCode));
        }
    }












}
