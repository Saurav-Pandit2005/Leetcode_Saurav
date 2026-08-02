class Solution {
    public int hammingWeight(int n) {
        // Using InBuilt Class

        // int count = Integer.bitCount(n);
        // return count;

        // Using Shift Operator

        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {     // Check LSB
                count++;
            } 
            n = n>>1;
        }
        return count;
    }
}