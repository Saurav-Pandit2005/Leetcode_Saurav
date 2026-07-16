class Solution {
    public double average(int[] salary) {
        // double maxSalary = Integer.MIN_VALUE;
        // double minSalary = Integer.MAX_VALUE;
        // for(int i=0; i<salary.length; i++) {
        //     if(maxSalary < salary[i]) {
        //         maxSalary = salary[i];
        //     }
        // }
        // for(int j=0; j<salary.length; j++) {
        //     if(minSalary > salary[j]) {
        //         minSalary = salary[j];
        //     }
        // }

        double avgSalary = 0;
        Arrays.sort(salary);
        int count = 0;
        for(int i=1; i<salary.length-1; i++) {
            count++;
            avgSalary+= salary[i];
        }
        if(count == 1) return avgSalary;
        return avgSalary /= count;
    }
}