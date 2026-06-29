class Solution {
    public boolean isPalindrome(int x) {
        int num = x, reverse = 0;
        if(x < 0) return false;
        while (x != 0) {
            int lastdigit = x%10;
            reverse = reverse * 10 + lastdigit;
            x/=10;
        }
        return reverse == num;
    }
}