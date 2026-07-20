class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i=0; i<nums.length; i++) {
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            for(int j=i; j<nums.length; j++) {
                largest = Math.max(largest, nums[j]);
                smallest = Math.min(smallest, nums[j]);
                sum += (largest - smallest);
            }
        }
        return sum;
    }
}