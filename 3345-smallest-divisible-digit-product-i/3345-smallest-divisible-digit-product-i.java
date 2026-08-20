class Solution {
    public int smallestNumber(int n, int t) {
        while(true) {
            int num = n;
            int product = 1;

            while(num > 0) {
                int lastdigit = num%10;
                product *= lastdigit;
                num /= 10;
            }

            if(product % t == 0) return n;
            n++;
        }
    }
}