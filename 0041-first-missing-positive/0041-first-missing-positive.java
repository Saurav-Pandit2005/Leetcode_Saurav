class Solution {
    public int firstMissingPositive(int[] nums) {
        // Using HashSet    -> TC - O(n)     -> SC - O(n)

        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums) {
        //     set.add(num);
        // }

        // int n = nums.length+1; 

        // for(int i=1; i<=n; i++) {
        //     if(!set.contains(i)) {
        //         return i;
        //     }
        // }
        // return -1;

        // Using pige on hole Principal     -> TC - O(n)        -> SC = O(1)

        // data filtering

        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(nums[i] <= 0 || nums[i] >= (n+1)) {
                nums[i] = n+1;
            }
        }

        // mark visited

        for(int i=0; i<n; i++) {
            int element = Math.abs(nums[i]);
            if(element == n+1) {
                continue;
            }
            int seat = element - 1;
            if(nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }

        // find first positive value

        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                return i+1;
            }
        }

        return n+1;
    }
}