package com.study.designPattern.factory.methodPattern;

import com.study.designPattern.factory.Suit.Suit;

public class FactoryMethodMain {
    /*
    팩토리 패턴의 핵심은 클래스의 인스턴스를 만드는 것을 서브클래스에서 결정하도록 한다는 것이다.팩
    즉, new 키워드를 사용하는 부분을 서브클래스에 위임함으로서
    객체 생성을 캡슐화하고 구상 클래스에 대한 의존성이 줄어든다는 이점을 얻을 수 있다.
     */
    public static void main(String[] args) {
        System.out.println("FactoryMethodMain");

        TypeSuitFactory typeSuitFactory = new TypeSuitFactory();

        Suit spaceSuit = typeSuitFactory.createSuit("space");
        Suit stealthSuit = typeSuitFactory.createSuit("stealth");
        Suit combatSuit = typeSuitFactory.createSuit("");

        System.out.println(spaceSuit.getName());
        System.out.println(stealthSuit.getName());
        System.out.println(combatSuit.getName());
    }
}
