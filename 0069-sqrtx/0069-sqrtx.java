class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        int start = 1, end = x;
        while(start <= end) {
            int mid = start+(end-start)/2;
            long square = (long) mid*mid;
            if(x == square) return mid;
            if(x < square) end = mid-1;
            else start = mid+1;
        } 
        return end;
    }
}