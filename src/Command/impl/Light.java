package Command.impl;

/**
 * RECEIVER: this class knows how to perform the work needed. In this case set the
 * light on/off.
 *
 * Created by leonardo on 01/04/17.
 */
public class Light extends Device {

    public Light(String location) {
        super(location);
    }

    void on(){
        System.out.println(getLocation() + " light is on");
    }

    void off(){
        System.out.println(getLocation() + " light is off");
    }
}
