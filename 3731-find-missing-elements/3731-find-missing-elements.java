class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=smallest; i<=largest; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
}