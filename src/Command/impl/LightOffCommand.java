package Command.impl;

import Command.ICommand;

/**
 * Concrete command to control light object.
 * Created by leonardo on 01/04/17.
 */
public class LightOffCommand implements ICommand {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
