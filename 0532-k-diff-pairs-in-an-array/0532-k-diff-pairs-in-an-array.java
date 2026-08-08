class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(k != 0) {
                int add = key + k;
                if(map.containsKey(add)) count++;
            } else {
                if(map.get(key) >= 2) count++;
            }
        }

        return count;
    }
}