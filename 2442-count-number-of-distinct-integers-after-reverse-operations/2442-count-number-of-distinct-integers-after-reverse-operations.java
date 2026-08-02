class Solution {
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            set.add(num);

            // for reverse number

            int rev = 0;
            int temp = num;
            while(temp > 0) {
                int lastdigit = temp%10;
                rev = rev * 10 + lastdigit;
                temp/=10;
            }
            set.add(rev);
        }

        return set.size();
    }
}