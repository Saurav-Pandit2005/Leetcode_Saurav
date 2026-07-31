class Solution {
    public int pivotInteger(int n) {
        // Using Array - O(n^2)
        
        for(int k=1; k<=n; k++) {
            int leftSum = 0, rightSum = 0;
            for(int i=1; i<=k; i++) {
                leftSum += i;
            }
            for(int j=n; j>=k; j--) {
                rightSum += j;
            }
            if(leftSum == rightSum) return k;
        }
        return -1;
    }
}