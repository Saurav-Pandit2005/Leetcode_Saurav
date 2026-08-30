class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int secondmax = -1;
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                secondmax = max;
                max = nums[i];
                maxIdx = i;
            }
            else if(nums[i] > secondmax) {
                secondmax = nums[i];
            }
        }
        if(max >= 2 * secondmax) return maxIdx;
        return -1; 
    }
}