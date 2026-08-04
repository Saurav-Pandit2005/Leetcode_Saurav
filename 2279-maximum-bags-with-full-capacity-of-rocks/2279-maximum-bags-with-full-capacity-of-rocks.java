class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        List<Integer> diff = new ArrayList<>();

        for(int i=0; i<rocks.length; i++) {
            diff.add(capacity[i] - rocks[i]);
        }

        Collections.sort(diff);

        int count = 0;

        for(int i=0; i<diff.size(); i++) {
            if(diff.get(i) <= additionalRocks) {
                additionalRocks = additionalRocks - diff.get(i);
                count++;
            }
        }

        return count;
    }
}