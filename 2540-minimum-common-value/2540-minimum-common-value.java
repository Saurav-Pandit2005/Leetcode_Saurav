class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        // 2 Pointer

        int i=0, j=0;
        int n = nums1.length, m = nums2.length;
        while(i<n && j<m) {
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;

        // Hashing

        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums2) {
        //     set.add(num);
        // }
        // for(int i=0; i<nums1.length; i++) {
        //     if(set.contains(nums1[i])) {
        //         return nums1[i];
        //     }
        // }
        // return -1;
    }
}