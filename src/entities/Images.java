package entities;

import interfaces.Bright;

public class Images extends MultimediaElement implements Bright {
    private int brightness;

    //    BUILDER
    public Images(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    //    GETTER AND SETTER
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
    }

    public void show() {
        System.out.println("You are viewing the image: " + getTitle() + " Brightness: " + getBrightness());
    }

    @Override
    public void brightUP() {
        setBrightness(1);
    }

    @Override
    public void brigthDown() {
        setBrightness(0);
    }
}
