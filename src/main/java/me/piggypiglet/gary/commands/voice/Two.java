package me.piggypiglet.gary.commands.voice;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.Util;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Two extends Command {
    private Util util;

    public Two() {
        this.cmd = "2";
        util = new Util();
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        if (e.getTextChannel().getName().equalsIgnoreCase("garys-voice")) {
            e.getGuild().getTextChannelById("165129131770511360").sendMessage(util.fromArray(args)).queue();
        }
    }
}
