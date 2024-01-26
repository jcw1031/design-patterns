package factory.first;

import factory.first.pizza.Pizza;
import factory.first.pizzastore.PizzaStore;
import factory.first.pizzastore.SimplePizzaFactory;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}
