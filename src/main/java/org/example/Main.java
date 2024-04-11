package org.example;

import org.example.utils.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.printArr();
        System.out.println();
        myArrayList.add(3, 123);
        myArrayList.printArr();
        System.out.println();
        myArrayList.set(5, 555);
        myArrayList.printArr();
        System.out.println();
        myArrayList.addFirst(111);
        myArrayList.printArr();
        System.out.println();
        myArrayList.addLast(666);
        myArrayList.printArr();
        System.out.println();
        myArrayList.remove(4);
        myArrayList.printArr();
        System.out.println();
        myArrayList.removeFirst();
        myArrayList.printArr();
        System.out.println();
        myArrayList.removeLast();
        myArrayList.printArr();
        System.out.println();
        // Place for sort checking
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.getFirst());
        System.out.println(myArrayList.getLast());


    }
}