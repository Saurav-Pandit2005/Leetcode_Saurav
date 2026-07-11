class Solution {
    public int[] sortedSquares(int[] nums) {
        // int result[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++) {
        //     result[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(result);
        // return result;

        // 2 Pointer Apporch
        int result[] = new int[nums.length];
        int start = 0, end = nums.length-1, p = nums.length-1;
        while(start <= end) {
            int startsq = nums[start] * nums[start];
            int endsq = nums[end] * nums[end];

            if(startsq > endsq) {
                result[p] = startsq;
                start++;
            } else {
                result[p] = endsq;
                end--;
            }
            p--;
        }
        return result;
    }
}