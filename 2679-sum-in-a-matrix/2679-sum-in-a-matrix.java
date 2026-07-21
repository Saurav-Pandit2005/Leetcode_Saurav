class Solution {
    public int matrixSum(int[][] nums) {
        int result = 0;
        for(int[] row : nums) {
            Arrays.sort(row);
        }

        for(int j=0; j<nums[0].length; j++) {
            int maxElement = 0;
            for(int i=0; i<nums.length; i++) {
                maxElement = Math.max(maxElement, nums[i][j]);
            }
            result += maxElement;
        } 
        return result;
    }
}