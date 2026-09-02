class Solution {
    public boolean isPerfectSquare(int num) {

        // Binary Search

        if (num < 0) return false;
        if (num == 0 || num == 1) return true;

        long start = 1, end = num;
        while(start <= end) {
            long mid = start + (end-start)/2;
            long sq = mid*mid;

            if(sq == num) {
                return true;
            } else if(sq>num) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;

        // Maths Apporch
        
        // long oddNumber = 1;
        // long sum = 1;

        // while (sum <= num) {
        //     if (sum == num) return true;
        //     oddNumber+=2;
        //     sum+=oddNumber;
        // }
        // return false;
    }
}