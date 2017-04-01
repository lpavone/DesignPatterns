package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class DoorOpenCommand implements ICommand {

    Door door;

    public DoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
