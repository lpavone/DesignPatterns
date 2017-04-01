package Command.impl;

/**
 * Created by leonardo on 01/04/17.
 */
public class Door extends Device {

    public Door(String location) {
        super(location);
    }

    void open(){
        System.out.println(getLocation() + " is open");
    }

    void close(){
        System.out.println(getLocation() + " is closed");
    }
}
