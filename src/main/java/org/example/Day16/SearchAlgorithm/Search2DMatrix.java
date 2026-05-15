package org.example.Day16.SearchAlgorithm;

public class Search2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;
        while(left <= right){
            int mid = (left + right) / 2;

            // Convert into row and column
            int row = mid / cols;
            int col = mid % cols;

            int value = matrix[row][col];
            // Target found
            if(value == target){

                return true;
            }
            // Search left half
            else if(target < value){
                right = mid - 1;
            }
            // Search right half
            else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target = 16;
        boolean found = searchMatrix(matrix, target);
        System.out.println(found);
    }
}
