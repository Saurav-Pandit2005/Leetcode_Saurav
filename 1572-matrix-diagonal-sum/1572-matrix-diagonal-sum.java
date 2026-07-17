class Solution {
    public int diagonalSum(int[][] mat) {
        // Brute Force - O(n2)

        int sum = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                // Primary Diagonal - (i == j)
                if(i == j) sum+=mat[i][j];
                // Secondary Diagonal - (i + j = n-1)
                else if (i + j == mat.length-1) sum+=mat[i][j];
            }
        }
        return sum;
    }
}