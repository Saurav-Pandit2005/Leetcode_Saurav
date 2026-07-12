class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int result[] = new int[nums.length];
        for(int num : nums) {
            if(num != 0) {
                result[count] = num;
                count++;
            }
        }
        for(int i=0; i<result.length; i++) {
            nums[i] = result[i];
        }
    }
}