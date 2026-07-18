class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0], largest = nums[nums.length-1];
        int gcd = 0;
        for(int i=1; i<=smallest; i++) {
            if(largest % i == 0 && smallest % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;
    }
}