class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Hashing

        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for(int single : map.keySet()) {
        //     if(map.get(single) == 1) return single;
        // }
        // return -1;

        // Linear Search

        // if(nums.length == 1) return nums[0];
        // if(nums[0] != nums[1]) return nums[0];
        // for(int i=1; i<nums.length-1; i++) {
        //     if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        // }
        // return nums[nums.length-1];

        // Binary Search

        int start = 0, end = nums.length-1;
        if(nums.length == 1) return nums[0];
        while(start <= end) {
            int mid = start + (end-start) / 2;
            // Edge Cases
            if(mid == 0 && nums[0] != nums[1]) return nums[mid];
            if(mid == nums.length-1 && nums[nums.length-1] != nums[nums.length-2]) return nums[mid];
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid + 1]) return nums[mid];
            if(mid % 2 == 0) {
                if(nums[mid] == nums[mid-1]) end = mid - 1;
                else start = mid + 1;
            } else  {
                if(nums[mid] == nums[mid-1]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}