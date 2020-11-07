package com.study.designPattern.solid;

/*
    ISP를 지키기 위해 AllInOneDevice interface에서 print 기능만 뽑아내서
    --> 인터페이스 분리
 */
public interface PrintDevice {
    void print();
}
