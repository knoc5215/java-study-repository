package com.study.designPattern.factory.abstractPattern;

import com.study.designPattern.factory.Suit.Suit;

public class AbstractFactoryMain {
    /*
    추상 팩토리 패턴
    인터페이스를 이용하여, 구상 클래스를 지정하지 않고도 인스턴스를 생성할 수 있다.
     */
    public static void main(String[] args) {
        System.out.println("AbstractFactoryMain");

        Suit spaceSuit = SuitFactory.getSuit(new SpaceFactory());
        Suit stealthSuit = SuitFactory.getSuit(new StealthFactory());
        Suit combatSuit = SuitFactory.getSuit(new CombatFactory());

        System.out.println(spaceSuit.getName());
        System.out.println(stealthSuit.getName());
        System.out.println(combatSuit.getName());

    }


}
