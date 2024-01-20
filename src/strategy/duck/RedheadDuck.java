package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.MuteQuack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck.display");
    }
}
