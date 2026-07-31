class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Using HashTable

        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> result = new ArrayList<>();
        // int n = nums.length;
        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for(int i=1; i<=n; i++) {
        //     if(!map.containsKey(i)) {
        //         result.add(i);
        //     }
        // }
        // return result;

        // Using Array
        
        boolean present[] = new boolean[nums.length+1];

        for(int num : nums) {
            present[num] = true;
        }

        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=nums.length; i++) {
            if(!present[i]) {
                result.add(i);
            }
        }
        return result;
    }
}