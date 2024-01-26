package factory.second.pizzastore;


import factory.second.pizza.NYCheesePizza;
import factory.second.pizza.NYPepperoniPizza;
import factory.second.pizza.Pizza;

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
