package org.example.Day13;

class MaxTest<T extends Comparable<T>> {

    T x, y, z;

    // Constructor
    MaxTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Instance method
    public T testMaximum() {
        return MaximumTest.testMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {

        T max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }

    //UC5
    public static <T extends Comparable<T>> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }

    //UC5 test
    public static void main(String[] args) {
        //UC5 test to print
    Integer max = testMaximum(10, 40, 25, 60, 5);
    printMax(max);
    }
}