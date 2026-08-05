class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> res = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++) {
            map.put(list1[i], i);
        } 

        for(int i=0; i<list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if(sum < minSum) {
                    minSum = sum;
                    res.clear();
                    res.add(list2[i]);
                } 
                else if(sum == minSum) {
                    res.add(list2[i]);
                }
            }
        }

        String ans[] = new String[res.size()];
        
        for(int i=0; i<res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}