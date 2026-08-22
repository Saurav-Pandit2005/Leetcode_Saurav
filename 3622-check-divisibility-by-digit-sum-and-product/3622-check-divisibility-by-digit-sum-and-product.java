class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitPro = 1;

        int num = n;

        while(n != 0) {
            int lastdigit = n%10;
            digitSum += lastdigit;
            digitPro *= lastdigit;
            n/=10; 
        }

        int ans = digitSum + digitPro;

        return num%ans == 0;
    }
}