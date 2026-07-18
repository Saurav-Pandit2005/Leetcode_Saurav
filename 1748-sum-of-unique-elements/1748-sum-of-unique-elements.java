class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }

        int sum = 0;
        for(int freq : map.keySet()) {
            if(map.get(freq) == 1) {
                sum+=freq;
            }
        }
        return sum;
    }
}