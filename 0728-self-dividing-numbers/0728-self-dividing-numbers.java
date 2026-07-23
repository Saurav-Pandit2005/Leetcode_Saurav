class Solution {
    public boolean isSelfDividing(int n) {
        int num = n;
        while(num > 0) {
            int reminder = num%10;
            num /= 10;
            if(reminder == 0 || n%reminder != 0) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(isSelfDividing(i) == true) result.add(i); 
        }
        return result;
    }
}