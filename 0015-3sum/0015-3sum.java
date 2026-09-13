class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute Force    --> Time Limit 

        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0; i<nums.length; i++)
        // for(int j=i+1; j<nums.length; j++)
        // for(int k=j+1; k<nums.length; k++) 
        // if(nums[i] + nums[j] + nums[k] == 0) {
        //     List<Integer> temp = new ArrayList<>();
        //     temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
        //     Collections.sort(temp);
        //     if(!ans.contains(temp)) {
        //         ans.add(temp);
        //     }
        // }
        // return ans;

        // Hashing : a+b+c = 0 (Use a+b = -c method but still give us Time Limit)

        // Sorting + 2 Pointer Approch

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                    ans.add(temp);
                    j++; k--;
                    
                    while(j < k && nums[j] == nums[j-1]) j++; 
                }
            }  
        }
        return ans;
    }
}