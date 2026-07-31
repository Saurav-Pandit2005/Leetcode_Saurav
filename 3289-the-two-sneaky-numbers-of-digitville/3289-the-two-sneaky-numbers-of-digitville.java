class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(); 

        for(int key : map.keySet()) {
            if(map.get(key) == 2) {
                list.add(key);
            }
        }

        int result[] = new int[list.size()];
        int idx = 0;
        for(int num : list) {
            result[idx++] = num;
        }

        return result;
    }
}