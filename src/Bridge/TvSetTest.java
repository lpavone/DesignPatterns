package Bridge;

import org.junit.Test;

/**
 * Created by leonardo on 13/11/17.
 */
public class TvSetTest {

    @Test
    public void test() {
        RemoteControl remoteControl = new ConcreteRemoteControl(4, new Sony());
        remoteControl.on();
        remoteControl.setChannel(6);
        ((ConcreteRemoteControl)remoteControl).nextChannel();
        remoteControl.off();
        remoteControl = new ConcreteRemoteControl(1, new RCA());
        remoteControl.on();
        remoteControl.setChannel(9);
        remoteControl.off();
    }

}
