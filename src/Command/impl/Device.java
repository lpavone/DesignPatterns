package Command.impl;

/**
 * Created by leonardo on 01/04/17.
 */
public abstract class Device {

    private String location;

    public Device(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
