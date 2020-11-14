package com.study.java.queue;

public class ListQueue implements QueueInterface {
    private ListQueueNode head, front, rear;
    private int queueSize;

    public ListQueue(int queueSize) {
        this.queueSize = queueSize;
        head = null;
        front = null;
        rear = null;
    }

    @Override
    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    @Override
    public boolean isFull() {
        if (isEmpty()) {
            return false;
        }

        int nodeCount = 0;
        ListQueueNode nextNode = head;
        while (nextNode.getLink() != null) {
            ++nodeCount;
            nextNode = nextNode.getLink();
        }

        return (nodeCount == this.queueSize - 1);

    }

    @Override
    public void enQueue(int data) {
        ListQueueNode newNode = new ListQueueNode(data);
        if (isFull()) {
            System.out.println("FULL");
        } else if (isEmpty()) {
            this.head = newNode;

            this.front = this.head;
            this.rear = this.head;
        } else {
            rear.setLink(newNode);
            rear = newNode;
        }
    }

    @Override
    public int deQueue() {
        ListQueueNode nextNode;
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        }

        if (front.getLink() == null) {
            head = null;
            front = null;
            rear = null;

            return 0;

        } else {
            nextNode = front.getLink();
            head = nextNode;
            front.setLink(null);
            front = head;

            return front.getData();
        }


    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        }

        return front.getData();

    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            head = null;
            front = null;
            rear = null;
        }
    }

    public ListQueueNode findNode(int data) {
        ListQueueNode nextNode = this.front;

        while (nextNode != null) {
            if (nextNode.getData() == data) {
                return nextNode;
            } else {
                nextNode = nextNode.getLink();
            }
        }

        return nextNode;
    }

    public void printListQueue() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.print("Queue elements : ");
            ListQueueNode nextNode = this.front;
            while (nextNode != null) {
                System.out.print(nextNode.getData() + " ");
                nextNode = nextNode.getLink();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int queueSize = 5;
        ListQueue listQueue = new ListQueue(queueSize);

        listQueue.enQueue(1);
        listQueue.printListQueue();

        listQueue.enQueue(2);
        listQueue.printListQueue();

        listQueue.enQueue(3);
        listQueue.printListQueue();

        listQueue.enQueue(4);
        listQueue.printListQueue();

        listQueue.enQueue(5);
        listQueue.printListQueue();

        listQueue.enQueue(6);
        listQueue.printListQueue();

        listQueue.deQueue();
        listQueue.printListQueue();

        listQueue.deQueue();
        listQueue.printListQueue();

        listQueue.deQueue();
        listQueue.printListQueue();

        listQueue.peek();
        listQueue.printListQueue();

        System.out.println(listQueue.findNode(4).getData());
    }
}

class ListQueueNode {
    private int data;
    public ListQueueNode link;

    public ListQueueNode(int data) {
        this.data = data;
    }

    public ListQueueNode(int data, ListQueueNode link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListQueueNode getLink() {
        return link;
    }

    public void setLink(ListQueueNode link) {
        this.link = link;
    }
}
