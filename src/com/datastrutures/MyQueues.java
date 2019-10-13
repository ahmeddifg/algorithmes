package com.datastrutures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyQueues<T> {
    private int size;
    private Node head = null;
    private Node tail = null;
    private Node peek = null;

    public MyQueues() {
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
            this.tail = this.head;
            while (this.tail.next != null)
                this.tail = this.tail.next;
            this.tail.next = node;
        }
        size++;
    }

    public Node pop() {
        if (size == 0)
            return null;
        else {
            this.head = this.head.next;
            --size;
            return this.head;
        }
    }

    public Node peek() {
        if (this.head != null)
            System.out.println("Current peek value: " + this.head.data);
        return this.head;
    }

    public void printQueues() {
        this.tail = head;
        while (this.tail != null) {
            System.out.print(this.tail.data + "  ");
            this.tail = this.tail.next;
        }
        System.out.println();
    }

    public Node getAt(int index) {
        int i = 0;
        if (index < size && size > 0) {
            this.tail = this.head;
            while (i < size) {
                if (i == index)
                    return this.tail;
                this.tail = this.tail.next;
                ++i;
            }
        } else return null;
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] agrs) {
        MyQueues MyQueue = new MyQueues<Integer>();
        FastScanner scanner = new FastScanner(System.in);
        System.out.println("Enter number of elements in The queue:");

        int queueSize = (int) scanner.nextInt();
        for (int i = 0; i < queueSize; i++) {
            MyQueue.push(scanner.nextInt());
        }
        MyQueue.printQueues();
        MyQueue.peek();
        MyQueue.pop();
        MyQueue.peek();
        MyQueue.pop();
        MyQueue.peek();
        MyQueue.printQueues();
        System.out.println("Current queue size: " + MyQueue.size);
        System.out.println("At 1 is "+MyQueue.getAt(1).data);

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
