package Facade;

/**
 * Created by leonardo on 11/04/17.
 */
public class Amplifier {

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setDVD() {
        System.out.println("Amplifier setting DVD player");
    }

    public void surroundSound() {
        System.out.println("Surround sound activated");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}
