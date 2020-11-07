package com.study.designPattern.factory.abstractPattern;

import com.study.designPattern.factory.Suit.StealthSuit;
import com.study.designPattern.factory.Suit.Suit;

public class StealthFactory implements SuitAbstractFactory {
    @Override
    public Suit createSuit() {
        return new StealthSuit();
    }
}
