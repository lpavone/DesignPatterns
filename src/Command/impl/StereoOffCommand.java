package Command.impl;

import Command.ICommand;

/**
 * Created by leonardo on 01/04/17.
 */
public class StereoOffCommand implements ICommand {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
