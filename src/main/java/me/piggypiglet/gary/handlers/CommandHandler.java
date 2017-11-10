package me.piggypiglet.gary.handlers;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.commands.Help;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandHandler extends ListenerAdapter {
    private Command[] commands;
    public CommandHandler() {
        commands = new Command[] {
                new Help()
        };
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        for (Command command : commands) {
            String[] args = e.getMessage().getContent().replace(command.cmd, "").trim().split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            if (e.getMessage().getContent().equalsIgnoreCase(command.cmd)) {
                command.run(e, args);
            }
        }
    }
}
