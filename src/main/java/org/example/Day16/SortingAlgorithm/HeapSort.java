package org.example.Day16.SortingAlgorithm;

public class HeapSort {
    public class HeapSortSalary {
        // Heapify function
        static void heapify(int[] arr, int n, int i){
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            // Check left child
            if(left < n && arr[left] > arr[largest]){
                largest = left;
            }
            // Check right child
            if(right < n && arr[right] > arr[largest]){

                largest = right;
            }
            // Swap if root is not largest
            if(largest != i){
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                // Heapify affected subtree
                heapify(arr, n, largest);
            }
        }
        // Heap Sort function
        static void heapSort(int[] arr){
            int n = arr.length;
            // Build Max Heap
            for(int i = n / 2 - 1; i >= 0; i--){
                heapify(arr, n, i);
            }

            for(int i = n - 1; i > 0; i--){
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
            }
        }

        public static void main(String[] args) {
            int[] salaries = {45000,30000,60000,25000,50000};
            System.out.println("Before Sorting:");

            for(int salary : salaries){
                System.out.print(salary + " ");
            }

            heapSort(salaries);

            System.out.println("\nAfter Sorting:");

            for(int salary : salaries){
                System.out.print(salary + " ");
            }
        }
    }
}
