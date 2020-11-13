package com.study.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadEx2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        final Node node1 = new Node();
        final Node node2 = new Node();

        try {
            Future<?> future1 = executorService.submit(() -> {
                sum(node1, node2);
            });
            Future<?> future2 = executorService.submit(() -> {
                sum(node2, node1);
            });

            future1.get();
            future2.get();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Node data - " + node1.getData());
        System.out.println("Node data - " + node2.getData());
    }


    /*
    static synchronized method
    해당 class의 class obj에 대해 동기화가 일어난다
    즉, 해당 class의 각기 다른 instance obj를 사용하는 thread일지라도 한 스레드가 들어오면 lock을 걸어버려서 진입할 수 없다
     */
    private static synchronized void add(Node n1, Node n2, int i) {
        int data = n1.getData();
        n1.setData(data + i);
        data = n2.getData();
        n2.setData(data + i);
    }

    private static void sum(Node n1, Node n2) {
        for (int i = 0; i < 10; i++) {
            add(n1, n2, i);
            System.out.println(Thread.currentThread().getName() + " i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Node {
    public int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
