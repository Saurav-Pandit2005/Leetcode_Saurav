class Solution {
    public int missingNumber(int[] nums) {

        // for(int i=0; i<=nums.length; i++) {
        //     int flag = 0;
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[j] == i) {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0) {
        //         return i;
        //     }
        // }
        // return -1;

        // Using Maths

        int n = nums.length;
        int sum = 0;
        int totalSum = n*(n+1) / 2;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        return totalSum - sum;
    }
}