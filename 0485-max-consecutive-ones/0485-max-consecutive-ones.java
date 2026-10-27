class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int n : nums) {
            if(n == 1) {
                count++;
                if(maxCount < count) maxCount = count;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}