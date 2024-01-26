package factory.factorymethod.pizza;

import java.util.List;

public abstract class Pizza {

    private final String name;
    private final String dough;
    private final String sauce;
    private final List<String> toppings;

    protected Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("name = " + name);
        System.out.println("dough = " + dough);
        System.out.println("sauce = " + sauce);
        System.out.println("toppings = " + toppings);
    }

    public void bake() {
        System.out.println("Pizza.bake");
    }

    public void cut() {
        System.out.println("Pizza.cut");
    }

    public void box() {
        System.out.println("Pizza.box");
    }

    public String getName() {
        return name;
    }
}
