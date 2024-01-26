package factory.abstractfactory.ingredientfactory;

import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
