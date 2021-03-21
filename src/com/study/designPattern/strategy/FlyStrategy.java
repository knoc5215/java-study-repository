package com.study.designPattern.strategy;

public class FlyStrategy implements MovableStrategy{

    @Override
    public void move() {
        System.out.println("하늘로 날아서 이동");
    }
}
