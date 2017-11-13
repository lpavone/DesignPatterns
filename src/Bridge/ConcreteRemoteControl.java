package Bridge;

/**
 * Created by leonardo on 13/11/17.
 */
public class ConcreteRemoteControl implements RemoteControl {

    private int currentChannel;
    private Tv implementor;

    public ConcreteRemoteControl(int currentChannel, Tv implementor) {
        this.currentChannel = currentChannel;
        this.implementor = implementor;
    }

    @Override
    public void on() {
        implementor.on();
    }

    @Override
    public void off() {
        implementor.off();
    }

    @Override
    public void setChannel(int channel) {
        currentChannel = channel;
        implementor.tuneChannel(channel);
    }

    public void nextChannel(){
        setChannel(currentChannel + 1);
    }

    public void previousChannel(){
        setChannel(currentChannel - 1);
    }

}
