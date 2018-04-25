package classes;

public class Advertising {
    private String title;
    private String category;
    private String description;
    private int thumbnail, imageCircle;

    public Advertising(){
    }

    public Advertising(String title, String category, String description, int thumbnail, int imageCircle) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
        this.imageCircle = imageCircle;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public int getImageCircle() {
        return imageCircle;
    }

    public void setImageCircle(int imageCircle) {
        this.imageCircle = imageCircle;
    }
}
