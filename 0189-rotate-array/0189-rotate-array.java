class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;                    // if k>n
        reverse(nums, 0, n-1);      // reverse whole array element
        reverse(nums, 0, k-1);      // reverse 0 to k element
        reverse(nums, k, n-1);      // reverse k to n element
    }
    public void reverse (int[] nums, int start, int end) {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end]; 
            nums[end] = temp;
            start++; end--;
        }
    }
}