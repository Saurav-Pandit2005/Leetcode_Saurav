class Solution {
    public int firstMissingPositive(int[] nums) {
        // Using HashSet    -> TC - O(n)     -> SC - O(n)

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int n = nums.length+1; 

        for(int i=1; i<=n; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}