class Solution {
    public boolean isPowerOfTwo(int n) {
        // Using Array

        // if(n == 0) return false;
        // while(n != 1) {
        //     if(n%2 != 0) return false;
        //     else n = n/2;
        // }
        // return true;

        // Using Bit Manipulation

        return n > 0 && ((n&(n-1)) == 0);
    }
}