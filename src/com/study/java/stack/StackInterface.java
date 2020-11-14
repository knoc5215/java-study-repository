package com.study.java.stack;

public interface StackInterface {
    boolean isEmpty();

    boolean isFull();

    void push(int data);

    int pop();

    int peek();

    void clear();
}
