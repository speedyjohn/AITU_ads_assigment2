package org.example;

import org.example.utils.classes.MyArrayList;
import org.example.utils.classes.MyLinkedList;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<Object> myArrayList = new MyArrayList<>();
//        myArrayList.add(1);
//        myArrayList.add(2);
//        myArrayList.add(3);
//        myArrayList.add(4);
//        myArrayList.add(5);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.add(3, 123);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.set(5, 555);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.addFirst(111);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.addLast(666);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.remove(4);
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.removeFirst();
//        myArrayList.printArr();
//        System.out.println();
//        myArrayList.removeLast();
//        System.out.println();
//        // Place for sort checking
//        System.out.println(myArrayList.get(3));
//        System.out.println(myArrayList.getFirst());
//        System.out.println(myArrayList.getLast());
//        myArrayList.printArr();
//        myArrayList.add(1);
//        myArrayList.add(1);
//        myArrayList.add(1);
//        myArrayList.add(1);
//        for (Object num: myArrayList) {
//            System.out.println(num);
//        }

        MyLinkedList<Object> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(2, 101);
        myLinkedList.printArr();
        myLinkedList.addFirst(111);
        myLinkedList.addLast(999);
        myLinkedList.printArr();
        myLinkedList.set(0, 1111);
        myLinkedList.printArr();
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        myLinkedList.remove(2);
        myLinkedList.printArr();
        // Place for sort checking
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.indexOf(3));
        System.out.println(myLinkedList.lastIndexOf(3));
        System.out.println(myLinkedList.exists(3333));
        Object[] arr = myLinkedList.toArray();
        for (Object item: arr) {
            System.out.print(item + " ");
        }
        System.out.println(myLinkedList.size());
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
    }
}