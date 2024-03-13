package command;

import command.command.Command;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.receiver.Light;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteController.setCommand(1, kitchenLightOn, kitchenLightOff);

        remoteController.pushOnButton(0);
        remoteController.pushOffButton(0);
        remoteController.pushUndoButton();
        remoteController.pushOnButton(1);
        remoteController.pushOffButton(1);
        remoteController.pushUndoButton();
        remoteController.pushOnButton(2);
        remoteController.pushOffButton(2);

        System.out.println("remoteController = " + remoteController);
    }
}
