class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(Integer num : nums1) {
            set.add(num);
        }

        for(Integer num : nums2) {
            if(set.contains(num)) {
                result.add(num);
            }
        }

        int[] output = new int[result.size()];
        int idx = 0;

        for(Integer num : result) {
            output[idx++] = num;
        }
        return output;
    }
}