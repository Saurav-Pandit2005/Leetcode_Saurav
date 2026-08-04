class Solution {
    public int singleNumber(int[] nums) {
        
        // Using Bit Manipulation

        int answer = 0;
        for(int i=0; i<nums.length; i++){
            answer ^= nums[i];
        }
        return answer;

        // Using HashMap

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for(int key : map.keySet()) {
        //     if(map.get(key) == 1) {
        //         return key;
        //     }
        // }

        // return -1;
    }
}