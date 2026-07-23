class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int num : nums) {
            if(num == 0) return 0;
            sign *= Long.signum(num);
        }
        return sign; 
    }
}