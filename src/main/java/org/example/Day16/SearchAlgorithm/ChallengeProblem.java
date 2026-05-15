package org.example.Day16.SearchAlgorithm;

import java.util.Arrays;

public class ChallengeProblem {

    // Find first missing positive integer
    static int firstMissingPositive(int[] arr){
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];
        // Mark visited numbers
        for(int num : arr){
            if(num > 0 && num <= n){
                visited[num] = true;
            }
        }
        // Find missing number
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                return i;
            }
        }
        return n + 1;
    }
    // Binary Search
    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        // Part 1
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);
        // Sort array for Binary Search
        Arrays.sort(arr);
        int target = 3;
        // Part 2
        int index = binarySearch(arr, target);
        System.out.println("Target Index: " + index);
    }
}