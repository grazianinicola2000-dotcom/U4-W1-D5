import entities.Audio;
import entities.Images;
import entities.MultimediaElement;
import entities.Video;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Audio a1 = new Audio("Audio1", 4, 2);
//        Video v1 = new Video("Video1", 2, 6, 3);
//        Images i1 = new Images("Image1", 3);
//        a1.play();
//        a1.volumeUp();
//        a1.volumeUp();
//        a1.volumeUp();
//        a1.play();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.volumeDown();
//        a1.play();
//        v1.play();
//        v1.volumeUp();
//        v1.volumeUp();
//        v1.brigthDown();
//        v1.brigthDown();
//        v1.brigthDown();
//        v1.brigthDown();
//        v1.brigthDown();
//        v1.brigthDown();
//        v1.play();
//        i1.show();
//        i1.brightUP();
//        i1.show();
//        i1.brigthDown();
//        i1.brigthDown();
//        i1.brigthDown();
//        i1.brigthDown();
//        i1.show();

        MultimediaElement[] media = new MultimediaElement[5];
        System.out.println("---------------CREATE 5 MEDIA ELEMENTS TO SAVE---------------");
        for (int i = 0; i < media.length; i++) {
            String mediaFormat = "";

            System.out.println("Select a media format (video, audio, or image):");
            while (true) {
                String format = scanner.nextLine().toLowerCase();
                if (!Objects.equals(format, "video") && !Objects.equals(format, "audio") && !Objects.equals(format, "image")) {
                    System.out.println("-----Invalid element format-----");
                } else {
                    mediaFormat = format;
                    break;
                }
            }

            if (mediaFormat.equals("video")) {
                System.out.println("Insert title");
                String title = scanner.nextLine();
                int videoVolume = 0;
                int videoBright = 0;
                int videoDuration = 0;
                System.out.println("Insert volume (must be a value between 0 and 10)");
                while (true) {
                    int volume = Integer.parseInt(scanner.nextLine());
                    if (0 <= volume && volume <= 10) {
                        videoVolume = volume;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                System.out.println("Insert brightness (must be a value between 0 and 10)");
                while (true) {
                    int bright = Integer.parseInt(scanner.nextLine());
                    if (0 <= bright && bright <= 10) {
                        videoBright = bright;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                System.out.println("Insert duration (must be a value between 1 and 5)");
                while (true) {
                    int duration = Integer.parseInt(scanner.nextLine());
                    if (1 <= duration && duration <= 5) {
                        videoDuration = duration;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                media[i] = new Video(title, videoVolume, videoBright, videoDuration);


            } else if (mediaFormat.equals("audio")) {
                System.out.println("Insert title");
                String title = scanner.nextLine();
                int audioVolume = 0;
                int audioDuration = 0;
                System.out.println("Insert volume (must be a value between 0 and 10)");
                while (true) {
                    int volume = Integer.parseInt(scanner.nextLine());
                    if (0 <= volume && volume <= 10) {
                        audioVolume = volume;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                System.out.println("Insert duration (must be a value between 1 and 5)");
                while (true) {
                    int duration = Integer.parseInt(scanner.nextLine());
                    if (1 <= duration && duration <= 5) {
                        audioDuration = duration;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                media[i] = new Audio(title, audioVolume, audioDuration);


            } else if (mediaFormat.equals("image")) {
                System.out.println("Insert title");
                String title = scanner.nextLine();
                int imageBright = 0;
                System.out.println("Insert brightness (must be a value between 0 and 10)");
                while (true) {
                    int bright = Integer.parseInt(scanner.nextLine());
                    if (0 <= bright && bright <= 10) {
                        imageBright = bright;
                        break;
                    } else {
                        System.out.println("-----invalid value-----");
                    }
                }
                media[i] = new Images(title, imageBright);
            }
        }

        System.out.println("WRITE A NUMBER FROM 1 TO 5 TO INTERACT WITH THE RESPECTIVE ELEMENT");
        while (true) {
            System.out.println("type '0' to exit");
            int selected = 0;
            while (true) {
                int element = Integer.parseInt(scanner.nextLine());
                if (0 <= element && element <= 5) {
                    selected = element;
                    break;
                } else {
                    System.out.println("-----invalid value-----");
                }
            }
            if (selected == 0) break;
            if (media[selected - 1] instanceof Images) {
                ((Images) media[selected - 1]).show();
            } else if (media[selected - 1] instanceof Video) {
                ((Video) media[selected - 1]).play();
            } else if (media[selected - 1] instanceof Audio) {
                ((Audio) media[selected - 1]).play();
            }

        }


    }
}
