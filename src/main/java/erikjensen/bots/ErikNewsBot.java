package erikjensen.bots;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class ErikNewsBot extends TelegramLongPollingBot{
    
    private String botToken = "465327433:AAGwT7H22K0Yg96aAoJB5me6tI5B84sjYfU";
    private String botUsername = "EriksNewsBot";

    public String getBotToken() {
        return botToken;
    }

    public String getBotUsername() {
        return botUsername;
    }

    public void onUpdateReceived(Update update) {
        
    }

}
