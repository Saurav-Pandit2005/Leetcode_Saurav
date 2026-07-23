class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int x2 = x, sum = 0;
        while(x2 > 0) {
            sum += x2%10;
            x2 /= 10;
            
        }
        if(x % sum == 0) return sum;
        return -1;
    }
}