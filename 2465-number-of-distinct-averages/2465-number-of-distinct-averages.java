class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left < right) {
            set.add(nums[left] + nums[right]);
            left++; right--;
        }
        return set.size();
    }
}