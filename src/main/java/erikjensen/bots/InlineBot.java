package erikjensen.bots;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class InlineBot extends TelegramLongPollingBot{
    
    private String botToken = "";
    private String botUsername = "";

    public void onUpdateReceived(Update update) {
        // TODO Auto-generated method stub
        // https://monsterdeveloper.gitbooks.io/writing-telegram-bots-on-java/content/lesson-6.-inline-keyboards-and-editing-message%27s-text.html
        
    }

    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

}
