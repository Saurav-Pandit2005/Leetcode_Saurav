class Solution {
    public long sumAndMultiply(int n) {
        // String s = Integer.toString(n);
        // long sum = 0, x = 0;
        // for(int i=0; i<s.length(); i++) {
        //     int digit = s.charAt(i)-'0';
        //     if(digit != 0) {
        //         sum += digit;
        //         x = x*10 + digit;
        //     }
        // }
        // return x * sum;

        // Using Maths
        long sum = 0, num = 0; 
        long i = 0;
        while(n > 0) {
            int rem = n%10;
            if(rem != 0) {
                sum += rem;
                num += (Math.pow(10,i) * rem);
                i++;
            }
            n/=10;
        }
        return sum * num;

    }
}