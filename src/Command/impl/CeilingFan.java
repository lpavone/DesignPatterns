package Command.impl;

/**
 * Created by leonardo on 01/04/17.
 */
public class CeilingFan extends Device{

    private Speed speed;

    public CeilingFan(String location) {
        super(location);
        speed = Speed.OFF;
    }

    void high(){
        speed = Speed.HIGH;
        getSpeed();
    }

    void medium(){
        speed = Speed.MEDIUM;
        getSpeed();
    }

    void low(){
        speed = Speed.LOW;
        getSpeed();
    }

    void on(){
        speed = Speed.LOW;
        getSpeed();
    }

    void off(){
        speed = Speed.OFF;
        getSpeed();
    }

    Speed getSpeed() {
        return speed;
    }
}
