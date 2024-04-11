package org.example.utils;

import org.example.utils.interfaces.MyList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private T[] arr = (T[]) new Object[5];

    public MyArrayList() {
        size = 0;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Incorrect index.");
        }
    }

    private void checkEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("ArrayList is empty.");
        }
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void printArr(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    @Override
    public void add(T item) {
        if(size>=arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);
        if(size>=arr.length) {
            increaseBuffer();
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = item;
        size++;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        arr[index] = item;
    }

    @Override
    public void addFirst(T item) {
        if(size>=arr.length) {
            increaseBuffer();
        }
        for (int i = size - 1; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        if(size>=arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void remove(int index) {
        checkEmpty();
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        checkEmpty();
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeLast() {
        checkEmpty();
        size--;
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void sort() {

    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        checkEmpty();
        return arr[0];
    }

    @Override
    public T getLast() {
        checkEmpty();
        return arr[size - 1];
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
