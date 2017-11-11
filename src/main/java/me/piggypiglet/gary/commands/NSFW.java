package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class NSFW extends Command {
    public NSFW() {
        this.cmd = "?nsfw";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        e.getTextChannel().sendMessage("The NSFW channel no longer exists, please join https://discord.gg/U4GJdDj for your NSFW needs.").queue();
    }
}
