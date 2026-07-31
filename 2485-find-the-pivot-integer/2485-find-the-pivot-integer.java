class Solution {
    public int pivotInteger(int n) {
        // Using Array - O(n^2)

        // for(int k=1; k<=n; k++) {
        //     int leftSum = 0, rightSum = 0;
        //     for(int i=1; i<=k; i++) {
        //         leftSum += i;
        //     }
        //     for(int j=n; j>=k; j--) {
        //         rightSum += j;
        //     }
        //     if(leftSum == rightSum) return k;
        // }
        // return -1;

        // Using Array - O(n)

        // int leftSum = 0;
        // int rightSum = n*(n+1)/2;

        // for(int k=1; k<=n; k++) {
        //     leftSum += k;
        //     rightSum -= (k-1);
        //     if(leftSum == rightSum) return k;
        // }
        // return -1;

        // Using Math

        int cumSum = n*(n+1)/2;
        int pivot = (int) Math.sqrt(cumSum);
        return (pivot * pivot == cumSum) ? pivot : -1;
    }
}