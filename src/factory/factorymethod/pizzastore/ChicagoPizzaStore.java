package factory.factorymethod.pizzastore;


import factory.factorymethod.pizza.ChicagoCheesePizza;
import factory.factorymethod.pizza.ChicagoPepperoniPizza;
import factory.factorymethod.pizza.Pizza;

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
