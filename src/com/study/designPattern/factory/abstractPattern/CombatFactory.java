package com.study.designPattern.factory.abstractPattern;

import com.study.designPattern.factory.Suit.CombatSuit;
import com.study.designPattern.factory.Suit.Suit;

public class CombatFactory implements SuitAbstractFactory {
    @Override
    public Suit createSuit() {
        return new CombatSuit();
    }
}
