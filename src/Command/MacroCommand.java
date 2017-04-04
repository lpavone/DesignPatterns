package Command;

/**
 * MacroCommand define a group of commands to execute together.
 * Created by leonardo on 02/04/17.
 */
public class MacroCommand implements ICommand {
    ICommand[] commands;

    public MacroCommand(ICommand[] commands){
        this.commands = commands;
    }

    public void execute(){
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
