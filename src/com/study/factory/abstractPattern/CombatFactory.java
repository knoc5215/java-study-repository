package com.study.factory.abstractPattern;

import com.study.factory.Suit.CombatSuit;
import com.study.factory.Suit.Suit;

public class CombatFactory implements SuitAbstractFactory {
    @Override
    public Suit createSuit() {
        return new CombatSuit();
    }
}
