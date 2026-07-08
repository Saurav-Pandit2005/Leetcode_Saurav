class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int sqrSum = 0;
            while(n != 0) {
                int reminder = n%10;
                sqrSum += reminder * reminder;
                n /= 10;
            }
            if(sqrSum == 1) return true;
            else n = sqrSum; 
        }
        return false;
    }
}