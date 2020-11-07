package com.study.designPattern.factory.abstractPattern;

import com.study.designPattern.factory.Suit.Suit;

public class SuitFactory {
    public static Suit getSuit(SuitAbstractFactory suitAbstractFactory) {
        return suitAbstractFactory.createSuit();
    }
}
