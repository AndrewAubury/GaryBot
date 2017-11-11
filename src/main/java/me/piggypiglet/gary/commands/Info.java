package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;


public class Info extends Command {
    public Info() {
        this.cmd = "?info";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
//        EmbedBuilder msg = new EmbedBuilder();
//        msg.setAuthor("Gary");
//        msg.setColor(Color.GREEN);
//        msg.setTitle("**Server Information**");
//        msg.setDescription(e.getGuild().getMembers().size() + " Members.\nGary version 2.0");
//        e.getTextChannel().sendMessage(msg.build()).queue();
        e.getTextChannel().sendMessage("**Server Information**\n" + e.getGuild().getMembers().size() + " Members.\nGary version 2.0").queue();
    }
}
