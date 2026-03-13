package entities;

public class Video extends MultimediaElement {
    private int volume;
    private int brightness;
    private int duration;

    //    BUILDER
    public Video(String title, int volume, int brightness, int duration) {
        super(title);
        this.volume = volume;
        this.brightness = brightness;
        this.duration = duration;
    }

    //    GETTER AND SETTER
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getDuration() {
        return duration;
    }
}
