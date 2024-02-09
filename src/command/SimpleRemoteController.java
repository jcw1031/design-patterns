package command;

import command.command.Command;

public class SimpleRemoteController {

    private Command slot;

    public SimpleRemoteController() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void pressButton() {
        slot.execute();
    }
}
