package command;

import command.receiver.Light;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();

        remoteController.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteController.setCommand(1, kitchenLight::on, kitchenLight::off);

        remoteController.pushOnButton(0);
        remoteController.pushOffButton(0);
        remoteController.pushOnButton(1);
        remoteController.pushOffButton(1);
        remoteController.pushOnButton(2);
        remoteController.pushOffButton(2);

        System.out.println("remoteController = " + remoteController);
    }
}
