class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int num : nums) {
            min = Math.min(min, num);
        }
        int result = 0;
        for(int i : nums) {
            result += i - min;
        }
        return result;
    }
}