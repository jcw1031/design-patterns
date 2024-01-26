package factory.factorymethod.pizza;

import java.util.List;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        super("뉴욕 치즈 피자", "씬 크러스트 도우", "마리나라 소스", List.of("잘게 썬 레지아노 치즈"));
    }
}
