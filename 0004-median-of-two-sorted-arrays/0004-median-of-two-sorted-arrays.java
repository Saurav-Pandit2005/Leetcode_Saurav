class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Using Array 
        int merged[] = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int n = merged.length;
        int mid = n/2;

        // Even Case
        if(merged.length % 2 == 0) {
            return (merged[mid-1] + merged[mid]) / 2.0;
        } // Odd Case
        else {
            return merged[mid];
        }
        
    }
}