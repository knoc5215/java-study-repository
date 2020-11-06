package com.study.factory.abstractPattern;

import com.study.factory.Suit.StealthSuit;
import com.study.factory.Suit.Suit;

public class StealthFactory implements SuitAbstractFactory {
    @Override
    public Suit createSuit() {
        return new StealthSuit();
    }
}
