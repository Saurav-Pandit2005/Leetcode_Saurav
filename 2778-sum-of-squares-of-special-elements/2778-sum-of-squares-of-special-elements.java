class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int result = 0;
        int idx = 1;
        for(int num : nums) {
            if(n % idx == 0) {
                result += num*num;
            }
            idx++;
        }
        return result;
    }
}