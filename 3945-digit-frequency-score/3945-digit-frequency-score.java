class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = n; 
        while(num != 0) {
            int lastdigit = num % 10;
            map.put(lastdigit, map.getOrDefault(lastdigit, 0) + 1);
            num /= 10;
        }

        int ans = 0, k;
        for(int key : map.keySet()) {
            k = map.get(key);
            ans += (key * k);
        }
        return ans;
    }
}