class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // TC = O(n)       SC = O(n) -> Using Extra Space

        // List<Integer> less = new ArrayList<>();
        // for(int num : nums) {
        //     if(num < pivot) {
        //         less.add(num);
        //     }
        // }

        // List<Integer> equ = new ArrayList<>();
        // for(int num : nums) {
        //     if(num == pivot) {
        //         equ.add(num);
        //     }
        // }

        // List<Integer> gre = new ArrayList<>();
        // for(int num : nums) {
        //     if(num > pivot) {
        //         gre.add(num);
        //     }
        // }

        // int ans[] = new int[nums.length];
        // int idx = 0;
        // for(int num : less) {
        //     ans[idx++] = num;
        // }

        // for(int num : equ) {
        //     ans[idx++] = num;
        // }

        // for(int num : gre) {
        //     ans[idx++] = num;
        // }

        // return ans;


        // TC = O(n)        SC = O(1) -> Ignore Extra Space

        int lCount = 0;
        int gCount = 0;
        int pCount = 0;

        for(int num : nums) {
            if(num < pivot) lCount++;
            else if(num > pivot) gCount++;
            else pCount++;
        }

        int i = 0;
        int j = lCount;
        int k = lCount + pCount;

        int result[] = new int[nums.length];

        for(int num : nums) {
            if(num < pivot) {
                result[i] = num;
                i++;
            }
            else if(num > pivot) {
                result[k] = num;
                k++;
            }
            else {
                result[j] = num;
                j++;
            }
        }

        return result;
    }
}