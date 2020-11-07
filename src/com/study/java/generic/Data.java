package com.study.java.generic;

public class Data<T> {
    public T data;



    public void showYourType() {
        if (data instanceof Integer) {
            System.out.println("type : Integer");
        } else if (data instanceof String) {
            System.out.println("type : String");
        }
    }

    public static <T> T showData(T data) {
        if (data instanceof Integer) {
            System.out.println("type : Integer");
        } else if (data instanceof String) {
            System.out.println("type : String");
        } else if (data instanceof Double) {
            System.out.println("type : Double");
        }

        return data;
    }
}
