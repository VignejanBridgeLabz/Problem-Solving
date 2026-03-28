package org.example.Day13;

class MaximumTest {
    // Generic method
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {

        // TC 1.1 – Max at 1st position
        Integer result1 = testMaximum(30, 20, 10);
        System.out.println("Max (1st position): " + result1);

        // TC 1.2 – Max at 2nd position
        Integer result2 = testMaximum(10, 50, 20);
        System.out.println("Max (2nd position): " + result2);

        // TC 1.3 – Max at 3rd position
        Integer result3 = testMaximum(10, 20, 70);
        System.out.println("Max (3rd position): " + result3);

        Float res1 = testMaximum(3.5f, 2.2f, 1.1f);
        Float res2 = testMaximum(1.1f, 5.5f, 2.2f);
        Float res3 = testMaximum(1.1f, 2.2f, 9.9f);

        //UC3
        String result = testMaximum("Apple", "Peach", "Banana");
        System.out.println("Max String: " + result);
    }
}
