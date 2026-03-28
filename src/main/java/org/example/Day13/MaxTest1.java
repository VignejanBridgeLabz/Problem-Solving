package org.example.Day13;

public  class MaxTest1{

public static <T extends Comparable<T>> T testMaximum(T... values) {

    T max = values[0];

    for (int i = 1; i < values.length; i++) {
        if (values[i].compareTo(max) > 0) {
            max = values[i];
        }
    }
    return max;
}
    public static <T extends Comparable<T>> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }
}
