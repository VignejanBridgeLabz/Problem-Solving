package org.example.Day16.SortingAlgorithm;

public class QuickSortProducts {
    // Partition method
    static int partition(int[] arr, int low, int high){
        // Choose last element as pivot
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            // Smaller element goes left side
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort method
    static void quickSort(int[] arr, int low, int high){

        if(low < high){


            int pivotIndex = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] prices = {450, 200, 150, 600, 300};

        System.out.println("Before Sorting:");

        for(int price : prices){

            System.out.print(price + " ");
        }


        quickSort(prices, 0, prices.length - 1);
        System.out.println("\nAfter Sorting:");
        for(int price : prices){

            System.out.print(price + " ");
        }
    }
}