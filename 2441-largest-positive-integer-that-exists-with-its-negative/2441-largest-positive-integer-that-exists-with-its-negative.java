class Solution {
    public int findMaxK(int[] nums) {
        int maxPos = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(key > maxPos && map.containsKey(-key)) {
                maxPos = key;
            }
        }
        return maxPos;
    }
}