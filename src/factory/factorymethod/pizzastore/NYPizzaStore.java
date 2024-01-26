package factory.factorymethod.pizzastore;


import factory.factorymethod.pizza.NYCheesePizza;
import factory.factorymethod.pizza.NYPepperoniPizza;
import factory.factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new NYPepperoniPizza();
        }
        return null;
    }
}
