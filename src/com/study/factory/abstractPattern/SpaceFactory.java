package com.study.factory.abstractPattern;

import com.study.factory.Suit.SpaceSuit;
import com.study.factory.Suit.Suit;

public class SpaceFactory implements SuitAbstractFactory{
    @Override
    public Suit createSuit() {
        return new SpaceSuit();
    }
}
