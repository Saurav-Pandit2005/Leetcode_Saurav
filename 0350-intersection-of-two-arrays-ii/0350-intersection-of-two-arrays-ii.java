class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                ans.add(nums2[i]);
                int currentCount = map.get(nums2[i]);
                if(currentCount > 1) {
                    map.put(nums2[i] , currentCount -1);
                } else {
                    map.remove(nums2[i]);
                }
            }
        }

        int result[] = new int[ans.size()];
        int j = 0;
        for(int om : ans) {
            result[j++] = om;
        }
        
        return result;
    }    
}