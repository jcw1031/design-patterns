package factory.factorymethod.pizza;

import java.util.List;

public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza() {
        super("시카고 페퍼로니 피자", "아주 두꺼운 크러스트 도우", "맛난 소스", List.of("시카고 특유 토핑"));
    }
}
