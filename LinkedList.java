package com.bridgelabz.linkedlist;

public class LinkedList<T extends  Comparable> {

    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        newNode= head;
        head = newNode;
    }
}




    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

public void size(){

 int c = 0;
 if(head!=null){
     Node<T> temp=head;
     while(temp!=null){
         temp=temp.next;
         c++;
     }
 }
    System.out.println(c);
}
    public void getElement(int index) {
       T element = null;
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
            if(count==index){
                element = temp.data;
                temp=temp.next;
            }
        }

        System.out.println(element);
    }

    public void add(T data) {
        Node<T> current = new Node<>(data);
        Node<T> temp;
        temp = head;
        if (head == null) {
            head = current;
            tail = current;
        } else if (temp.data.compareTo(current.data) < 0) {
            head = current;
            current.next = temp;
        } else {
            while (temp.next != null && temp.next.data.compareTo(current.data) > 0) {
                temp = temp.next;
            }
            temp.next = current;
            tail = current;
        }
    }

    public int length() {

        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
    void valuesOfPointers(){
        if(length() > 0) {
            System.out.println("head-->" + head.data + " & " + "tail-->" + tail.data);
        }else{
            System.out.println("Linked list is empty. Cannot display head & tail");
        }
    }
    public void getFirstElement(){
        Node<T> temp = head;
       T value;
        if(head==null){
            System.out.println("list is empty");
        } else if (head!=null) {
            value=head.data;
            System.out.println(value);
        }

    }

    public void elementAtPosition(int position) {
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

public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            Node<T> temp = searchedNode.next;
            searchedNode.next = newNode;
            newNode.next = temp;
            return true;
        }
        return false;
    }


    public void pop() {
        Node<T> temp = head;
        head = head.next;

    }

 public  Node<T> popLast(){
     Node<T> temp = head;
     while (temp.next != tail){
         temp=temp.next;
     }
     temp.next=null;
     tail=temp;
     return temp;
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
    public void display() {
        Node<T> temp = head;
        while(temp !=null ) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }



//     public  MyNode<T> searchDelete(T data){
//         MyNode<T> deleteNode = search(data);
//         while(deleteNode != null){
//         MyNode<T> temp= deleteNode.next;
//         deleteNode= temp;
//         }
//
//         return deleteNode;
//    }

//    public void sorting(){
//        int count=0;
//        if(head != null){
//            MyNode<T> temp = head;
//            while(temp != null){
//                temp=temp.next ;
//                count++;
//            }
//        }
//        System.out.println("no of nodes are  " +count);
//        for (int i = 0; i < count; i++) {
//            for (int j = 0; j < count-1; j++) {
//                MyNode<T> temp = head;
//                MyNode<T> temp1 = temp.next;
//               T k;
//
//               if((temp.data.compareTo(temp1.data) > 0)){
//                   k=temp.data;
//                   temp.data=temp1.data;
//                   temp1.data=k;
//               }
//                    temp=temp1;
//                    temp1=temp.next;
//
//            }
//
//        }
//        System.out.println("sorted array is");
//        MyNode<T> temp2 = head;
//        while (temp2 !=null ) {
//            System.out.print(temp2.data + " -> ");
//            temp2 = temp2.next;
//        }
//        System.out.println();
//    }
//


    public void sortedList() {
        Node<T> current = head, index;
        T temp;
        if (head != null) {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.compareTo(index.data) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
            }
        }
    }
}







