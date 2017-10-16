package erikjensen.beans;

public class NewsSource {
    
    private String name;
    private String description;
    private String baseurl;
    private String rss;
    private boolean active;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getBaseurl() {
        return baseurl;
    }
    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }
    public String getRss() {
        return rss;
    }
    public void setRss(String rss) {
        this.rss = rss;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public NewsSource(String name, String description, String baseurl, String rss, boolean active) {
        super();
        this.name = name;
        this.description = description;
        this.baseurl = baseurl;
        this.rss = rss;
        this.active = active;
    }
}
