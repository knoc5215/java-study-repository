package com.study.factory.methodPattern;

import com.study.factory.Suit.Suit;

public abstract class SuitFactory {
    public abstract Suit createSuit(String type);
}
