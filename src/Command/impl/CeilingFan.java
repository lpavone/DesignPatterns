package Command.impl;

/**
 * Created by leonardo on 01/04/17.
 */
public class CeilingFan extends Device{

    private String speed;

    public CeilingFan(String location) {
        super(location);
    }

    void high(){
        speed = "high";
        getSpeed();
    }

    void medium(){
        speed = "medium";
        getSpeed();
    }

    void low(){
        speed = "low";
        getSpeed();
    }

    void on(){
        speed = "stopped";
        getSpeed();
    }

    void off(){
        speed = "stopped";
        getSpeed();
    }

    private void getSpeed() {
        System.out.println(getLocation() + " is on " + speed + " speed");
    }
}
