package command;

import command.command.GarageDoorOpenCommand;
import command.command.LightOnCommand;
import command.receiver.GarageDoor;
import command.receiver.Light;

public class RemoteControllerTest {

    public static void main(String[] args) {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();

        remoteController.setCommand(garageDoorOpenCommand);
        remoteController.pressButton();
    }
}
