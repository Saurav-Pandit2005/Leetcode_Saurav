class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int idx = 0;
        // Even
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        // Odd
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 != 0) {
                ans[idx] = nums[i];
                idx++;
            }
        }
        return ans;
    }
}