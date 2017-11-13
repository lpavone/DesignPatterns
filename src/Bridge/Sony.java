package Bridge;

/**
 * Created by leonardo on 13/11/17.
 */
public class Sony implements Tv {
    @Override
    public void on() {
        System.out.println("Sony Tv turned on");
    }

    @Override
    public void off() {
        System.out.println("Sony Tv turned off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Sony Tv tune channel " + channel);
    }
}
