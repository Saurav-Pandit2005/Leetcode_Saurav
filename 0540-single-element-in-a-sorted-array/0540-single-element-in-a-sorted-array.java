class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int single : map.keySet()) {
            if(map.get(single) == 1) return single;
        }
        return -1;
    }
}