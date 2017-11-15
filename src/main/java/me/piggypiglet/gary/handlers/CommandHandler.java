package me.piggypiglet.gary.handlers;

import me.piggypiglet.gary.Command;
import me.piggypiglet.gary.commands.Help;
import me.piggypiglet.gary.commands.Info;
import me.piggypiglet.gary.commands.NSFW;
import me.piggypiglet.gary.commands.Request;
import me.piggypiglet.gary.commands.voice.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CommandHandler extends ListenerAdapter {
    private Command[] commands;
    public CommandHandler() {
        commands = new Command[] {
                new Help(),
                new One(),
                new Two(),
                new Three(),
                new Four(),
                new Five(),
                new NSFW(),
                new Info(),
                new Request()
        };
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        for (Command command : commands) {
            String[] args = e.getMessage().getContent().replace(command.cmd, "").trim().split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            if (e.getMessage().getContent().startsWith(command.cmd)) {
                command.run(e, args);
            }
        }
    }
}
