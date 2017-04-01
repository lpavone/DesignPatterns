package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class CeilingFanOnCommand implements ICommand {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
