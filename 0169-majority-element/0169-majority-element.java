class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) +1);
        // }

        // for(int freq : map.keySet()) {
        //     if(map.get(freq) > nums.length/2) return freq;
        // }
        // return -1;

        // Using Sorting
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}