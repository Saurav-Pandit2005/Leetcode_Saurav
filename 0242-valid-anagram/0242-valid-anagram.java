class Solution {
    public boolean isAnagram(String s, String t) {
        // Using Sorting

        // if(s.length() != t.length()) return false;

        // char[] sarray = s.toCharArray();
        // char[] tarray = t.toCharArray();

        // Arrays.sort(sarray);
        // Arrays.sort(tarray);

        // return Arrays.equals(sarray, tarray); 

        // Using Hashing

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) map.remove(ch);
                else map.put(ch, map.get(ch)-1);
            } else return false;
        }
        return map.isEmpty();
    }
}