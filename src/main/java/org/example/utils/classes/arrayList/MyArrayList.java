package org.example.utils.classes.arrayList;

import org.example.utils.exceptions.ArrayEmptyException;
import org.example.utils.exceptions.ArrayIndexOutOfBoundsException;
import org.example.utils.interfaces.MyListInterface;
import org.example.utils.sort.MergeSort;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements MyListInterface<T> {
    private int size;
    private T[] arr = (T[]) new Object[7];

    public MyArrayList() {
        size = 0;
    }

    public MyArrayList(int size) {
        this.size = size;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Incorrect index: " + index + ".");
        }
    }

    private void checkEmpty() {
        if (size == 0) {
            throw new ArrayEmptyException("ArrayList is empty.");
        }
    }

    protected void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length*2 + 1];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void printArr(){
        if(size == 0) {
            System.out.println("ArrayList is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            if(arr[i] != null) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
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
    public void addFirst(T item) {
        if(size>=arr.length) {
            increaseBuffer();
        }
        for (int i = size - 1; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = item;
        size++;
        return;
    }

    @Override
    public void addLast(T item) {
        if(size>=arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
        return;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        arr[index] = item;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
        return;
    }

    @Override
    public void removeFirst() {
        checkEmpty();
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
        return;
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
        return;
    }

    @Override
    public void sort() {
        // Найдем количество не-null элементов в массиве
        int notNullCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                notNullCount++;
            }
        }

        // Создаем новый массив для не-null элементов
        T[] notNullArray = (T[]) new Object[notNullCount];

        // Заполняем новый массив не-null элементами
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                notNullArray[index++] = arr[i];
            }
        }

        // Сортируем не-null элементы
        MergeSort.sort(notNullArray, 0, notNullCount - 1);

        // Обратно копируем отсортированные не-null элементы в оригинальный массив
        index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                arr[i] = notNullArray[index++];
            }
        }
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
        for (int i = 0; i < size; i++) {
            if(arr[i] == object) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if(arr[i] == object) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if(arr[i] == object) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        T[] newArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[5];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) arr[currentIndex++];
            }
        };
    }
}
