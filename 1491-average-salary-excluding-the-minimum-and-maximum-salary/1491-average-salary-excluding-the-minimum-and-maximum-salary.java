class Solution {
    public double average(int[] salary) {
        double avgSalary = 0, count = 0;
        Arrays.sort(salary);
        for(int i=1; i<salary.length-1; i++) {
            count++;
            avgSalary += salary[i];
        }
        if(count == 1) return avgSalary;
        return avgSalary /= count;
    }
}