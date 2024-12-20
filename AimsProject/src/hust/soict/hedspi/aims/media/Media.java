package hust.soict.hedspi.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public Media(String title) {
        this.title = title;
    }
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost) {
        this(id, title, cost);
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
