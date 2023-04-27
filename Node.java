package com.bridgelabz.linkedlist;

public class Node<T> {

    T data;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}


