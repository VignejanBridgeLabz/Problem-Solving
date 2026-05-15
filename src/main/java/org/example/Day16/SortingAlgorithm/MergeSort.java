package org.example.Day16.SortingAlgorithm;

public class MergeSort {

    // Merge function
    static void merge(int[] arr, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for(int i = 0; i < n1; i++){

            leftArray[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++){

            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge two arrays
        while(i < n1 && j < n2){

            if(leftArray[i] <= rightArray[j]){

                arr[k] = leftArray[i];
                i++;
            }

            else{

                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements
        while(i < n1){

            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){

            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Merge Sort function
    static void mergeSort(int[] arr, int left, int right){

        if(left < right){

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] prices = {450,200,150,600,300};

        System.out.println("Before Sorting:");

        for(int price : prices){

            System.out.print(price + " ");
        }

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter Sorting:");

        for(int price : prices){

            System.out.print(price + " ");
        }
    }
}