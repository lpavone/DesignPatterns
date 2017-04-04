package Command;

import Command.impl.CeilingFan;
import Command.impl.CeilingFanOffCommand;
import Command.impl.CeilingFanOnCommand;
import Command.impl.Door;
import Command.impl.DoorCloseCommand;
import Command.impl.DoorOpenCommand;
import Command.impl.Light;
import Command.impl.LightOffCommand;
import Command.impl.LightOnCommand;
import Command.impl.Stereo;
import Command.impl.StereoOffCommand;
import Command.impl.StereoOnWithCdCommand;
import org.junit.Test;

/**
 * Created by leonardo on 01/04/17.
 */
public class MultipleRemoteControlUndoTest {

    @Test
    public void test(){
        MultipleRemoteControl multipleRemoteControl = new MultipleRemoteControl();

        Light livingRoomLight = new Light("Living Room");

        //create light commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        multipleRemoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        multipleRemoteControl.onButtonWasPressed(0);
        multipleRemoteControl.offButtonWasPressed(0);
        System.out.println(multipleRemoteControl);
        multipleRemoteControl.undoButtonWasPressed();
        multipleRemoteControl.offButtonWasPressed(0);
        multipleRemoteControl.onButtonWasPressed(0);
        System.out.println(multipleRemoteControl);
        multipleRemoteControl.undoButtonWasPressed();
    }

}