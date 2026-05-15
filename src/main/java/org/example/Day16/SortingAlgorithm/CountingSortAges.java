package org.example.Day16.SortingAlgorithm;

public class CountingSortAges {

    static void countingSort(int[] arr){

        int max = 18;

        int[] count = new int[max + 1];

        // Store frequency
        for(int num : arr){
            count[num]++;
        }

        // Cumulative count
        for(int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }


        int[] output = new int[arr.length];

        // Place elements in correct position
        for(int i = arr.length - 1; i >= 0; i--){

            output[count[arr[i]] - 1] = arr[i];

            count[arr[i]]--;
        }
        // Copy back to original array
        for(int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] ages = {15,12,10,18,15,11,12};

        System.out.println("Before Sorting:");

        for(int age : ages){
            System.out.print(age + " ");
        }

        countingSort(ages);

        System.out.println("\nAfter Sorting:");

        for(int age : ages){
            System.out.print(age + " ");
        }
    }
}
