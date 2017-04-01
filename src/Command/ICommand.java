package Command;

/**
 * Declare the basic operations for all commands.
 *
 * Created by leonardo on 01/04/17.
 */
public interface ICommand {

    void execute();
    void undo();
}
