package com.study.java.linkedList;

public class LinkedList<T> {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertNode(0);
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        linkedList.insertNode(6);
        linkedList.insertNode(7);
        linkedList.insertNode(8);
        linkedList.insertNode(9);

        System.out.println("연결리스트 초기상태");
        linkedList.print();

        linkedList.insertNode(10);
        System.out.println("연결리스트에 추가한 후");
        linkedList.print();

        linkedList.deleteNode(5);
        System.out.println("연결리스트의 특정 값을 삭제한 후");
        linkedList.print();

        linkedList.insertNode(linkedList.findNode(4), 5);
        System.out.println("연결리스트의 중간에 추가한 후");
        linkedList.print();

        linkedList.deleteNode();
        System.out.println("연결리스트의 마지막을 삭제한 후");
        linkedList.print();

    }

    private ListNode<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void insertNode(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            this.head = newNode;
        } else {
            ListNode<T> curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void insertNode(ListNode<T> preNode, T data) {
        ListNode<T> newNode = new ListNode<>(data);

        newNode.setNext(preNode.getNext());
        preNode.setNext(newNode);
    }

    public void deleteNode(T data) {
        ListNode<T> preNode = head;
        ListNode<T> nextNode = head.getNext();

        if (preNode.getData() == data) {
            head = preNode.getNext();
            preNode.setNext(null);

        } else {
            while (nextNode != null) {
                if (nextNode.getData() == data) {
                    if (nextNode.getNext() == null) {
                        preNode.setNext(null);
                    } else {
                        preNode.setNext(nextNode.getNext());
                        nextNode.setNext(null);
                    }
                    break;
                } else {
                    preNode = nextNode;
                    nextNode = nextNode.getNext();
                }
            }
        }
    }

    public void deleteNode() {
        ListNode<T> preNode;
        ListNode<T> nextNode;

        if (head == null) {
            return;
        }

        if (head.getNext() == null) {
            head = null;
        } else {
            preNode = head;
            nextNode = head.getNext();

            while (nextNode.getNext() != null) {
                preNode = nextNode;
                nextNode = nextNode.getNext();
            }

            preNode.setNext(null);
        }
    }

    public ListNode<T> findNode(T data) {
        ListNode<T> nextNode = this.head;

        while (nextNode != null) {
            if (nextNode.getData() == data) {
                return nextNode;
            } else {
                nextNode = nextNode.getNext();
            }
        }

        return nextNode;
    }

    public void print() {
        ListNode<T> nextNode = this.head;
        while (nextNode != null) {
            System.out.print(nextNode.getData() + " ");
            nextNode = nextNode.getNext();
        }
        System.out.println();
    }


}

class ListNode<T> {
    private T data;
    private ListNode<T> next;


    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
