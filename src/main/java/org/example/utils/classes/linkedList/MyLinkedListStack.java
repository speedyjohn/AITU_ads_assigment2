package org.example.utils.classes.linkedList;

import org.example.utils.exceptions.ArrayEmptyException;
import org.example.utils.interfaces.MyStackInterface;

import java.util.Iterator;

public class MyLinkedListStack<T> implements MyStackInterface<T> {
    private MyLinkedList<T> myLinkedList;
    private int size;

    public MyLinkedListStack() {
        myLinkedList = new MyLinkedList<T>();
        size = 0;
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
    public void push(T item) {
        myLinkedList.addLast(item);
        size++;
    }

    @Override
    public T pop() {
        checkEmpty();
        T last = myLinkedList.getLast();
        myLinkedList.removeLast();
        size--;
        return last;
    }

    @Override
    public T peek() {
        return myLinkedList.getLast();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        myLinkedList = new MyLinkedList<T>();
        size = 0;
    }

    @Override
    public Object[] toArray() {
        return myLinkedList.toArray();
    }

    @Override
    public boolean exists(T item) {
        return myLinkedList.exists(item);
    }

    @Override
    public Iterator<T> iterator() {
        return myLinkedList.iterator();
    }
}
