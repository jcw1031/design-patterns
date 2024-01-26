package factory.first.pizza;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("CheesePizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza.cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza.box");
    }
}
