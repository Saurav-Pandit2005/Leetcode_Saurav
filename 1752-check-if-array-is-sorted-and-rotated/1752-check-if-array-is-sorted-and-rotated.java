class Solution {
    public boolean check(int[] nums) {
        int idx = -1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                if(idx == -1) idx = i;
                else return false;
            }
        }
        if(idx == -1) return true;
        if(nums[0] >= nums[nums.length-1]) return true;
        return false;
    }
}