package Command;

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
 * MacroCommand named "PartyMode". It should turn lights on, play music and open the door
 * of the house.
 * Created by leonardo on 02/04/17.
 */
public class MacroCommandTest {
    Light light = new Light("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Door door = new Door("Entrance Door");
    MultipleRemoteControl multipleRemoteControl = new MultipleRemoteControl();

    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
    DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
    DoorCloseCommand doorClosedCommand = new DoorCloseCommand(door);

    ICommand[] partyOn = {lightOnCommand, stereoOnWithCdCommand, doorOpenCommand};
    ICommand[] partyOff = {lightOffCommand, stereoOffCommand, doorClosedCommand};

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    @Test
    public void testMacro(){
        multipleRemoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(multipleRemoteControl);
        System.out.println("====== Pressing Macro ON ======");
        multipleRemoteControl.onButtonWasPressed(0);
        System.out.println("====== Pressing Macro OFF ======");
        multipleRemoteControl.offButtonWasPressed(0);
    }

}
