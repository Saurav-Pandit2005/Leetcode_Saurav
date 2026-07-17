class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n];

        int startRow = 0, endRow = n-1;
        int startColumn = 0, endColumn = n-1;

        int value = 1;

        while(startRow <= endRow && startColumn <= endColumn) {

            // Top
            for(int j=startColumn; j<=endColumn; j++) {
                result[startRow][j] = value;
                value++;
            }

            // Right
            for(int i=startRow+1; i<=endRow; i++) {
                result[i][endColumn] = value;
                value++;
            }

            // Bottom
            for(int j=endColumn-1; j>=startColumn; j--) {
                result[endRow][j] = value;
                value++;
            }

            // Left
            for(int i=endRow-1; i>=startRow+1; i--) {
                result[i][startColumn] = value;
                value++;
            }

            startRow++; endRow--;
            startColumn++; endColumn--;
        }
        return result;
    }
}