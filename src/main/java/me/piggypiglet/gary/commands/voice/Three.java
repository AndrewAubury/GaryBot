package me.piggypiglet.gary.commands.voice;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Three extends Command {
    private Util util;

    public Three() {
        this.cmd = "3";
        util = new Util();
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        if (e.getTextChannel().getName().equalsIgnoreCase("garys-voice")) {
            e.getGuild().getTextChannelById("339676414137860097").sendMessage(util.fromArray(args)).queue();
        }
    }
}
