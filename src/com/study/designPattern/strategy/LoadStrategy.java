package com.study.designPattern.strategy;

public class LoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("도로를 통해 이동");
    }
}
