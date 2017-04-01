package Command;

import Command.impl.Light;
import Command.impl.LightOnCommand;
import org.junit.Test;

/**
 * Created by leonardo on 01/04/17.
 */
public class SingleRemoteControlTest {

    @Test
    public void test(){
        SingleRemoteControl remoteControl = new SingleRemoteControl();
        Light light = new Light("Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
