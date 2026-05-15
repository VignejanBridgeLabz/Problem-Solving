package org.example.Day16.SearchAlgorithm;

public class FirstLastOccurrence {
    // Find first occurrence
    static int findFirst(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                answer = mid;
                // Continue searching left side
                right = mid - 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return answer;
    }
    // Find last occurrence
    static int findLast(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                answer = mid;
                // Continue searching right side
                left = mid + 1;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}