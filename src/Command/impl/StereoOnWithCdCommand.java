package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class StereoOnWithCdCommand implements ICommand {

    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
