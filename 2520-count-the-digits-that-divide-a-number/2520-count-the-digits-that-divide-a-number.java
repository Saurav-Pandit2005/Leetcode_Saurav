class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while(n > 0) { 
            int lastdigit = n % 10;
            if(lastdigit != 0 && num % lastdigit == 0) count++;
            n /= 10;
        }
        return count;
    }
}