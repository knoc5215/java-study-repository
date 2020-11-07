package com.study.designPattern.factory.abstractPattern;

import com.study.designPattern.factory.Suit.SpaceSuit;
import com.study.designPattern.factory.Suit.Suit;

public class SpaceFactory implements SuitAbstractFactory{
    @Override
    public Suit createSuit() {
        return new SpaceSuit();
    }
}
