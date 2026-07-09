class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++) {
        //     int difference = target - nums[i];
        //     if(map.containsKey(difference)) {
        //         return new int[] {map.get(difference), i};
        //     } else map.put(nums[i], i);
        // }
        // return null;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}