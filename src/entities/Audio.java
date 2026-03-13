package entities;

public class Audio extends MultimediaElement {
    private int volume;
    private int duration;


    //    BUILDER
    public Audio(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }


    //    GETTER E SETTER
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }
}
