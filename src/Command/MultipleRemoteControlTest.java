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
public class MultipleRemoteControlTest {

    @Test
    public void test(){
        MultipleRemoteControl multipleRemoteControl = new MultipleRemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        Door garageDoor = new Door("Garage");
        Stereo stereo = new Stereo("Living Room");

        //create light commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //create ceiling fan commands
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        //create door commands
        DoorOpenCommand doorOpen = new DoorOpenCommand(garageDoor);
        DoorCloseCommand doorClose = new DoorCloseCommand(garageDoor);

        //create stereo commands
        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        multipleRemoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        multipleRemoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        multipleRemoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        multipleRemoteControl.setCommand(3, doorOpen, doorClose);
        multipleRemoteControl.setCommand(4, stereoOnWithCd, stereoOff);

        /**
         * Note: if ICommand interface had only a single method we could have used
         * a lambda expression to simplify, like this:
         *
         * multipleRemoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
         *
         * and avoid creating multiple Command objects for every device.
         */

        System.out.println(multipleRemoteControl);

        //now press on/off every slot
        multipleRemoteControl.onButtonWasPressed(0);
        multipleRemoteControl.offButtonWasPressed(0);
        multipleRemoteControl.onButtonWasPressed(1);
        multipleRemoteControl.offButtonWasPressed(1);
        multipleRemoteControl.onButtonWasPressed(2);
        multipleRemoteControl.offButtonWasPressed(2);
        multipleRemoteControl.onButtonWasPressed(3);
        multipleRemoteControl.offButtonWasPressed(3);
        multipleRemoteControl.onButtonWasPressed(4);
        multipleRemoteControl.offButtonWasPressed(4);
    }

}