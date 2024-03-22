package adapter.adapter;

import adapter.duck.Duck;
import adapter.turkey.Turkey;

public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        
    }
}
