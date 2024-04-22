package org.example.utils.classes;

import org.example.utils.exceptions.ArrayEmptyException;
import org.example.utils.interfaces.MyMinHeapInterface;

public class MyMinHeap<T extends Comparable<T>> implements MyMinHeapInterface<T> {
    private MyArrayList<T> heap;
    private int index;
    private int size;

    public MyMinHeap() {
        heap = new MyArrayList<>(7);
        size = 7;
        index = 0;
    }

    private void checkEmpty() {
        if (index == 0) {
            throw new ArrayEmptyException("ArrayList is empty.");
        }
    }

    private void checkSize() {
        if(index > size) {
            size = size * 2 + 1;
        }
    }

    public MyMinHeap(int size) {
        heap = new MyArrayList<>(size);
        this.size = size;
        index = 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return (index * 2) + 1;
    }

    private int rightChild(int index) {
        return (index * 2) + 2;
    }

    private boolean isLeaf(int index) {
        return leftChild(index) >= index || rightChild(index) >= index;
    }

    private void swap(int x, int y) {
        T tmp = heap.get(x);
        heap.set(x, heap.get(y));
        heap.set(y, tmp);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private void minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;
        if (left < this.index && heap.get(left).compareTo(heap.get(smallest)) < 0) {
            smallest = left;
        }
        if (right < this.index && heap.get(right).compareTo(heap.get(smallest)) < 0) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }
    @Override
    public void insert(T item) {
        heap.add(index, item);
        int current = index;
        while (current > 0 && heap.get(current).compareTo(heap.get(parent(current))) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
        index++;
    }

    @Override
    public void removeSmallest() {
        checkEmpty();
        checkSize();
        T popped = heap.get(0);
        heap.set(0, heap.get(index - 1));
        index--;
        if (index > 0) {
            minHeapify(0);
        }
    }

    @Override
    public T get(int index) {
        return heap.get(index);
    }

    @Override
    public T getSmallest() {
        return heap.get(0);
    }

    @Override
    public void clear() {
        heap = new MyArrayList<>();
    }

    @Override
    public Object[] toArray() {
        checkEmpty();
        Object[] arr = new Object[size - 1];
        for (int i = 0; i < index; i++) {
            arr[i] = heap.get(i);
        }
        return arr;
    }

    @Override
    public void printArr() {
        for (int i = 0; i < index; i++) {
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }

    @Override
    public void printHeap() {
        int height = (int) Math.ceil(Math.log(index + 1) / Math.log(2));
        int maxLevelNumber = (int) Math.pow(2, height - 1);
        int spaceBetweenItems = (int) Math.pow(2, height) - 1;
        int printedNodes = 0;
        int nodeIndex = 0;
        int currentLevelNumber = 0;
        for (int level = 0; level < height; level++) {
            currentLevelNumber = (int) Math.pow(2, level);
            for (int i = 0; i < currentLevelNumber; i++) {
                if (i == 0) {
                    printWhitespaces((int) Math.pow(2, (height - level - 1)) - 1);
                }
                if (nodeIndex < index) {
                    System.out.print(heap.get(nodeIndex));
                    printedNodes++;
                    nodeIndex++;
                }
                if (i != currentLevelNumber - 1) {
                    printWhitespaces(spaceBetweenItems - (int) Math.pow(2, (height - level - 1)) + 1);
                }
            }
            spaceBetweenItems = spaceBetweenItems / 2;
            System.out.println();
            if (printedNodes == index) break;
        }
    }
}
