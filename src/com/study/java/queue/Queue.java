package com.study.java.queue;

public class Queue implements QueueInterface {
    private int front;
    private int rear;
    private int queueSize;
    private int[] arr;


    public Queue(int queueSize) {
        front = -1;
        rear = -1;
        this.queueSize = queueSize;
        arr = new int[queueSize];

    }

    @Override
    public boolean isEmpty() {
        if (front == rear) {
            front = -1;
            rear = -1;
        }

        return (front == rear);
    }

    @Override
    public boolean isFull() {
        return (rear == this.queueSize - 1);
    }

    @Override
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("FULL");
        } else {
            arr[++rear] = data;
            System.out.println("eqQueue " + data);
        }
    }

    @Override
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        }
        System.out.println("deQueue " + arr[front + 1]);
        front = (front + 1) % this.queueSize;

        return arr[front];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        } else {
            System.out.println("peek " + arr[front + 1]);
            return arr[front + 1];
        }
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            front = -1;
            rear = -1;
            arr = new int[this.queueSize];
            System.out.println("Queue is clear");
        }

    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.print("Queue elements : ");
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int queueSize = 5;
        Queue queue = new Queue(queueSize);

        queue.enQueue(1);
        queue.printQueue();

        queue.enQueue(2);
        queue.printQueue();

        queue.enQueue(3);
        queue.printQueue();

        queue.enQueue(4);
        queue.printQueue();

        queue.enQueue(5);
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();

        queue.deQueue();
        queue.printQueue();

        queue.peek();
        queue.printQueue();

        queue.clear();
        queue.printQueue();
    }
}
