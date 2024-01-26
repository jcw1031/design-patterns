package factory.first.pizzastore;

import factory.first.pizza.CheesePizza;
import factory.first.pizza.PepperoniPizza;
import factory.first.pizza.Pizza;

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
