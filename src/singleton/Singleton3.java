package singleton;

public class Singleton3 {

    private volatile static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            sleep();
            synchronized (Singleton3.class) {
                if (instance == null) {

                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    private static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
