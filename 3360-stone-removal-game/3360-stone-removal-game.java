class Solution {
    public boolean canAliceWin(int n) {
        int firstTurn = 10;
        boolean ans = true;
        while(n >= firstTurn) {
            n -= firstTurn;
            firstTurn--;
            ans =! ans;
        }
        return ans == false;
    }
}