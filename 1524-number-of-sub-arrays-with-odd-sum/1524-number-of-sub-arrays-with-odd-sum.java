class Solution {
    public int numOfSubarrays(int[] arr) {
        // Brute Force - TME

        // ArrayList<Integer> list = new ArrayList<>();
        // int count = 0;
        // int mod = 1000000007;
        // for(int i=0; i<arr.length; i++) {
        //     int sum = 0;
        //     for(int j=i; j<arr.length; j++) {
        //         sum += arr[j];

        //         list.add(sum);
        //     }
        // }
        // for(int k=0; k<list.size(); k++) {
        //     if(list.get(k) % 2 != 0) {
        //         count++;
        //     }
        // }
        // return count % mod;

        int mod = 1000000007;
        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 1;
        int ans = 0;

        for(int num : arr) {
            prefixSum += num;
            if(prefixSum % 2 == 0) {
                ans += oddCount;
                evenCount++;
            } else {
                ans += evenCount;
                oddCount++;
            }
            ans =  ans % mod;
        }
        return ans;
    }
}