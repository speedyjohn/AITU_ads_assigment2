package org.example.utils.interfaces;

public interface MyQueueInterface<T> extends Iterable<T> {
    void printArr();
    void enqueue(T item);

    T dequeue();

    T peek();

    int size();


    boolean isEmpty();

    void clear();

    Object[] toArray();

    boolean exists(Object object);
}
