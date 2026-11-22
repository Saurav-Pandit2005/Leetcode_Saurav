class Solution {
    public boolean checkString(String s) {
        boolean ans = false;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'b') {
                ans = true;
            } else if(ch == 'a' && ans) {
                return false;
            }
        }
        return true;
    }
}