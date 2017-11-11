package me.piggypiglet.gary.commands.voice;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Four extends Command {
    private Util util;

    public Four() {
        this.cmd = "4";
        util = new Util();
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        if (e.getTextChannel().getName().equalsIgnoreCase("garys-voice")) {
            e.getGuild().getTextChannelById("339773683469910016").sendMessage(util.fromArray(args)).queue();
        }
    }
}
