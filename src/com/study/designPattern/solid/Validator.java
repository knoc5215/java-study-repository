package com.study.designPattern.solid;

/*
    2. OCP(Open Close Principle) 개방 폐쇄 원칙
    - 확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.
    - Validator interface를 통해, 여러가지 검증 class를 구현
 */
public interface Validator {
    boolean support(Production production);
    void validate(Production production) throws IllegalAccessException;
}
