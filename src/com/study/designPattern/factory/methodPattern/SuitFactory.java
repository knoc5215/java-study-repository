package com.study.designPattern.factory.methodPattern;

import com.study.designPattern.factory.Suit.Suit;

public abstract class SuitFactory {
    public abstract Suit createSuit(String type);
}
