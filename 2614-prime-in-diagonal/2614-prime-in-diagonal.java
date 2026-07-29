class Solution {
    public int diagonalPrime(int[][] nums) {
        int largest = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            // Primary Diagonal
            int primary = nums[i][i];
            if(isPrime(primary)) {
                largest = Math.max(largest, primary);
            }
            // Secondry Diagonal
            int secondry = nums[i][n-1-i];
            if(isPrime(secondry)) {
                largest = Math.max(largest, secondry);
            }
        }
        return largest;
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}