package factory.simplefactory;

import factory.simplefactory.pizza.Pizza;
import factory.simplefactory.pizzastore.PizzaStore;
import factory.simplefactory.pizzastore.SimplePizzaFactory;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}
