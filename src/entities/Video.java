package entities;

import interfaces.Bright;
import interfaces.Reproducible;

public class Video extends MultimediaElement implements Reproducible, Bright {
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
    private StringBuilder getVolume() {
        StringBuilder volume = new StringBuilder();
        if (this.volume > 0) {
            for (int i = 0; i < this.volume; i++) {
                volume.append("!");
            }
        } else {
            volume.append("-MUTE-");
        }
        return volume;
    }

    private void setVolume(int volume) {
        if (volume == 1) {
            this.volume++;
        } else if (volume == 0) {
            this.volume--;
        }
        if (this.volume < 1) {
            this.volume = 0;
        } else if (this.volume > 10) {
            this.volume = 10;
        }
    }

    private StringBuilder getBrightness() {
        StringBuilder bright = new StringBuilder();
        if (this.brightness > 0) {
            for (int i = 0; i < this.brightness; i++) {
                bright.append("*");
            }
        } else {
            bright.append("!ATTENTION, increase the brightness!");
        }
        return bright;
    }

    private void setBrightness(int brightness) {
        if (brightness == 1) {
            this.brightness++;
        } else if (brightness == 0) {
            this.brightness--;
        }
        if (this.brightness < 1) {
            this.brightness = 0;
        } else if (this.brightness > 10) {
            this.brightness = 10;
        }
    }

    private int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        int duration = getDuration();
        if (duration != 0) {
            for (int i = 0; i < duration; i++) {
                System.out.println("You are playing: " + getTitle() + " Volume: " + getVolume() + " Brightness: " + getBrightness());
            }
        }
    }

    @Override
    public void volumeUp() {
        setVolume(1);
        System.out.println("OK-----Increased volume-----OK");
    }

    @Override
    public void volumeDown() {
        setVolume(0);
        System.out.println("OK-----Decreased volume-----OK");
    }

    @Override
    public void brightUP() {
        setBrightness(1);
        System.out.println("OK-----Increased brightness-----OK");
    }

    @Override
    public void brigthDown() {
        setBrightness(0);
        System.out.println("OK-----Decreased brightness-----OK");
    }
}
