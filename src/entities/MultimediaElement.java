package entities;

public abstract class MultimediaElement {
    private String title;

    public MultimediaElement(String title) {
        this.title = title;
    }

//    GETTER

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "MultimediaElement{" +
                "title='" + title + '\'' +
                '}';
    }
}
