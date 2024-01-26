package factory.abstractfactory.ingredientfactory;

import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.cheese.MozzarellaCheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.clams.FrozenClams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.dough.ThickCrustDough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import factory.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.veggies.BlackOlives;
import factory.abstractfactory.ingredient.veggies.Eggplant;
import factory.abstractfactory.ingredient.veggies.Spinach;
import factory.abstractfactory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
