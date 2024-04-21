package org.example.utils.classes;

import org.example.utils.exceptions.ArrayEmptyException;
import org.example.utils.interfaces.MyQueueInterface;

import java.util.Iterator;

public class MyQueue<T> implements MyQueueInterface<T> {

    private MyLinkedList<T> myLinkedList;

    public MyQueue() {
        myLinkedList = new MyLinkedList<T>();
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new ArrayEmptyException("ArrayList is empty.");
        }
    }
    @Override
    public void printArr() {
        myLinkedList.printArr();
    }
    @Override
    public void enqueue(T item) {
        myLinkedList.add(item);
    }

    @Override
    public T dequeue() {
        checkEmpty();
        T first = myLinkedList.getFirst();
        myLinkedList.removeFirst();
        return first;
    }

    @Override
    public T peek() {
        checkEmpty();
        return myLinkedList.getFirst();
    }

    @Override
    public int size() {
        return myLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }

    @Override
    public void clear() {
        myLinkedList = new MyLinkedList<T>();
    }

    @Override
    public Object[] toArray() {
        return myLinkedList.toArray();
    }

    @Override
    public boolean exists(Object object) {
        return myLinkedList.exists(object);
    }

    @Override
    public Iterator<T> iterator() {
        return myLinkedList.iterator();
    }
}
