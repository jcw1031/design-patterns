package factory.abstractfactory.pizza;

import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

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

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
