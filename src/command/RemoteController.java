package command;

import command.command.Command;
import command.command.NoCommand;

public class RemoteController {

    private static final int SLOT_SIZE = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[SLOT_SIZE];
        this.offCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }


    public void pushOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pushUndoButton() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- 리모컨 -----\n");
        for (int i = 0; i < SLOT_SIZE; i++) {
            stringBuilder.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "\t"
                    + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuilder.toString();
    }
}
