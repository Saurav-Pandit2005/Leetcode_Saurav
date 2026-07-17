class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Brute Force - O(n^2)
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // StairCase Search - O(n + m)
        int row = 0, column = matrix[0].length-1;
        while(row < matrix.length && column >= 0) {
            if(matrix[row][column] == target) return true;
            else if (matrix[row][column] < target) row++;
            else column--; 
        }
        return false;
    }
}