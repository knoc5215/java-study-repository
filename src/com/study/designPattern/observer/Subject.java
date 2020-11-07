package com.study.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상화된 변경 관심 데이터
 * 즉, 데이터에 공통적으로 들어가야 하는 메소드들 -> 일반화
 */
public abstract class Subject {
    // 추상화된 통보 대상 목록
    // 출력 형태에 대한 Observer
    private List<Observer> observers = new ArrayList<>();

    // 통보 대상 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 통보 대상 제거
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 각 통보 대상에게 변경을 통보한
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
