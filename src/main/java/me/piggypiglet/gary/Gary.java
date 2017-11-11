package me.piggypiglet.gary;

import me.piggypiglet.gary.handlers.CommandHandler;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.utils.SimpleLog;

import javax.security.auth.login.LoginException;

public class Gary {
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException {
        new JDABuilder(AccountType.BOT)
                .setToken("diabetes type 3")
                .addEventListener(new CommandHandler())
                .setGame(Game.of("https://garys.life"))
                .buildBlocking();
        SimpleLog.getLog("Gary").info("test");
    }
}
