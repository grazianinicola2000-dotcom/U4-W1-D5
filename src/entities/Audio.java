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
    public StringBuilder getVolume() {
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

    public void setVolume(int volume) {
        if (volume == 1) {
            this.volume++;
        } else if (volume == 0) {
            this.volume--;
        }
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        int duration = getDuration();
        if (duration != 0) {
            for (int i = 0; i < duration; i++) {
                System.out.println(getTitle() + " Volume: " + getVolume());
            }
        }
    }

    @Override
    public void volumeUp() {
        setVolume(1);
    }

    @Override
    public void volumeDown() {
        setVolume(0);
    }
}
