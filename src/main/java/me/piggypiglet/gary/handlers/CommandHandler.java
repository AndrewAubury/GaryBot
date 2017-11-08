package me.piggypiglet.gary.handlers;

import me.piggypiglet.gary.commands.Help;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandHandler extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if ()
        String[] args = e.getMessage().getContent().split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        if (args.length == 0) {
            new Help(e.getTextChannel());
        }
    }
}
