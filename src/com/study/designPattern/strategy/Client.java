package com.study.designPattern.strategy;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();

        bus.setMovableStrategy(new FlyStrategy());

        bus.move();


    }
}
