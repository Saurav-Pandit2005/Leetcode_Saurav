class Solution {
    public long splitArray(int[] nums) {
        long sumA = 0;
        long sumB = 0;
        for(int i=0; i<nums.length; i++) {
            if(isPrime(i)) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }
        long ans = Math.abs(sumA - sumB);
        return ans;
    }
    
    boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i=2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}