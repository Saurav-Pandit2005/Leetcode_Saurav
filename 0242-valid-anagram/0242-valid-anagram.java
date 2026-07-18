class Solution {
    public boolean isAnagram(String s, String t) {
        // Using Sorting

        if(s.length() != t.length()) return false;

        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();

        Arrays.sort(sarray);
        Arrays.sort(tarray);

        return Arrays.equals(sarray, tarray); 
    }
}