package Command.impl;

import Command.ICommand;

/**
 * Concrete command to control light object.
 * Created by leonardo on 01/04/17.
 */
public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
