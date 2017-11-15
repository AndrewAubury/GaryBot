package me.piggypiglet.gary.commands;

import me.piggypiglet.gary.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;


public class Info extends Command {
    public Info() {
        this.cmd = "?info";
    }

    public void execute(MessageReceivedEvent e, String[] args) {
        EmbedBuilder msg = new EmbedBuilder();
        msg.setColor(Color.GREEN);
        msg.setTitle("**Information**");
        String members = e.getChannelType() == ChannelType.PRIVATE ? "Gary version 2.0" : e.getGuild().getMembers().size() + " Members.\nGary version 2.0";
        msg.setDescription(members);
        e.getChannel().sendMessage(msg.build()).queue();
    }
}
