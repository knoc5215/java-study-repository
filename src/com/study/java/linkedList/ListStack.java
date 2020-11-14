package com.study.java.linkedList;

public class ListStack implements StackInterface {


    private ListStackNode head;
    private ListStackNode top;
    private int size;

    public ListStack(int size) {
        head = null;
        top = null;
        this.size = size;
    }

    public static void main(String[] args) {
        int stackSize = 5;
        ListStack listStack = new ListStack(stackSize);

        listStack.printListStack();

        listStack.push("A");
        listStack.printListStack();
        listStack.push("B");
        listStack.printListStack();
        listStack.push("C");
        listStack.printListStack();
        listStack.push("D");
        listStack.printListStack();
        listStack.push("E");
        listStack.printListStack();
        listStack.push("F");
        listStack.printListStack();

        listStack.pop();
        listStack.printListStack();
        listStack.pop();
        listStack.printListStack();

        listStack.peek();

        System.out.println(listStack.findNode("B").getData());


    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public boolean isFull() {
        if (isEmpty()) {
            return false;
        } else {
            int nodeCount = 0;
            ListStackNode nextNode = head;
            while (nextNode.getLink() != null) {
                ++nodeCount;
                nextNode = nextNode.getLink();
            }

            return (this.size - 1 == nodeCount);
        }
    }

    @Override
    public void push(String data) {
        ListStackNode newNode = new ListStackNode(data);

        if (isFull()) {
            System.out.println("stack is full");
        } else if (isEmpty()) {
            this.head = newNode;
            this.top = this.head;
        } else {
            ListStackNode nextNode = top;
            while (nextNode.getLink() != null) {
                nextNode = nextNode.getLink();
            }
            nextNode.setLink(newNode);
        }
    }

    @Override
    public void pop() {
        ListStackNode preNode, nextNode;
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }

        if (top.getLink() == null) {
            top = null;
            head = null;
        } else {
            preNode = top;
            nextNode = top.getLink();

            while (nextNode.getLink() != null) {
                preNode = nextNode;
                nextNode = nextNode.getLink();
            }

            preNode.setLink(null);
        }
    }

    @Override
    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }

        ListStackNode nextNode = top;
        while (nextNode.getLink() != null) {
            nextNode = nextNode.getLink();
        }

        System.out.println(nextNode.getData());

    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            head = null;
            top = null;
        }
    }

    public ListStackNode findNode(String data) {
        ListStackNode nextNode = this.top;
        while (nextNode != null) {
            if (data.equals(nextNode.getData())) {
                return nextNode;
            } else {
                nextNode = nextNode.getLink();
            }
        }

        return nextNode;
    }

    public void printListStack() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            ListStackNode nextNode = this.top;
            while (nextNode != null) {
                System.out.print(nextNode.getData() + " ");
                nextNode = nextNode.getLink();
            }
            System.out.println();
        }
    }
}

class ListStackNode {
    private String data;
    private ListStackNode link;

    public ListStackNode() {
        this.data = null;
        this.link = null;
    }

    public ListStackNode(String data) {
        this.data = data;
    }

    public ListStackNode(String data, ListStackNode link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListStackNode getLink() {
        return link;
    }

    public void setLink(ListStackNode link) {
        this.link = link;
    }
}
