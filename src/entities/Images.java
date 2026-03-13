package entities;

public class Images extends MultimediaElement {
    private int brightness;

    //    BUILDER
    public Images(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    //    GETTER AND SETTER
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
