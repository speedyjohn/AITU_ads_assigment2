package org.example.utils.interfaces;

public interface MyStackInterface<T> extends Iterable<T> {
    void printArr();
    void push(T item);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
    void clear();
    Object[] toArray();
    boolean exists(T item);
}
