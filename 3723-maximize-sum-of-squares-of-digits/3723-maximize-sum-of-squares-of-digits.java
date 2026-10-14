class Solution {
    public String maxSumOfSquares(int num, int sum) {

        StringBuilder result = new StringBuilder();

        if(sum > num*9 || sum < 0) {
            return "";
        }

        int nines = sum/9;
        for(int i=0; i<nines; i++) {
            result.append('9');
        }

        int remainder = sum%9;
        if(remainder > 0) {
            result.append(remainder);
        }

        int remainLength = num - result.length();
        for(int i=0; i<remainLength; i++) {
            result.append('0');
        }

        return result.toString();
    }
}