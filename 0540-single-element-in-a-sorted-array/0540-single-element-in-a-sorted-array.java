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
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
}