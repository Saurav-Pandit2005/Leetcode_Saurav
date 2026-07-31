class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int idx = 0;
        for(int num : nums) {
            ans[idx++] = num;
        }
        for(int i=nums.length-1; i>=0; i--) {
            ans[idx++] = nums[i];
        } 
        return ans;
    }
}