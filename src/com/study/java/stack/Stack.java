package com.study.java.stack;

public class Stack implements StackInterface {
    private int stackSize;
    private int[] arr;
    private int top;

    public Stack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        arr = new int[stackSize];
    }

    public static void main(String[] args) {
        int stackSize = 5;
        Stack stack = new Stack(stackSize);

        stack.push(1);
        stack.printStack();

        stack.push(2);
        stack.printStack();

        stack.push(3);
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.peek();
        stack.printStack();

        stack.clear();
        stack.printStack();


    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stackSize - 1);
    }

    @Override
    public void push(int data) {
        if (isFull()) {
            System.out.println("FULL");
        } else {
            arr[++top] = data;
            System.out.println("insert " + data);
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        } else {
            System.out.println("pop " + arr[top]);
            return arr[--top];
        }
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return 0;
        } else {
            System.out.println("peek " + arr[top]);
            return arr[top];
        }
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            top = -1;
            arr = new int[this.stackSize];
            System.out.println("Stack is clear!");
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.print("Stack elemnts : ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
