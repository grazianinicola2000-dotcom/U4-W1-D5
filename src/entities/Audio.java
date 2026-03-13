package entities;

import interfaces.Reproducible;

public class Audio extends MultimediaElement implements Reproducible {
    private int volume;
    private int duration;


    //    BUILDER
    public Audio(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }


    //    GETTER E SETTER
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

    private int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        int duration = getDuration();
        if (duration != 0) {
            for (int i = 0; i < duration; i++) {
                System.out.println("You are playing: " + getTitle() + " Volume: " + getVolume());
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
}
