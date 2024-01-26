package factory.factorymethod;

import factory.factorymethod.pizza.Pizza;
import factory.factorymethod.pizzastore.ChicagoPizzaStore;
import factory.factorymethod.pizzastore.NYPizzaStore;
import factory.factorymethod.pizzastore.PizzaStore;

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
