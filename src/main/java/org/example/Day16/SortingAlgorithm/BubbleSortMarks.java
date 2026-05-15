package org.example.Day16.SortingAlgorithm;

public class BubbleSortMarks {
    static void bubbleSort(int[] marks){
        int n = marks.length;
        // Number of passes
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            // Compare adjacent elements
            for(int j = 0; j < n - 1 - i; j++){
                if(marks[j] > marks[j + 1]){
                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swap occurs, array is sorted
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {78,45,90,32,67};
        System.out.println("Before Sorting:");
        for(int mark : marks){
            System.out.print(mark + " ");
        }
        bubbleSort(marks);
        System.out.println("\nAfter Sorting:");
        for(int mark : marks){
            System.out.print(mark + " ");
        }
    }
}
