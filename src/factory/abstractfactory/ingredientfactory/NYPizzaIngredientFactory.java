package factory.abstractfactory.ingredientfactory;

import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.cheese.ReggianoCheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.clams.FreshClams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.dough.ThinCrustDough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import factory.abstractfactory.ingredient.sauce.MarinaraSauce;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.veggies.Garlic;
import factory.abstractfactory.ingredient.veggies.Mushroom;
import factory.abstractfactory.ingredient.veggies.Onion;
import factory.abstractfactory.ingredient.veggies.RedPepper;
import factory.abstractfactory.ingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
