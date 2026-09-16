class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        int i = 0;
        while (i < n){
            StringBuilder word = new StringBuilder();

            while(i < n && reversed.charAt(i) != ' ') {
                word.append(reversed.charAt(i));
                i++;
            }

            word.reverse();

            if(word.length() > 0) {
                ans.append(" ").append(word);
            }
            i++;
        }
        return ans.substring(1);
    }
}