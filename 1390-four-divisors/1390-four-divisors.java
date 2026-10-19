class Solution {
    public int sumFourDivisors(int[] nums) {

        int ans = 0;
        
        // TC - O(n2)

        // for(int i=0; i<nums.length; i++) {
        //     int num = nums[i];
        //     int count = 0;
        //     int sum = 0;

        //     for(int div=1; div*div<=num; div++) {
        //         if(num % div == 0) {
        //             count+2;
        //             sum += (div + num/div);
        //         }
        //         if(count > 4) break;
        //     }
        //     if(count == 4 && !perfectSquare(num)) {
        //         ans += sum;
        //     }
        // }
        // return ans;

        // TC - O(n + sqrt(m))

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            int count = 0;
            for(int j=1; j*j<=num; j++) {
                if(num % j == 0) {
                    int div1 = j;
                    int div2 = num/j;

                    if(div1 == div2) {
                        count++;
                        sum += div1;
                    }
                    else {
                        count += 2;
                        sum += (div1 + div2);
                    }
                    if(count > 4) break;
                }
            }
            if(count == 4) ans += sum;
        }
        return ans;
    }
}