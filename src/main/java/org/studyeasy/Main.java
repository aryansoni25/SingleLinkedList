package org.studyeasy;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList sLL = new SinglyLinkedList();
//        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
//        sLL.insertInLinkedList(6, 1);
//        sLL.insertInLinkedList(7, 3);
//        sLL.insertInLinkedList(8, 4);
//        sLL.insertInLinkedList(9, 0);
//        sLL.traverseSinglyLinkedList();
//        sLL.deleteSLL();
//        sLL.traverseSinglyLinkedList();
        CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
        csll.createCSLL(18);
//        System.out.println(csll.head.value);
//        System.out.println(csll.head.next.value);
//        System.out.println(csll.tail.value);
        csll.insert(4,0);
        csll.insert(5,1);
        csll.insert(6,2);
        csll.insert(7,3);
        System.out.println(csll.head.value);
        csll.traverse();
        csll.deleteNode(4);
        csll.traverse();
        csll.deleteCSLL();

    }
}
