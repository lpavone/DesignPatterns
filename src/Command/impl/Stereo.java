package Command.impl;

/**
 * Created by leonardo on 01/04/17.
 */
public class Stereo extends Device{

    public Stereo(String location) {
        super(location);
    }

    void on(){
        System.out.println(getLocation() + " stereo is on");
    }

    void setCD(){
        System.out.println(getLocation() + " has a CD");
    }

    void off(){
        System.out.println(getLocation() + " stereo is off");
    }

    void rejectCD(){
        System.out.println(getLocation() + " stereo rejected CD");
    }

    void setVolume(int level){
        System.out.println(getLocation() + " stereo volume is " + level);
    }
}
