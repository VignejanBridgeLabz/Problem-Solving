package org.example;

public class Day12 {

    static class Node<T> {
        T data; Node<T> next;
        Node(T data) { this.data = data; this.next = null; }
    }

    static class LinkedList<T> {
        Node<T> head;
        LinkedList() { this.head = null; }

        public void add(T data) {
            Node<T> n = new Node<>(data); n.next = head; head = n;
        }
        public void append(T data) {
            Node<T> n = new Node<>(data);
            if (head == null) { head = n; return; }
            Node<T> c = head; while (c.next != null) c = c.next; c.next = n;
        }
        public void insertAfter(T key, T data) {
            Node<T> c = head;
            while (c != null) {
                if (c.data.equals(key)) {
                    Node<T> n = new Node<>(data); n.next = c.next; c.next = n; return;
                }
                c = c.next;
            }
        }
        public T pop() {
            if (head == null) return null;
            T d = head.data; head = head.next; return d;
        }
        public T popLast() {
            if (head == null) return null;
            if (head.next == null) { T d = head.data; head = null; return d; }
            Node<T> c = head;
            while (c.next.next != null) c = c.next;
            T d = c.next.data; c.next = null; return d;
        }
        public boolean search(T key) {
            Node<T> c = head;
            while (c != null) { if (c.data.equals(key)) return true; c = c.next; }
            return false;
        }
        public boolean delete(T key) {
            if (head == null) return false;
            if (head.data.equals(key)) { head = head.next; return true; }
            Node<T> c = head;
            while (c.next != null) {
                if (c.next.data.equals(key)) { c.next = c.next.next; return true; }
                c = c.next;
            }
            return false;
        }
        public int size() {
            int count = 0; Node<T> c = head;
            while (c != null) { count++; c = c.next; } return count;
        }
        public void print() {
            Node<T> c = head; StringBuilder sb = new StringBuilder();
            while (c != null) { sb.append(c.data); if (c.next != null) sb.append("->"); c = c.next; }
            System.out.println(sb.toString());
        }
    }

    static class SortedLinkedList<T extends Comparable<T>> {
        Node<T> head;
        SortedLinkedList() { this.head = null; }
        public void add(T data) {
            Node<T> n = new Node<>(data);
            if (head == null || data.compareTo(head.data) < 0) { n.next = head; head = n; return; }
            Node<T> c = head;
            while (c.next != null && data.compareTo(c.next.data) >= 0) c = c.next;
            n.next = c.next; c.next = n;
        }
        public void print() {
            Node<T> c = head; StringBuilder sb = new StringBuilder();
            while (c != null) { sb.append(c.data); if (c.next != null) sb.append("->"); c = c.next; }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Day 12: Data Structures using Java Generics ===");
        LinkedList<Integer> list = new LinkedList<>();
        list.append(56); list.append(30); list.append(70);
        System.out.print("UC1: "); list.print();
        list = new LinkedList<>(); list.add(70); list.add(30); list.add(56);
        System.out.print("UC2: "); list.print();
        list = new LinkedList<>(); list.append(56); list.append(30); list.append(70);
        System.out.print("UC3: "); list.print();
        list = new LinkedList<>(); list.append(56); list.append(70); list.insertAfter(56, 30);
        System.out.print("UC4: "); list.print();
        list = new LinkedList<>(); list.append(56); list.append(30); list.append(70); list.pop();
        System.out.print("UC5: "); list.print();
        list = new LinkedList<>(); list.append(56); list.append(30); list.append(70); list.popLast();
        System.out.print("UC6: "); list.print();
        list = new LinkedList<>(); list.append(56); list.append(30); list.append(70);
        System.out.println("UC7 Search 30: " + list.search(30));
        list = new LinkedList<>(); list.append(56); list.append(30); list.append(70); list.insertAfter(30, 40);
        System.out.print("UC8: "); list.print();
        list.delete(40); System.out.print("UC9: "); list.print(); System.out.println("Size: " + list.size());
        SortedLinkedList<Integer> sl = new SortedLinkedList<>();
        sl.add(56); sl.add(30); sl.add(40); sl.add(70);
        System.out.print("UC10 Sorted: "); sl.print();
    }
}
