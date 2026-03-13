import entities.Audio;
import entities.Video;

public class Main {
    static void main(String[] args) {

        Audio a1 = new Audio("Audio1", 4, 2);
        Video v1 = new Video("Video1", 2, 6, 3);
        a1.play();
        a1.volumeUp();
        a1.volumeUp();
        a1.volumeUp();
        a1.play();
        a1.volumeDown();
        a1.volumeDown();
        a1.volumeDown();
        a1.volumeDown();
        a1.volumeDown();
        a1.volumeDown();
        a1.volumeDown();
        a1.play();
        v1.play();
        v1.volumeUp();
        v1.volumeUp();
        v1.brigthDown();
        v1.brigthDown();
        v1.brigthDown();
        v1.brigthDown();
        v1.brigthDown();
        v1.brigthDown();
        v1.play();

    }
}
