package erikjensen.beans;

import java.util.List;
import org.telegram.telegrambots.generics.BotOptions;

public class NewsBotOptions implements BotOptions{

    private String baseUrl;
    private List<NewsSource> newsSources;
    
    public String getBaseUrl() {
        return baseUrl;
    }
    
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
    
    public List<NewsSource> getNewsSources(){
        return newsSources;
    }
    
    public void setNewsSources(List<NewsSource> newsSources){
        this.newsSources = newsSources;
    }
    
    public void addNewsSource(NewsSource newsSource){
        
        newsSources.add(newsSource);
    }
    
    public void removeNewsSource(NewsSource newsSource){
        for(NewsSource checkNewsSource : newsSources){
            if(checkNewsSource.equals(newsSource)){
                newsSources.remove(newsSource);
            }
        }
    }
    
    public NewsSource getNewsSource(String name){
        for(NewsSource newsSource : newsSources){
            if(newsSource.getName().equals(name)){
                return newsSource;
            }
        }
            return null;        
    }

    
}
