package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.stream.Stream;

public class Help extends Command {
    public Help() {
        this.cmd = "?help";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        Stream.of(
                "**Help**",
                "!text - Talk to Garys AI",
                "?help - This menu",
                "?joinnsfw - Join the NSFW Channel",
                "?leavensfw - Leave the NSFW Channel",
                "?request - Start a request"
        ).forEach(msg -> e.getTextChannel().sendMessage(msg).queue());
    }
}
