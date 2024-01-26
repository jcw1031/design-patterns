package factory.abstractfactory.pizzastore;


import factory.abstractfactory.ingredientfactory.NYPizzaIngredientFactory;
import factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import factory.abstractfactory.pizza.CheesePizza;
import factory.abstractfactory.pizza.PepperoniPizza;
import factory.abstractfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza(ingredientFactory);
        }
        return null;
    }
}
