package command;

import command.command.Command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
    }
}
