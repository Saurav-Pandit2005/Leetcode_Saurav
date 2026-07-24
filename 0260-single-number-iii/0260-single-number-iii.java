class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int single : map.keySet()) {
            if(map.get(single) == 1) {
                ans.add(single);
            }
        }
        
        int result[] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}