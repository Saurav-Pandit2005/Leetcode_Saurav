class Solution {
    public int differenceOfSums(int n, int m) {
        int notDivSum = 0, DivSum = 0;
        for(int i=1; i<=n; i++) {
            if(i % m == 0) {
                DivSum += i;
            } else if(i % m != 0) {
                notDivSum += i;
            }
        }
        return notDivSum - DivSum;
    }
}