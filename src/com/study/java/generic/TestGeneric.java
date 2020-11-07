package com.study.java.generic;

public class TestGeneric<T> {
    public T sample;

    public void showYourType() {
        if (sample instanceof Integer) {
            System.out.println("type : Integer");
        } else if (sample instanceof String) {
            System.out.println("type : String");
        }
    }

    public T getSample() {
        return sample;
    }

    public void setSample(T sample) {
        this.sample = sample;
    }
}
