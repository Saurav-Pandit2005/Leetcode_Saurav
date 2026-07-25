class Solution {
    public int maxProduct(int n) {
        // Using Array

        // int[] nums = Integer.toString(n).chars().map(c -> c - '0').toArray();
        // int maxproduct = 1;
        // for(int i=0; i<nums.length; i++) {
        //     maxproduct = Math.max(maxproduct, (maxproduct * nums[i]));
        // }
        // return maxproduct;

        // Using Math

        int a = 0, b = 0;
        while(n != 0) {
            int x = n%10;
            if(x > a) {
                b = a;
                a = x;
            } else if(x > b) b = x;
            n /= 10;
        }
        return a * b;
    }
}