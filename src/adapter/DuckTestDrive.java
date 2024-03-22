package adapter;

import adapter.adapter.TurkeyAdapter;
import adapter.duck.Duck;
import adapter.duck.MallardDuck;
import adapter.turkey.Turkey;
import adapter.turkey.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
