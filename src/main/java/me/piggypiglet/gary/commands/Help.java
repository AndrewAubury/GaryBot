package me.piggypiglet.gary.commands;

import net.dv8tion.jda.core.entities.TextChannel;

import java.util.stream.Stream;

public class Help {
    public Help(TextChannel channel) {
        Stream.of(
                "**Help**",
                "!text - Talk to Garys AI",
                "?help - This menu",
                "?joinnsfw - Join the NSFW Channel",
                "?leavensfw - Leave the NSFW Channel",
                "?request - Start a request"
        ).forEach(msg -> channel.sendMessage(msg).queue());
        boolean arg = false;
    }
}
