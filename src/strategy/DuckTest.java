package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.RedheadDuck;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();

        duck = new RedheadDuck();
        duck.display();
        duck.performQuack();
    }
}
