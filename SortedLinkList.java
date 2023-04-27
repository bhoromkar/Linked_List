package com.bridgelabz.linkedlist;

public class SortedLinkList<T extends  Comparable> {
    Node<T> head;
    Node<T> tail;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }

        //sorting start here
        Node<T> current = head, index;
        T temp;
        if(head != null){
            while(current != null){
                index = current.next;
                while (index != null) {
                    if ((current.data.compareTo(index.data)) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp !=null ) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }
    public int getElement(int data) {
        T element = null;
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
            if (count == data) {
                element = temp.data;
                temp = temp.next;

            }
        }

     System.out.println((int) element);
        return (int) element;
    }
    public int elementAtPosition(int position) {
        if (head == null) {
            System.out.println("it is empty");
        }

        Node<T> current = head;
        int currentPosition = 0;

        while (current != null) {
            if (currentPosition == position) {
                System.out.println( current.data);
            }

            current = current.next;
            currentPosition++;
        }
        return currentPosition;
    }
    public T getNumberAtPosition(int position) {
        if (head == null) {
            throw new IllegalStateException("Cannot retrieve number from an empty linked list");
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null) {
            if (currentPosition == position) {
                return (T) current.data;
            }

            current = current.next;
            currentPosition++;
        }

        // If we get to this point, the position was not found in the linked list
        throw new IndexOutOfBoundsException("Position " + position + " not found in linked list");
    }


    public int size(){

        int c = 0;
        if(head!=null){
            Node<T> temp=head;
            while(temp!=null){
                temp=temp.next;
                c++;
            }
        }
        //System.out.println(c);
        return (int)c;
    }
    public Node<T> search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public  Node<T> searchDelete(T data){
        Node<T> deleteNode = search(data);
        if(deleteNode != null){
            Node<T> temp= deleteNode.next;
            deleteNode= temp;
        }
        return deleteNode;
    }
    public int length() {

        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void delete(T data) {
        Node<T> temp = head;
        while (temp != null || temp.data.equals(data)) {
            if (temp == head) {
                head = head.next;
                break;
            } else if (temp != head && temp != null) {
                temp = temp.next;
                temp.next = temp;
                break;
            } else if (temp == null) {
                temp.next = null;
                tail = temp;
                break;
            }
        }
        temp = temp.next;
    }

    public Node insert (int data)
    {
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;

        return head;
    }

//    MyNode<T> newNode = new MyNode<>(data);
//        if (head == null) {
//        head = newNode;
//        tail = newNode;
//        return;
//    } else {
//        newNode.next = head;
//        head = newNode;
//    }
//
//    //sorting start here
//    MyNode<T> current = head, index;
//    T temp;
//        if(head != null){
//        while(current != null){
//            index = current.next;
//            while (index != null) {
//                if ((current.data.compareTo(index.data)) > 0) {
//                    temp = current.data;
//                    current.data = index.data;
//                    index.data = temp;
//                }
//                index = index.next;
//            }
//            current = current.next;
//        }
//    }
//}



//            while (current != null) {
//                index = current.next;
//                while (index != null) {
//                    if (current.data.compareTo(index.data) < 0) {
//                        temp = current.data;
//                        current.data = index.data;
//                        index.data = temp;
//                    }
//                    index = index.next;
//                }
            }




