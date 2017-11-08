package me.piggypiglet.gary;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.utils.SimpleLog;

import javax.security.auth.login.LoginException;

public class Gary {
    public static void main(String[] args) throws LoginException, RateLimitedException, InterruptedException {
        JDA jda = new JDABuilder(AccountType.BOT)
                .setToken("lol u wish")
                .setGame(Game.of("https://garys.life"))
                .buildBlocking();
        SimpleLog.getLog("Gary").info("test");
    }
}
