package Command;

/**
 * INVOKER: Remote control holding slot for a command.
 * Will execute the command when <code>buttonWasPressed()</code> is invoked.
 *
 * Created by leonardo on 01/04/17.
 */
public class SingleRemoteControl {

    ICommand command;//slot to hold the command, it could also be a list of commands

    public SingleRemoteControl(){}

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
