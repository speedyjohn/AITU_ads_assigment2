package org.example.utils.classes.arrayList;

import org.example.utils.interfaces.MyQueueInterface;

import java.util.Iterator;

public class MyArrayListQueue<T> implements MyQueueInterface<T> {
    private MyArrayList<T> myArrayList;
    private int size;

    public MyArrayListQueue() {
        myArrayList = new MyArrayList<T>();
        size = 0;
    }

    @Override
    public void printArr() {
        myArrayList.printArr();
    }

    @Override
    public void enqueue(T item) {
        myArrayList.add(item);
        size++;
    }

    @Override
    public T dequeue() {
        T first = myArrayList.getFirst();
        myArrayList.removeFirst();
        size--;
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
        return size == 0;
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
    public boolean exists(Object object) {
        return myArrayList.exists(object);
    }

    @Override
    public Iterator<T> iterator() {
        return myArrayList.iterator();
    }
}
