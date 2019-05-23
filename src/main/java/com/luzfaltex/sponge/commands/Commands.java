package com.luzfaltex.sponge.commands;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "commands",
        name = "Commands",
        description = "An async command library for Sponge",
        url = "https://github.com/ravenrockrp/Commands",
        authors = {
                "Foxtrek64"
        }
)
public class Commands {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
