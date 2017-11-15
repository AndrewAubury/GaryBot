package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.stream.Stream;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class Request extends Command {
    public Request() {
        this.cmd = "?request";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        if (e.getChannelType().equals(ChannelType.PRIVATE)) {
            request(e, args);
        } else {
            e.getChannel().sendMessage("I've started your request, PM me the information you want in your request.").queue();
            request(e, args);
        }
    }

    private void request(MessageReceivedEvent e, String[] args) {
        Stream.of(
                "Welcome to the request system, during this process, you will give me information needed in your request such as whether it's paid or unpaid, service required, a description, and an optional budget.",
                "Before we can start, you must agree to the rules:"
        ).forEach(msg -> e.getChannel().sendMessage(msg).queue());
        e.getChannel().sendMessage("```" + )
    }
}
