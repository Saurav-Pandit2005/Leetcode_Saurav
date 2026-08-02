class Solution {
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();
    }

    public int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n /= 10;
        }
        return rev;
    }
}