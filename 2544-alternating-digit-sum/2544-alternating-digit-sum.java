class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        int countDigit = 0;
        while(n != 0) {
            int digit = n%10;
            sum += digit * sign;
            sign = -sign;
            n /= 10;
            countDigit++;
        }
        if(countDigit % 2 == 0) return -sum;
        return sum;
    }
}