package Facade;

/**
 * Created by leonardo on 11/04/17.
 */
public class DvdPlayer {
    public void on() {
        System.out.println("DVD player on");
    }

    public void play(String movie) {
        System.out.println("DVD player playing " + movie);
    }
}
