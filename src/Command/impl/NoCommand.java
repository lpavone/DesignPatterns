package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class NoCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("No command assigned");
    }

    @Override
    public void undo() {
        System.out.println("No command assigned");
    }
}
