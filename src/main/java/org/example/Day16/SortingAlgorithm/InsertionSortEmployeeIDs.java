package org.example.Day16.SortingAlgorithm;

public class InsertionSortEmployeeIDs {
    static void insertionSort(int[] ids){
        int n = ids.length;
        for(int i = 1; i < n; i++){
            int key = ids[i];
            int j = i - 1;
            // Shift larger elements
            while(j >= 0 && ids[j] > key){
                ids[j + 1] = ids[j];
                j--;
            }
            // Insert key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {105,102,108,101,104};
        System.out.println("Before Sorting:");
        for(int id : ids){
            System.out.print(id + " ");
        }

        insertionSort(ids);

        System.out.println("\nAfter Sorting:");

        for(int id : ids){
            System.out.print(id + " ");
        }
    }
}