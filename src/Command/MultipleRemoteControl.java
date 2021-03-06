package Command;

import Command.impl.NoCommand;

/**
 * INVOKER: Remote control holding 7 command's slots and undo action.
 * Created by leonardo on 01/04/17.
 */
public class MultipleRemoteControl {

    ICommand[] onCommands;
    ICommand[] offCommands;
    ICommand undoCommand;

    public MultipleRemoteControl(){
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        ICommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n====== Remote Control ======\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append(String.format("slot [%d] %s %s \n", i, onCommands[i].getClass().getName(),
                    offCommands[i].getClass().getName()));
        }
        sb.append(String.format("[undo] %s \n", undoCommand.getClass().getName()));
        return sb.toString();
    }

}
