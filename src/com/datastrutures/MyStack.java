package com.datastrutures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyStack<T> {
    private int size;
    private Node head = null;
    private Node tail = null;
    private Node peek = null;

    public MyStack() {
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.peek = null;
    }

    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T element) {
        Node node = new Node(element);
        if (size == 0) {
            this.head = node;
            this.tail = head;
            this.peek = this.head;
        } else {

            this.tail = head;
            while (this.tail.next != null)
                this.tail = this.tail.next;

            this.tail.next = node;
            this.peek = node;
        }
        ++size;
    }

    public Node peek() {
        if (peek != null) {
            System.out.println("This is peek value: " + this.peek.data);
        }
        return peek;
    }

    public Node pop() {
        Node temp = null;
        if (size != 0) {
            --size;
        } else {
            return null;
        }
        if (size == 1) {
            temp = this.head;
            this.head = null;
            this.tail = null;
            this.peek = null;
            return temp;
        } else {
            this.tail = head;
            while (this.tail.next != this.peek) {
                this.tail = this.tail.next;
            }
            System.out.println("This is the popped value of your stack: " + this.peek.data);
            this.tail.next = null;
            this.peek = this.tail;
            return this.peek;
        }
    }


    public void printStack() {
        this.tail = head;
        System.out.println("Here is you list of elements on your stack:");
        while (tail != null) {
            System.out.print(this.tail.data + " ");
            this.tail = this.tail.next;
        }
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] agrs) {
        MyStack myStack = new MyStack<Integer>();
        Arrays.FastScanner scanner = new Arrays.FastScanner(System.in);
        System.out.println("Enter number of elements in The stack:");

        int stackSize = (int) scanner.nextInt();
        for (int i = 0; i < stackSize; i++) {
            myStack.push(scanner.nextInt());
        }
        myStack.peek();
        myStack.pop();
        myStack.peek();
        myStack.pop();
        myStack.peek();
        myStack.printStack();
        System.out.println("Current Stack size: "+myStack.size);

    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextInt() {
            return Long.parseLong(next());
        }
    }

}
