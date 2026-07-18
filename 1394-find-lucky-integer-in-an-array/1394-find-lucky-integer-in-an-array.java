class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i] , 1);
            }
        }

        int largest = -1;
        for(int num : map.keySet()) {
            if(num == map.get(num)) {
                largest = Math.max(largest, num);
            }
        }
        return largest;
    }
}