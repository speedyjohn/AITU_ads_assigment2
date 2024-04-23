package org.example.utils.classes.arrayList;

import org.example.utils.interfaces.MyStackInterface;

import java.util.Iterator;

public class MyArrayListStack<T> implements MyStackInterface<T> {
    private MyArrayList<T> myArrayList;
    private int size;

    public MyArrayListStack() {
        myArrayList = new MyArrayList<T>();
        size = 0;
    }

    @Override
    public void printArr() {
        myArrayList.printArr();
    }

    @Override
    public void push(T item) {
        myArrayList.add(item);
    }

    @Override
    public T pop() {
        T first = myArrayList.getFirst();
        myArrayList.removeFirst();
        return first;
    }

    @Override
    public T peek() {
        return myArrayList.getFirst();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return myArrayList.size() == 0;
    }

    @Override
    public void clear() {
        myArrayList.clear();
        size = 0;
    }

    @Override
    public Object[] toArray() {
        return myArrayList.toArray();
    }

    @Override
    public boolean exists(T item) {
        return myArrayList.exists(item);
    }

    @Override
    public Iterator<T> iterator() {
        return myArrayList.iterator();
    }
}
