package com.study.java.queue;

public interface QueueInterface {
    boolean isEmpty();
    boolean isFull();
    void enQueue(int data);
    int deQueue();
    int peek();
    void clear();


}
