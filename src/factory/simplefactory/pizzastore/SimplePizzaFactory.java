package factory.simplefactory.pizzastore;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.PepperoniPizza;
import factory.simplefactory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }

        if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }

        return null;
    }
}
