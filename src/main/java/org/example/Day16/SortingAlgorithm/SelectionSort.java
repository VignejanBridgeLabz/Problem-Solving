package org.example.Day16.SortingAlgorithm;

public class SelectionSort {

    static void selectionSort(int[] scores){
          int n = scores.length;
            // Traverse array
            for(int i = 0; i < n - 1; i++){
                // Assume current index has minimum
                int minIndex = i;
                // Find actual minimum element
                for(int j = i + 1; j < n; j++){
                    if(scores[j] < scores[minIndex]){
                        minIndex = j;
                    }
                }
                // Swap minimum element with current element
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }

        public static void main(String[] args) {

            int[] scores = {78,45,90,32,67};

            System.out.println("Before Sorting:");

            for(int score : scores){
                System.out.print(score + " ");
            }

            selectionSort(scores);

            System.out.println("\nAfter Sorting:");

            for(int score : scores){
                System.out.print(score + " ");
            }
        }

}
