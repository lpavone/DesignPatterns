package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class CeilingFanOffCommand implements ICommand {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
        ceilingFan.medium();
    }
}
