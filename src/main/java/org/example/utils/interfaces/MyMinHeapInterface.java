package org.example.utils.interfaces;

public interface MyMinHeapInterface<T> extends Iterable<T> {
    void insert(T item);

    void removeSmallest();
    T get(int index);
    T getSmallest();
    void clear();
    Object[] toArray();

    void printArr();

    void printHeap();

    int size();
}
