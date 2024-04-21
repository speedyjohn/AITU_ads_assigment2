package org.example.utils.classes;

public class MyNode<T> {
        T data;
        MyNode next;
        MyNode prev;

        public MyNode(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public MyNode(T data, MyNode next, MyNode prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
}
