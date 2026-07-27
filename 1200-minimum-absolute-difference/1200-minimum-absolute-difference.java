class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i++) {
            minDiff = Math.min(minDiff, nums[i+1] - nums[i]);
        }

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i+1] - nums[i] == minDiff) {
                result.add(Arrays.asList(nums[i], nums[i+1]));
            }
        }
        return result;
    }
}