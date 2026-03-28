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
}
