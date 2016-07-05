package practice.katienza.niceday;

/**
 * Created by katienza on 7/5/2016.
 */
public class Card {
    private String guide;
    private String title;
    private int src;
    private String details;

    public Card(String guide, String title, int src, String details) {
        this.guide = guide;
        this.title = title;
        this.src = src;
        this.details = details;
    }

    public String getGuide() {
        return guide;
    }

    public String getTitle() {
        return title;
    }

    public int getSrc() {
        return src;
    }

    public String getDetails() {
        return details;
    }
}
