package org.example;

import org.example.utils.classes.arrayList.MyArrayList;
import org.example.utils.classes.linkedList.MyLinkedList;

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
        System.out.println();
        myArrayList.add(32);
        myArrayList.add(45);
        myArrayList.add(15);
        myArrayList.add(15);
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.sort();
        myArrayList.printArr();
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
        myLinkedList.add(123);
        myLinkedList.add(23);
        myLinkedList.add(3);
        myLinkedList.add(43);
        myLinkedList.add(41);
//        myLinkedList.add(2, 101);
//        myLinkedList.printArr();
//        myLinkedList.addFirst(111);
//        myLinkedList.addLast(999);
//        myLinkedList.printArr();
//        myLinkedList.set(0, 1111);
//        myLinkedList.printArr();
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.remove(2);
//        myLinkedList.printArr();
//        // Place for sort checking
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        System.out.println(myLinkedList.indexOf(3));
//        System.out.println(myLinkedList.lastIndexOf(3));
//        System.out.println(myLinkedList.exists(3333));
//        Object[] arr = myLinkedList.toArray();
//        for (Object item: arr) {
//            System.out.print(item + " ");
//        }
//        System.out.println(myLinkedList.size());
//        myLinkedList.clear();
//        System.out.println(myLinkedList.size());
        myLinkedList.sort();
        myLinkedList.printArr();

//        MyQueue<Object> myQueue = new MyQueue<>();
//        myQueue.enqueue(1);
//        myQueue.enqueue(2);
//        myQueue.enqueue(3);
//        myQueue.enqueue(4);
//        myQueue.enqueue(5);
//        myQueue.printArr();
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.dequeue());
//        myQueue.printArr();
//        System.out.println(myQueue.peek());
//        myQueue.printArr();
//        System.out.println(myQueue.size());
//        System.out.println(myQueue.isEmpty());
//        Object[] myQueueArr = myQueue.toArray();
//        for (Object item: myQueueArr) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//        System.out.println(myQueue.exists(123));
//        myQueue.clear();
//        System.out.println(myQueue.size());

//        MyStack<Object> myStack = new MyStack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.printArr();
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        myStack.printArr();
//        System.out.println(myStack.peek());
//        myStack.printArr();
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());
//        Object[] myStackArr = myStack.toArray();
//        for (Object item: myStackArr) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//        System.out.println(myStack.exists(123));
//        myStack.clear();
//        System.out.println(myStack.size());

//        MyMinHeap<Integer> myMinHeap = new MyMinHeap<>();
//        myMinHeap.insert(1);
//        myMinHeap.insert(2);
//        myMinHeap.insert(3);
//        myMinHeap.insert(4);
//        myMinHeap.insert(5);
//        myMinHeap.insert(6);
//        myMinHeap.insert(7);
//        myMinHeap.printHeap();
//        myMinHeap.printArr();
//        System.out.println(myMinHeap.getSmallest());
//        myMinHeap.removeSmallest();
//        myMinHeap.printHeap();
//        myMinHeap.printArr();
//        Object[] myHeapArray = myMinHeap.toArray();
//        for (Object item: myHeapArray) {
//            System.out.print(item + " ");
//        }
//        myMinHeap.clear();
//        System.out.println();
//        myMinHeap.printArr();
    }
}