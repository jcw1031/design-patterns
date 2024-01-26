package factory.abstractfactory.pizzastore;


import factory.abstractfactory.ingredientfactory.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;
import factory.abstractfactory.pizza.CheesePizza;
import factory.abstractfactory.pizza.PepperoniPizza;
import factory.abstractfactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza(ingredientFactory);
        }
        return null;
    }
}
