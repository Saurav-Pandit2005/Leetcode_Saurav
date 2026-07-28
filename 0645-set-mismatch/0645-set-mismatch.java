class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Repeted Value

        for(int key : map.keySet()) {
            if(map.get(key) == 2) {
                result.add(key);
            }
        }
        
        // Missing Value

        for(int i=1; i<=nums.length; i++) {
            if(!map.containsKey(i)) {
                result.add(i);
            }
        }
        
        int ans[] = new int[result.size()];
        int i = 0;
        for(int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
}