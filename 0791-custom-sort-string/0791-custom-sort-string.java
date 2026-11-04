class Solution {
    public String customSortString(String order, String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<order.length(); i++) {
            char ch1 = order.charAt(i);
            if(map.containsKey(ch1)) {
                int frq = map.get(ch1);
                while(frq > 0) {
                    str.append(ch1);
                    frq--;
                }
                map.remove(ch1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int frq1 = entry.getValue();
            char ch2 = entry.getKey();
            while(frq1 > 0) {
                str.append(ch2);
                frq1--;
            }
        }
        return (str.toString());
    }
}