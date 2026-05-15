package org.example.Day16.SearchAlgorithm;

public class RotationPoint {
static int findRotationPoint(int[] arr){

    int left = 0;
    int right = arr.length - 1;

    while(left < right){

        int mid = (left + right) / 2;
        // Smallest element in right half
        if(arr[mid] > arr[right]){
            left = mid + 1;
        } // Smallest element in left half
        else{
            right = mid;
        }
    }
    return left;
}
public static void main(String[] args) {
    int[] arr = {2,4,8,3,1,6,9,7};
    int index = findRotationPoint(arr);
    System.out.println("Rotation Point Index: " + index);
    System.out.println("Smallest Element: " + arr[index]);
}
}
