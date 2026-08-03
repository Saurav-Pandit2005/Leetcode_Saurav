class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int Vmax = 0;
        int Cmax = 0;

        for(Character ch : map.keySet()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Vmax = Math.max(Vmax, map.get(ch));
            } else {
                Cmax = Math.max(Cmax, map.get(ch));
            }
        }

        return Vmax + Cmax;
    }
}