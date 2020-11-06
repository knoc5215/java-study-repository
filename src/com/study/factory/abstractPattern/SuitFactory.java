package com.study.factory.abstractPattern;

import com.study.factory.Suit.Suit;

public class SuitFactory {
    public static Suit getSuit(SuitAbstractFactory suitAbstractFactory) {
        return suitAbstractFactory.createSuit();
    }
}
