class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;

        int num = n;

        while(n != 0) {
            int lastdigit = n%10;
            digitSum += lastdigit;
            digitProduct *= lastdigit;
            n/=10; 
        }

        return num % (digitSum + digitProduct) == 0;
    }
}