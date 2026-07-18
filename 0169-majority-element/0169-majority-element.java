class Solution {
    public int majorityElement(int[] nums) {
        // Using Hashing

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) +1);
        // }

        // for(int freq : map.keySet()) {
        //     if(map.get(freq) > nums.length/2) return freq;
        // }
        // return -1;

        // 2. Using Sorting

        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // 3. Using Array - Moore Voting Algorithm

        int freq = 0, ans = 0;
        for(int i=0; i<nums.length; i++) {
            if(freq == 0) ans = nums[i];
            if(ans == nums[i]) freq++;
            else freq--;
        }
        return ans;
    }
}