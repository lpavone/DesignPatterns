package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class DoorCloseCommand implements ICommand {

    Door door;

    public DoorCloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}
