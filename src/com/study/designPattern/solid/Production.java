package com.study.designPattern.solid;

/*
    1. SRP(Single Responsibility Principle) 단일 책임의 원칙
        - 한 클래스는 하나의 책임만을 가져야 한다.
    2. OCP(Open Close Principle) 개방 폐쇄 원칙
        - 확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.
    3. LSP(Liskov Substitution Principle) 리스코프 치환 원칙
        - 객체는 프로그램의 정확성을 지키면서, 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
        - 객체의 행위의 IS-A를 만족해야 한다.


 */
public class Production {
    public static final int MIN_PRICE = 1000;
    private String name;
    private int price;
    private String option;

    public Production(String name, int price, String option) {
        this.name = name;
        this.price = price;
        this.option = option;
    }

    public int getNameLength() {
        return name.length();
    }

    public String getOption() {
        return option;
    }

    public void updatePrice(int price) {
        this.price = price;
        validatePrice(price);
    }

    public void validatePrice(int price) {
        if (price < MIN_PRICE) {
            throw new IllegalArgumentException(String.format("최소가격은 %d원 이상입니다.", MIN_PRICE));
        }
    }
}
