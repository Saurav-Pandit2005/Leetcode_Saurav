class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // TC = O(n)       SC = O(n) -> Using Extra Space

        List<Integer> less = new ArrayList<>();
        for(int num : nums) {
            if(num < pivot) {
                less.add(num);
            }
        }

        List<Integer> equ = new ArrayList<>();
        for(int num : nums) {
            if(num == pivot) {
                equ.add(num);
            }
        }

        List<Integer> gre = new ArrayList<>();
        for(int num : nums) {
            if(num > pivot) {
                gre.add(num);
            }
        }

        int ans[] = new int[nums.length];
        int idx = 0;
        for(int num : less) {
            ans[idx++] = num;
        }

        for(int num : equ) {
            ans[idx++] = num;
        }

        for(int num : gre) {
            ans[idx++] = num;
        }

        return ans;
    }
}