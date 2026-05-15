package org.example.Day16.SearchAlgorithm;

public class RotationPointFinder {

    static int findRotationPoint(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int mid = (left + right) / 2;

            // Smallest element is in right half
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }
            else{    // Smallest element is in left half
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }
}
