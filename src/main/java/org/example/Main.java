package org.example;

import org.example.utils.classes.arrayList.MyArrayList;
import org.example.utils.classes.arrayList.MyArrayListMinHeap;
import org.example.utils.classes.arrayList.MyArrayListQueue;
import org.example.utils.classes.arrayList.MyArrayListStack;
import org.example.utils.classes.linkedList.MyLinkedList;
import org.example.utils.classes.linkedList.MyLinkedListMinHeap;
import org.example.utils.classes.linkedList.MyLinkedListQueue;
import org.example.utils.classes.linkedList.MyLinkedListStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        String incorrectInput = """
                =============================================
                Incorrect input.
                =============================================
                """;
        System.out.println("""
                Enter 0 if you want to quit the program
                Programs:
                1: Check ArrayList functionalities
                2: Check LinkedList functionalities
                3: Check ArrayListQueue functionalities
                4: Check LinkedListQueue functionalities
                5: Check ArrayListStack functionalities
                6: Check LinkedListStack functionalities
                7: Check ArrayListMinHeap functionalities
                8: Check LinkedListMinHeap functionalities
                """);
        while(true) {
            try {
                System.out.println("\n=============================================");
                System.out.println("Enter the number of the data structure you want to check(1-8): ");
                System.out.println("=============================================\n");
                String input = reader.readLine();
                number = Integer.parseInt(input);
                if(number == 0) {
                    break;
                }
                switch (number) {
                    case 1:
                        System.out.println("""
                                ---------------------------------------------
                                ArrayList
                                ---------------------------------------------
                                """);
                        MyArrayList<Object> myArrayList = new MyArrayList<>();
                        myArrayList.add(1);
                        myArrayList.add(2);
                        myArrayList.add(3);
                        myArrayList.add(4);
                        myArrayList.add(5);
                        System.out.println("ArrayList after adding elements:");
                        myArrayList.printArr();
                        System.out.println();
                        myArrayList.add(3, 123);
                        System.out.println("ArrayList after adding element by index 3:");
                        myArrayList.printArr();
                        System.out.println();
                        System.out.println("ArrayList after replacing value of element with index 5:");
                        myArrayList.set(5, 555);
                        myArrayList.printArr();
                        System.out.println();
                        System.out.println("ArrayList after adding element at the first place:");
                        myArrayList.addFirst(111);
                        myArrayList.printArr();
                        System.out.println();
                        myArrayList.addLast(666);
                        System.out.println("ArrayList after adding element at the last place:");
                        myArrayList.printArr();
                        System.out.println();
                        myArrayList.remove(4);
                        System.out.println("ArrayList after removing element at the index 4:");
                        myArrayList.printArr();
                        System.out.println();
                        myArrayList.removeFirst();
                        System.out.println("ArrayList after removing element at the first place:");
                        myArrayList.printArr();
                        System.out.println();
                        myArrayList.removeLast();
                        System.out.println("ArrayList after removing element at the last place:");
                        System.out.println();
                        myArrayList.add(32);
                        myArrayList.add(45);
                        myArrayList.add(15);
                        myArrayList.add(15);
                        myArrayList.add(5);
                        myArrayList.add(5);
                        myArrayList.add(7);
                        myArrayList.sort();
                        System.out.println("ArrayList after adding elements and sorting:");
                        myArrayList.printArr();
                        System.out.println("Element at the index 3: " + myArrayList.get(3));
                        System.out.println("Element at the first place: " + myArrayList.getFirst());
                        System.out.println("Element at the last place: " + myArrayList.getLast());
                        myArrayList.printArr();
                        System.out.println("First index of element 7: " + myArrayList.indexOf(7));
                        System.out.println("Last index of element 7: " + myArrayList.lastIndexOf(7));
                        System.out.println("One-by-one output: ");
                        for (Object num: myArrayList) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        System.out.println("Element 3333 exists in ArrayList: " + myArrayList.exists(3333));
                        System.out.println("Size of ArrayList:");
                        System.out.println(myArrayList.size());
                        myArrayList.clear();
                        System.out.println("Size of ArrayList after clearing:");
                        System.out.println(myArrayList.size());
                        break;

                    case 2:
                        System.out.println("""
                                ---------------------------------------------
                                LinkedList
                                ---------------------------------------------
                                """);
                        MyLinkedList<Object> myLinkedList = new MyLinkedList<>();
                        myLinkedList.add(123);
                        myLinkedList.add(23);
                        myLinkedList.add(3);
                        myLinkedList.add(43);
                        myLinkedList.add(41);
                        System.out.println("LinkedList after adding elements:");
                        myLinkedList.add(2, 101);
                        System.out.println("LinkedList after adding element by index 2:");
                        myLinkedList.printArr();
                        myLinkedList.addFirst(111);
                        System.out.println("LinkedList after adding element at the first place:");
                        myLinkedList.addLast(999);
                        System.out.println("LinkedList after adding element at the last place:");
                        myLinkedList.printArr();
                        myLinkedList.set(0, 1111);
                        System.out.println("LinkedList after replacing value of element with index 1:");
                        myLinkedList.printArr();
                        myLinkedList.remove(2);
                        System.out.println("LinkedList after removing element at the index 2:");
                        myLinkedList.printArr();
                        System.out.println("LinkedList after removing element at the first place:");
                        myLinkedList.removeFirst();
                        myLinkedList.printArr();
                        System.out.println("LinkedList after removing element at the last place:");
                        myLinkedList.removeLast();
                        myLinkedList.printArr();
                        myLinkedList.sort();
                        System.out.println("LinkedList after and sorting:");
                        myLinkedList.printArr();
                        System.out.println("Element at the index 1: " + myLinkedList.get(1));
                        System.out.println("Element at the first place: " + myLinkedList.getFirst());
                        System.out.println("Element at the last place: " + myLinkedList.getLast());
                        System.out.println("First index of element 3: " + myLinkedList.indexOf(3));
                        System.out.println("Last index of element 3: " + myLinkedList.lastIndexOf(3));
                        System.out.println("One-by-one output: ");
                        for (Object item: myLinkedList) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Element 3333 exists in LinkedList: " + myLinkedList.exists(3333));
                        System.out.println("Size of LinkedList: " + myLinkedList.size());
                        myLinkedList.clear();
                        System.out.println("Size of LinkedList after clearing: " + myLinkedList.size());
                        break;

                    case 3:
                        System.out.println("""
                                ---------------------------------------------
                                ArrayListQueue
                                ---------------------------------------------
                                """);
                        MyArrayListQueue<Object> myArrayListQueue = new MyArrayListQueue<>();
                        myArrayListQueue.enqueue(1);
                        myArrayListQueue.enqueue(2);
                        myArrayListQueue.enqueue(3);
                        myArrayListQueue.enqueue(4);
                        myArrayListQueue.enqueue(5);
                        System.out.println("ArrayListQueue after enqueueing elements:");
                        myArrayListQueue.printArr();
                        System.out.println("Dequeue element: " + myArrayListQueue.dequeue());
                        System.out.println("Dequeue element: " + myArrayListQueue.dequeue());
                        System.out.println("ArrayListQueue after dequeueing elements:");
                        myArrayListQueue.printArr();
                        System.out.println("Peeking element: " + myArrayListQueue.peek());
                        System.out.println("ArrayListQueue after peeking element:");
                        myArrayListQueue.printArr();
                        System.out.println("Is ArrayListQueue empty: " + myArrayListQueue.isEmpty());
                        System.out.println("One-by-one output: ");
                        for (Object item: myArrayListQueue) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Element 123 exists in ArrayListQueue: " + myArrayListQueue.exists(123));
                        System.out.println("Size of ArrayListQueue: " + myArrayListQueue.size());
                        myArrayListQueue.clear();
                        System.out.println("Size of ArrayListQueue after clearing: " + myArrayListQueue.size());
                        break;

                    case 4:
                        System.out.println("""
                                ---------------------------------------------
                                LinkedListQueue
                                ---------------------------------------------
                                """);
                        MyLinkedListQueue<Object> myLinkedListQueue = new MyLinkedListQueue<>();
                        myLinkedListQueue.enqueue(1);
                        myLinkedListQueue.enqueue(2);
                        myLinkedListQueue.enqueue(3);
                        myLinkedListQueue.enqueue(4);
                        myLinkedListQueue.enqueue(5);
                        System.out.println("LinkedListQueue after enqueueing elements:");
                        myLinkedListQueue.printArr();
                        System.out.println("Dequeue the element: " + myLinkedListQueue.dequeue());
                        System.out.println("Dequeue the element: " + myLinkedListQueue.dequeue());
                        System.out.println("LinkedListQueue after dequeueing elements:");
                        myLinkedListQueue.printArr();
                        System.out.println("Peeking element: " + myLinkedListQueue.peek());
                        System.out.println("LinkedListQueue after peeking element:");
                        myLinkedListQueue.printArr();
                        System.out.println("Is LinkedListQueue empty: " + myLinkedListQueue.isEmpty());
                        System.out.println("One-by-one output: ");
                        for (Object item: myLinkedListQueue) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Element 123 exists in LinkedListQueue: " + myLinkedListQueue.exists(123));
                        System.out.println("Size of LinkedListQueue: " + myLinkedListQueue.size());
                        myLinkedListQueue.clear();
                        System.out.println("Size of LinkedListQueue after clearing: " + myLinkedListQueue.size());
                        break;
                    case 5:
                        System.out.println("""
                                ---------------------------------------------
                                ArrayListStack
                                ---------------------------------------------
                                """);
                        MyArrayListStack<Object> myArrayListStack = new MyArrayListStack<>();
                        myArrayListStack.push(1);
                        myArrayListStack.push(2);
                        myArrayListStack.push(3);
                        myArrayListStack.push(4);
                        myArrayListStack.push(5);
                        System.out.println("ArrayListStack after pushing elements:");
                        myArrayListStack.printArr();
                        System.out.println("Pop the element: " + myArrayListStack.pop());
                        System.out.println("Pop the element: " + myArrayListStack.pop());
                        System.out.println("ArrayListStack after popping elements:");
                        myArrayListStack.printArr();
                        System.out.println(myArrayListStack.peek());
                        System.out.println("ArrayListStack after peeking element:");
                        myArrayListStack.printArr();
                        System.out.println("Is ArrayListStack empty: " + myArrayListStack.isEmpty());
                        System.out.println("One-by-one output: ");
                        for (Object item: myArrayListStack) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Element 123 exists in ArrayListStack: " + myArrayListStack.exists(123));
                        System.out.println("Size of ArrayListStack: " + myArrayListStack.size());
                        myArrayListStack.clear();
                        System.out.println("Size of ArrayListStack after clearing: " + myArrayListStack.size());
                        break;

                    case 6:
                        System.out.println("""
                                ---------------------------------------------
                                LinkedListStack
                                ---------------------------------------------
                                """);
                        MyLinkedListStack<Object> myLinkedListStack = new MyLinkedListStack<>();
                        myLinkedListStack.push(1);
                        myLinkedListStack.push(2);
                        myLinkedListStack.push(3);
                        myLinkedListStack.push(4);
                        myLinkedListStack.push(5);
                        System.out.println("LinkedListStack after pushing elements:");
                        myLinkedListStack.printArr();
                        System.out.println("Pop the element: " + myLinkedListStack.pop());
                        System.out.println("Pop the element: " + myLinkedListStack.pop());
                        System.out.println("LinkedListStack after popping elements:");
                        myLinkedListStack.printArr();
                        System.out.println(myLinkedListStack.peek());
                        System.out.println("LinkedListStack after peeking element:");
                        myLinkedListStack.printArr();
                        System.out.println("Is LinkedListStack empty: " + myLinkedListStack.isEmpty());
                        System.out.println("One-by-one output: ");
                        for (Object item: myLinkedListStack) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Element 123 exists in LinkedListStack: " + myLinkedListStack.exists(123));
                        System.out.println("Size of LinkedListStack: " + myLinkedListStack.size());
                        myLinkedListStack.clear();
                        System.out.println("Size of LinkedListStack after clearing: " + myLinkedListStack.size());
                        break;

                    case 7:
                        System.out.println("""
                                ---------------------------------------------
                                ArrayListMinHeap
                                ---------------------------------------------
                                """);
                        MyArrayListMinHeap<Integer> myArrayListMinHeap = new MyArrayListMinHeap<>();
                        myArrayListMinHeap.insert(1);
                        myArrayListMinHeap.insert(2);
                        myArrayListMinHeap.insert(3);
                        myArrayListMinHeap.insert(4);
                        myArrayListMinHeap.insert(5);
                        myArrayListMinHeap.insert(6);
                        myArrayListMinHeap.insert(7);
                        System.out.println("ArrayListMinHeap after inserting elements: ");
                        System.out.println("Binary tree: ");
                        myArrayListMinHeap.printHeap();
                        System.out.println("Array: ");
                        myArrayListMinHeap.printArr();
                        System.out.println("The smallest element of ArrayListMinHeap: " + myArrayListMinHeap.getSmallest());
                        myArrayListMinHeap.removeSmallest();
                        System.out.println("ArrayListMinHeap after removing the smallest element: ");
                        System.out.println("Binary tree: ");
                        myArrayListMinHeap.printHeap();
                        System.out.println("Array: ");
                        myArrayListMinHeap.printArr();
                        System.out.println("One-by-one output: ");
                        for (Object item: myArrayListMinHeap) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Size of ArrayListMinHeap: " + myArrayListMinHeap.size());
                        myArrayListMinHeap.clear();
                        System.out.println("Size of ArrayListMinHeap after clearing: " + myArrayListMinHeap.size());
                        break;

                    case 8:
                        System.out.println("""
                                ---------------------------------------------
                                LinkedListMinHeap
                                ---------------------------------------------
                                """);
                        MyLinkedListMinHeap<Integer> myLinkedListMinHeap = new MyLinkedListMinHeap<>();
                        myLinkedListMinHeap.insert(1);
                        myLinkedListMinHeap.insert(2);
                        myLinkedListMinHeap.insert(3);
                        myLinkedListMinHeap.insert(4);
                        myLinkedListMinHeap.insert(5);
                        myLinkedListMinHeap.insert(6);
                        myLinkedListMinHeap.insert(7);
                        System.out.println("LinkedListMinHeap after inserting elements: ");
                        System.out.println("Binary tree: ");
                        myLinkedListMinHeap.printHeap();
                        System.out.println("Array: ");
                        myLinkedListMinHeap.printArr();
                        System.out.println("The smallest element of LinkedListMinHeap: " + myLinkedListMinHeap.getSmallest());
                        myLinkedListMinHeap.removeSmallest();
                        System.out.println("LinkedListMinHeap after removing the smallest element: ");
                        System.out.println("Binary tree: ");
                        myLinkedListMinHeap.printHeap();
                        System.out.println("Array: ");
                        myLinkedListMinHeap.printArr();
                        System.out.println("One-by-one output: ");
                        for (Object item: myLinkedListMinHeap) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        System.out.println("Size of LinkedListMinHeap: " + myLinkedListMinHeap.size());
                        myLinkedListMinHeap.clear();
                        System.out.println("Size of LinkedListMinHeap after clearing: " + myLinkedListMinHeap.size());
                        break;

                    default:
                        System.out.println(incorrectInput);
                        break;
                }
            } catch(NumberFormatException e) {
                System.out.println(incorrectInput);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        MyArrayListStack<Object> myStack = new MyArrayListStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printArr();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.printArr();
        System.out.println(myStack.peek());
        myStack.printArr();
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
        Object[] myStackArr = myStack.toArray();
        for (Object item: myStackArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(myStack.exists(123));
        myStack.clear();
        System.out.println(myStack.size());

    }
}