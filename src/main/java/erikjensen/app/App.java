package erikjensen.app;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import erikjensen.helpers.EchoBot;
import erikjensen.helpers.ErikNewsBot;
import erikjensen.helpers.PhotoBot;

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
            botsApi.registerBot(new PhotoBot());
            botsApi.registerBot(new EchoBot());
        } catch (TelegramApiException e) {
            System.out.println("[ERROR] - Error running bot(s), closing applictaion. Issue(s) are as follows: ");
            e.printStackTrace();
            System.exit(0);
        }
    }

}
