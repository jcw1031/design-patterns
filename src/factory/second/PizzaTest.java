package factory.second;

import factory.second.pizza.Pizza;
import factory.second.pizzastore.ChicagoPizzaStore;
import factory.second.pizzastore.NYPizzaStore;
import factory.second.pizzastore.PizzaStore;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("pizza = " + pizza);

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("pizza = " + pizza);
    }
}
