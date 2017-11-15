package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Help extends Command {
    public Help() {
        this.cmd = "?help";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        e.getChannel().sendMessage("**Help**\n?help - This menu\n?joinnsfw - Join the NSFW channel\n?leavensfw - Leave the NSFW channel\n?request - Start a request").queue();
    }
}
