package org.example.Day16.SearchAlgorithm;

public class LinearSearch {

        static int linearSearch(int[] arr, int target){

            for(int i = 0; i < arr.length; i++){

                if(arr[i] == target){
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            int[] arr = {10,20,30,40,50};

            int index = linearSearch(arr, 40);

            System.out.println("Found at index: " + index);
        }

}
