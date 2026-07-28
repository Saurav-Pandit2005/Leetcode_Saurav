class Solution {
    public int sumOfPrimesInRange(int n) {
        int x = n;
        int r = 0;
        while(x != 0) {
            int lastdigit = x%10;
            r = r * 10 + lastdigit;
            x/=10;
        }

        int min = Math.min(n, r);
        int max = Math.max(n, r);

        int sum = 0;
        for(int i=min; i<=max; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}