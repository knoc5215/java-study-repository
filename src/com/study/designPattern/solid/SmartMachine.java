package com.study.designPattern.solid;

public class SmartMachine implements PrintDevice, CopyDevice, FaxDevice {

    @Override
    public void copy() {
        System.out.println("copy");
    }

    @Override
    public void fax() {
        System.out.println("fax");
    }

    @Override
    public void print() {
        System.out.println("print");
    }
}
