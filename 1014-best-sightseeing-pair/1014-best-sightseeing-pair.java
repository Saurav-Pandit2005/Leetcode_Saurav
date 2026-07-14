class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // O(n2) = >TLE
        // int maxScore = 0;
        // for(int i=0; i<values.length; i++) {
        //     for(int j=i+1; j<values.length; j++) {
        //         int score = (values[i] + i) + (values[j] - j);
        //         maxScore = Math.max(maxScore, score);
        //     }
        // }
        // return maxScore;

        int best = values[0] + 0;
        int ans = 0;
        for(int j=1; j<values.length; j++) {
            ans = Math.max(ans, best + values[j] - j);
            best = Math.max(best, values[j] + j);
        }
        return ans;
    }
}