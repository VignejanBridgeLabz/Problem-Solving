package org.example;

public class Day14 {

    static class Node<T> {
        T data; Node<T> next;
        Node(T data) { this.data = data; this.next = null; }
    }

    static class LinkedList<T> {
        Node<T> head; int size;
        LinkedList() { this.head = null; this.size = 0; }
        void add(T data) { Node<T> n = new Node<>(data); n.next = head; head = n; size++; }
        void append(T data) {
            Node<T> n = new Node<>(data);
            if (head == null) { head = n; } else { Node<T> c = head; while (c.next != null) c = c.next; c.next = n; }
            size++;
        }
        T removeFirst() { if (head == null) return null; T d = head.data; head = head.next; size--; return d; }
        T peekFirst() { return head == null ? null : head.data; }
        boolean isEmpty() { return head == null; }
        int size() { return size; }
        void print() {
            Node<T> c = head; StringBuilder sb = new StringBuilder("[");
            while (c != null) { sb.append(c.data); if (c.next != null) sb.append(" -> "); c = c.next; }
            System.out.println(sb.append("]").toString());
        }
    }

    static class Stack<T> {
        private LinkedList<T> list = new LinkedList<>();
        void push(T data) { list.add(data); }
        T pop() { return list.removeFirst(); }
        T peek() { return list.peekFirst(); }
        boolean isEmpty() { return list.isEmpty(); }
        int size() { return list.size(); }
        void print() { list.print(); }
    }

    static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();
        void enqueue(T data) { list.append(data); }
        T dequeue() { return list.removeFirst(); }
        boolean isEmpty() { return list.isEmpty(); }
        int size() { return list.size(); }
        void print() { list.print(); }
    }

    public static void main(String[] args) {
        System.out.println("=== Day 14: Stack and Queue using LinkedList ===");
        Stack<Integer> stack = new Stack<>();
        stack.push(70); stack.push(30); stack.push(56);
        System.out.print("UC1 Stack: "); stack.print();
        System.out.println("UC2 Peek & Pop:");
        while (!stack.isEmpty()) System.out.println("  Peek: " + stack.peek() + " | Pop: " + stack.pop());
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56); queue.enqueue(30); queue.enqueue(70);
        System.out.print("UC3 Queue: "); queue.print();
        System.out.println("UC4 Dequeue:");
        while (!queue.isEmpty()) System.out.println("  Dequeued: " + queue.dequeue());
    }
}
