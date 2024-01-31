package factory.factorymethod.pizza;

import java.util.List;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        super("시카고 치즈 피자", "얇은 도우", "소스", List.of("시카고 특유 토핑"));
    }
}
