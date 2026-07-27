class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Using HashTable

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // ArrayList<Integer> result = new ArrayList<>();
        // for(int key : map.keySet()) {
        //     if(map.get(key) == 2) {
        //         result.add(key);
        //     }
        // }
        // return result;

        // Using Sorting

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 1) return result;
        if(nums[0] == nums[1]) result.add(nums[0]);
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}