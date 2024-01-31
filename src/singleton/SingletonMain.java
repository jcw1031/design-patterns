package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        new Thread(SingletonMain::printInstance).start();

        new Thread(SingletonMain::printInstance).start();
    }

    private static void printInstance() {
        System.out.println("instance = " + Singleton3.getInstance());
    }
}
