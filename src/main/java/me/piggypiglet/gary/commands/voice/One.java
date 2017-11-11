package me.piggypiglet.gary.commands.voice;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class One extends Command {
    private Util util;

    public One() {
        this.cmd = "1";
        util = new Util();
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        if (e.getTextChannel().getName().equalsIgnoreCase("garys-voice")) {
            e.getGuild().getTextChannelById("164280494874165248").sendMessage(util.fromArray(args)).queue();
        }
    }
}
