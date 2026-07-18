class Solution {
    public int findGCD(int[] nums) {

        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }
        int gcd = 0; 
        for(int i=1; i<=smallest; i++) {
            if(largest % i == 0 && smallest % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;
    }
}