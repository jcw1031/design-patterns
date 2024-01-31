package singleton;

public enum Singleton4 {

    INSTANCE;

    public static Singleton4 getInstance() {
        return INSTANCE;
    }

    public void test() {
        System.out.println("Singleton4.test");
    }
}
