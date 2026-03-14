package org.example;

import java.util.Arrays;

public class Day11 {

    public static Integer maximumInteger(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static Float maximumFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static String maximumString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T maximum(T... items) {
        T[] sorted = items.clone();
        Arrays.sort(sorted);
        return sorted[sorted.length - 1];
    }

    public static <T extends Comparable<T>> void printMax(T a, T b, T c) {
        T max = maximum(a, b, c);
        System.out.println("Maximum value: " + max);
    }

    static class MaxFinder<T extends Comparable<T>> {
        private T first, second, third;
        public MaxFinder(T first, T second, T third) {
            this.first = first; this.second = second; this.third = third;
        }
        public T testMaximum() {
            T result = maximum(first, second, third);
            printMax(first, second, third);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Day 11: Find Maximum using Generics ===");
        System.out.println("TC1.1: " + maximumInteger(3, 1, 2));
        System.out.println("TC1.2: " + maximumInteger(1, 3, 2));
        System.out.println("TC1.3: " + maximumInteger(1, 2, 3));
        System.out.println("Max Float: " + maximumFloat(3.5f, 1.1f, 2.9f));
        System.out.println("Max String: " + maximumString("Apple", "Peach", "Banana"));
        System.out.println("Generic Max: " + maximum(10, 50, 30));
        System.out.println("Varargs Max: " + maximum(10, 50, 30, 90, 20));
        printMax(10, 50, 30);
        new MaxFinder<>(10, 50, 30).testMaximum();
    }
}
