package Command.impl;

import Command.ICommand;

/**
 * Command to implement Undo action based on state.
 *
 * Created by leonardo on 01/04/17.
 */
public class CeilingFanHighCommand implements ICommand {

    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == Speed.LOW){
            ceilingFan.low();
        } else if(prevSpeed == Speed.MEDIUM){
            ceilingFan.medium();
        } else if(prevSpeed == Speed.OFF){
            ceilingFan.off();
        }
    }
}
