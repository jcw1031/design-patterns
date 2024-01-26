package factory.second.pizzastore;


import factory.second.pizza.ChicagoCheesePizza;
import factory.second.pizza.ChicagoPepperoniPizza;
import factory.second.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        }
        return null;
    }
}
