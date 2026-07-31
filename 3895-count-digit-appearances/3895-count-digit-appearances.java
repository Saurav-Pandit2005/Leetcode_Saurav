class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            count = isDigit(nums[i], digit, count);
        }
        return count;
    }

    public int isDigit(int num, int digit, int count) {

        if (num == 0 && digit == 0) {
            return count + 1;
        }
        
        while(num != 0) {
            int lastdigit = num % 10;
            if(lastdigit == digit) count++;
            num /= 10;
        }
        return count;
    }
}