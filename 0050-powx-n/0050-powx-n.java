class Solution {
    public double myPow(double x, long n) {
        // long binary = n;

        // if(n < 0){
        //     x = 1/x;
        //     binary = -binary;
        // }
        // double answer = 1;


        // while(binary > 0){
        //     if(binary % 2 == 1){
        //         answer *= x;
        //     }
        //     x *= x;
        //     binary /= 2;
        // }
        // return answer;
        
        // Using Recursion
        if(n < 0) return 1.0 / myPow(x, -n);
        if(n == 0) return 1;
        double halfPower = myPow(x, n/2);
        // if n is even
        double halfPowerSquare = halfPower * halfPower;
        // if n is odd
        if(n % 2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }
}