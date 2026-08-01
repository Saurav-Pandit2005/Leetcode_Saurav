class Solution {
    public int[] transformArray(int[] nums) {
        // Using Sorting    -   O(n log n)

        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] % 2 == 0) nums[i] = 0;
        //     else nums[i] = 1;
        // }
        // Arrays.sort(nums);

        // return nums;


        // using Array - O(n)

        int even = 0;

        for(int num : nums) {
            if(num % 2 == 0) {
                even++;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(i < even) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        return nums;
    }
}