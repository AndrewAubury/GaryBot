package me.piggypiglet.gary;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Command {
    public String cmd = "null";

    protected abstract void execute(MessageReceivedEvent e, String[] args);

    public void run(MessageReceivedEvent e, String[] args) {
        execute(e, args);
    }
}
