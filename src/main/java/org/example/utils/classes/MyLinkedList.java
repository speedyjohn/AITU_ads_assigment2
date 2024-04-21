package org.example.utils.classes;

import org.example.utils.exceptions.ArrayEmptyException;
import org.example.utils.exceptions.ArrayIndexOutOfBoundsException;
import org.example.utils.exceptions.NoSuchElementException;
import org.example.utils.interfaces.MyListInterface;

import java.util.Iterator;

public class MyLinkedList<T> implements MyListInterface<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        size = 0;
        head = null;
        tail = null;
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

    private MyNode<T> getNode(int index) {
        checkIndex(index);
        MyNode<T> node;
        if(index < size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = size - 1; i > index ; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    @Override
    public void printArr() {
        MyNode<T> current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);
        if(index == 0) {
            addFirst(item);
        } else if(index == size) {
            addLast(item);
        } else {
            MyNode<T> newNode = new MyNode<>(item);
            MyNode<T> current = getNode(index);
            newNode.next = current;
            newNode.prev = current.prev;
            if(newNode.prev != null) {
                newNode.prev.next = newNode;
            }
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {
        MyNode<T> current = getNode(index);
        current.data = item;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if(index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            MyNode<T> toRemove = getNode(index);
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
            size--;
        }
    }

    @Override
    public void removeFirst() {
        checkEmpty();
        if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        checkEmpty();
        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        checkEmpty();
        return getNode(0).data;
    }

    @Override
    public T getLast() {
        checkEmpty();
        return getNode(size - 1).data;
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        MyNode<T> current = head;
        while(current != null) {
            if(current.data == object) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = size - 1;
        MyNode<T> current = tail;
        while(current != null) {
            if(current.data == object) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode<T> current = head;
        int index = 0;
        while(current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> current = head;
            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public T next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
