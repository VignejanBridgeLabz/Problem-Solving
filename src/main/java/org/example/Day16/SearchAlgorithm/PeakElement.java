package org.example.Day16.SearchAlgorithm;

public class PeakElement {
    static int findPeak(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){

            int mid = (left + right) / 2;

            // Check left neighbor
            boolean leftSmaller = (mid == 0)||(arr[mid] > arr[mid - 1]);

            // Check right neighbor
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // Peak found
            if(leftSmaller && rightSmaller){
                return mid;
            }
            // Search left half
            else if(mid > 0 &&
                    arr[mid] < arr[mid - 1]){

                right = mid - 1;
            }
            // Search right half
            else{

                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1,0};
        int peakIndex = findPeak(arr);
        System.out.println("Peak Element: " + arr[peakIndex]);
        System.out.println("Peak Index: " + peakIndex);
    }
}
