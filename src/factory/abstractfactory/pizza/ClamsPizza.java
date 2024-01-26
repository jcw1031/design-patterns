package factory.abstractfactory.pizza;

import factory.abstractfactory.ingredientfactory.PizzaIngredientFactory;

public class ClamsPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza.prepare");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
