package erikjensen.app;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import erikjensen.bots.EchoBot;
import erikjensen.bots.EmojiBot;
import erikjensen.bots.ErikNewsBot;
import erikjensen.bots.LoggingBot;

public class App {

    public static void main(String[] args) {

        // Initialize Api Context
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        try {
            System.out.println("Bots up and running!");
            botsApi.registerBot(new ErikNewsBot());
            System.out.println("ErikNewsBot - Deployed");
            //botsApi.registerBot(new PhotoBot());
            //System.out.println("PhotoBot - Deployed");
            botsApi.registerBot(new EchoBot());
            System.out.println("EchoBot - Deployed");
            botsApi.registerBot(new LoggingBot());
            System.out.println("LoggingBot - Deployed");
            botsApi.registerBot(new EmojiBot());
            System.out.println("EmojiBot - Deployed");
        } catch (TelegramApiException e) {
            System.out.println("[ERROR] - Error running bot(s), closing applictaion. Issue(s) are as follows: ");
            e.printStackTrace();
            System.exit(0);
        }
    }

}
