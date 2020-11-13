package com.study.java.thread;

public class SingleThread implements Runnable {

    private int[] arr;

    public SingleThread() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    @Override
    public void run() {
        for(int i : arr) {
            try {
                Thread.sleep(1000);
                System.out.println("current thread is " + Thread.currentThread().getName());
                System.out.println("arr["+i+"] = " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        Thread thread = new Thread(singleThread, "first thread");

        thread.start();
    }
}
