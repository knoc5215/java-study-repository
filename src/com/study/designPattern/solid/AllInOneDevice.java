package com.study.designPattern.solid;

/*
    4.ISP(Interface segregation principle) 인터페이스 분리 원칙
        - 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 낫다.
        - ISP를 지키려다보면 SRP도 함께 지키게 된다 자연스럽게.
        - 인터페이스 분리 = 단일 책임 지향
 */
public interface AllInOneDevice {
    // 인터페이스도 여러개로 쪼개자. --> PrintDevice, CopyDevice, FaxDevice
    void print();

    void copy();

    void fax();

}
