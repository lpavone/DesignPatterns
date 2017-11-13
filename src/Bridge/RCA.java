package Bridge;

/**
 * Created by leonardo on 13/11/17.
 */
public class RCA implements Tv {
    @Override
    public void on() {
        System.out.println("RCA Tv turned on");
    }

    @Override
    public void off() {
        System.out.println("RCA Tv turned off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("RCS Tv tune channel " + channel);
    }
}
