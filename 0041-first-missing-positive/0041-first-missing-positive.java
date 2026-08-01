class Solution {
    public int firstMissingPositive(int[] nums) {
        // Using HashMap    -> TC - O(n)     -> SC - O(n)
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length; 

        for(int i=1; i<=n; i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }
        return n+1;
    }
}